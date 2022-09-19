package com.pedroduarte.spring.data.jpa.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //Assim ela se torna EMBEDDABLE
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name="guardian_name")
        )
})
public class Guardian {

    /**Esta classe não é entidadae porque não é uma tabela
     * ela apenas será usada pelo student*/
    private String name;
    private String email;
    private String mobile;
}
