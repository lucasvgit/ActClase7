/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my.company.actclase6;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class NewMain {

    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProservicesPU");

        
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            
            entityManager.getTransaction().begin();

            
            List<Servicio> servicios = entityManager.createQuery("SELECT s FROM Servicio s", Servicio.class).getResultList();
            for (Servicio servicio : servicios) {
                System.out.println("Servicio: " + servicio.getNombre());
                for (Tarea tarea : servicio.getTareas()) {
                    System.out.println("  Tarea: " + tarea.getDescripcion());
                }
            }

        
            entityManager.getTransaction().commit();

        } catch (Exception e) {
           
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
