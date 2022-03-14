package com.city.erp.factory;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 14:01
 * @Desc:
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
    public static SessionFactory sf = null;

    public static SessionFactory getSessionFactory() {
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.configure();
            sf = cfg.buildSessionFactory();
        }
        return sf;
    }
}
