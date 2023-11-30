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
import java.util.Date;
import java.util.List;

@Entity
public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "prestador_id")
    private Prestador prestador;

    @ManyToOne
    @JoinColumn(name = "consumidor_id")
    private Consumidor consumidor;

    private Date fecha;
    private String lugar;
    private String rangoHorario;
    private Double precio;
    private boolean contratoAceptado;
    private boolean finalizado;

    @OneToMany(mappedBy = "trabajo", cascade = CascadeType.ALL)
    private List<Calificacion> calificaciones;

}
