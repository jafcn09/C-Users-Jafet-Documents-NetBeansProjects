
package com.demo.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_cliente;
    
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    
}
