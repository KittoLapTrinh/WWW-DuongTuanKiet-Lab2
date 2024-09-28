package backend.test;

import backend.repositories.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MainApp {
    public static void main(String[] args) {
        EntityManager entityManager = ConnectDB.getInstance().getEntityManagerFactory().createEntityManager();
        entityManager.close();
    }
}
