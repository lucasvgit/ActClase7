/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase6;

/**
 *
 * @author Irma
 */
import javax.persistence.*;

@Entity
public class ContactoPrestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "prestador_id")
    private Prestador prestador;

    private String telefono;
    private String email;

}
