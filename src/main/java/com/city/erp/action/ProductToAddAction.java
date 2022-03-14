package com.city.erp.action;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 14:28
 * @Desc:
 */

import com.city.erp.model.ProductcategoryEntity;
import com.city.erp.service.IProductCategoryService;
import com.city.erp.service.Impl.IProductCategoryServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/product/toadd.do")
public class ProductToAddAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建产品类别业务对象
        IProductCategoryService pc=new IProductCategoryServiceImpl();
        //创建产品类别model对象
        List<ProductcategoryEntity> list = pc.getList();
        System.out.println(list.get(1).getgName());
        request.setAttribute( "ValueA",list);
        request.getRequestDispatcher( "add.jsp").forward(request,response);
        response.sendRedirect("add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
