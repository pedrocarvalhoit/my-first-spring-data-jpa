package com.pedroduarte.spring.data.jpa.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@AttributeOverrides({ //Ligando as colunas do Student no atributo da classe guardian
        @AttributeOverride(
                name = "name",
                column = @Column(name="guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name="guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name="guardian_mobile")
        )
})
public class Guardian {

    /**Esta classe não é entidadae porque não é uma tabela
     * ela apenas será usada pelo student*/
    private String name;
    private String email;
    private String mobile;
}
