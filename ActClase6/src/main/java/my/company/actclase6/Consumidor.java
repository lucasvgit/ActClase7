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
import java.util.List;

@Entity
public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String foto;

    @OneToMany(mappedBy = "consumidor", cascade = CascadeType.ALL)
    private List<ContactoConsumidor> contactos;

    @OneToMany(mappedBy = "consumidor", cascade = CascadeType.ALL)
    private List<Trabajo> trabajos;

   
}