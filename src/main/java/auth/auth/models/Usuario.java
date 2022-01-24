package auth.auth.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.naming.factory.SendMailFactory;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@EqualsAndHashCode
public class Usuario {

    @Id
    @Setter     @Getter     @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter     @Getter     @Column(name = "nombre")
    private String nombre;
    @Setter     @Getter     @Column(name = "apellido")
    private String apellido;
    @Setter     @Getter     @Column(name = "email")
    private String email;
    @Setter     @Getter     @Column(name = "telefono")
    private String telefono;
    @Setter     @Getter     @Column(name = "password")
    private String password;


}