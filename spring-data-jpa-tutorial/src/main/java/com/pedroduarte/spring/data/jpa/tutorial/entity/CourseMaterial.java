package com.pedroduarte.spring.data.jpa.tutorial.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    private Long courseMaterialId;
    private String url;
    @OneToOne(
            //Creates the course when i am saving Course Material
            cascade = CascadeType.ALL,
           //Will not return this data when call this Class
            fetch = FetchType.LAZY,
            //Need to add a course
            optional = false
        )
    @JoinColumn(
            name = "course_id",
            //Established the link between Classes
            referencedColumnName = "courseId"
    )
    private Course course;


}
