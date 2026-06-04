//package com.util;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//public class SessionFactoryConnection {
//	public static SessionFactory getSessionFactory() {
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();
//		return factory;
//	}
//}

package com.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.service.Lav;

public class SessionFactoryConnection {
	static SessionFactory factory = null;
    public static SessionFactory getSessionFactory(){
		if(factory == null){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Lav.class);
        factory = cfg.buildSessionFactory();

        return factory;
    		}else {
    			return factory;
    		}
    }

}
