/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.actclase6.DAO;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class MyEntityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveOrUpdate(Object entity) {
        entityManager.merge(entity);
    }

 
}
