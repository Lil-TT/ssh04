/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 15:52
 * @Desc:
 */

import com.city.erp.model.ProductcategoryEntity;
import com.city.erp.service.IProductCategoryService;
import com.city.erp.service.Impl.IProductCategoryServiceImpl;
import org.junit.Test;

import java.util.List;

public class testDemo {
    @Test
    public void testProduct() {
        //创建实例对象
        List<ProductcategoryEntity> dm = null;
        //取得业务层对象
        IProductCategoryService ps=new IProductCategoryServiceImpl();
        try {
            dm = ps.getList();
        } catch (Exception e) {

            e.printStackTrace();
        }

        for (ProductcategoryEntity productcategoryEntity : dm) {

            System.out.println(productcategoryEntity.getgName());

        }
    }
}
