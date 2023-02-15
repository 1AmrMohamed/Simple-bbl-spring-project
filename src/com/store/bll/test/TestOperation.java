package com.store.bll.test;

import com.store.beans.ProductBean;
import com.store.bll.StoreGetway;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOperation {

    public static void main(String[] args) {
        /*
        StoreGetway getway = new StoreGetway();
        ProductBean productBean = new ProductBean();
        productBean.setProductId(1);
        productBean.setProductName("product 1");
        productBean.setProductPrice(11);
        productBean.setProductQty(111);
        getway.insertProduct(productBean);*/
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/store/bll/config/bll-spring-context.xml");
        StoreGetway storeGetway = context.getBean("storeGetway", StoreGetway.class);
        ProductBean bean = new ProductBean();
        bean.setProductId(2);
        bean.setProductName("Product 2");
        bean.setProductPrice(22);
        bean.setProductQty(222);
        storeGetway.insertProduct(bean);
    }
}
