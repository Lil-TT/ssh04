package com.city.erp.action;
/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 18:22
 * @Desc:
 */


import com.city.erp.model.UfkProductEntity;
import com.city.erp.service.IProductService;
import com.city.erp.service.Impl.IProductServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/product/add.do")
public class ProductAddAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String stock=request.getParameter("stock");
        String tid=request.getParameter("tid");
        //封装Model对象
        UfkProductEntity se=new UfkProductEntity();
        se.setPno(1);
        se.setPname(name);
        se.setPrice(Double.valueOf(price));
        se.setQty(Integer.valueOf(stock));
        se.setGno(Integer.valueOf(tid));

        //取得业务层对象
        IProductService ps=new IProductServiceImpl();

        try {
            ps.add(se);

        } catch (Exception e) {

            e.printStackTrace();
        }

        response.sendRedirect("toadd.do");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
