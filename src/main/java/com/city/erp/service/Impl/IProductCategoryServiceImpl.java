package com.city.erp.service.Impl;

import com.city.erp.factory.HibernateFactory;
import com.city.erp.model.ProductcategoryEntity;
import com.city.erp.service.IProductCategoryService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 14:12
 * @Desc:
 */

public class IProductCategoryServiceImpl implements IProductCategoryService {
    @Override
    public List<ProductcategoryEntity> getList() {
        SessionFactory sf= HibernateFactory.getSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Query<ProductcategoryEntity> query=session.createQuery("from ProductcategoryEntity",ProductcategoryEntity.class);
        List<ProductcategoryEntity> list=query.getResultList();
        tx.commit();
        session.close();
        return list;
    }

}
