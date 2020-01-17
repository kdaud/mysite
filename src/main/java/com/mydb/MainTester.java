package com.mydb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTester {
    public static void main(String[] args) {
        School obj = new School();
        obj.setId(101);
        obj.setSchlName("BASS");
        obj.setDistrict("Luweero");
        obj.setRating(37.5);

        Configuration  con= new Configuration().configure().addAnnotatedClass(School.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
        session.close();


    }
}
