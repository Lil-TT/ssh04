package com.city.erp.service;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 14:11
 * @Desc:
 */

import com.city.erp.model.ProductcategoryEntity;

import java.util.List;

public interface IProductCategoryService {
    List<ProductcategoryEntity> getList();
}
