package com.city.erp.service.Impl;

import com.city.erp.factory.HibernateFactory;
import com.city.erp.model.UfkProductEntity;
import com.city.erp.service.IProductService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 14:26
 * @Desc:
 */

public class IProductServiceImpl implements IProductService {
    @Override
    public void add(UfkProductEntity pm) {
        SessionFactory sf= HibernateFactory.getSessionFactory();
        //创建Session
        Session session=sf.openSession();
        //开启事务
        Transaction tx=session.beginTransaction();
        //完成Model对象增加记录到表中
        session.save(pm);
        //提交事务
        tx.commit();
        //关闭session
        session.close();
    }
}
