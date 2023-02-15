package com.store.bll.impl;

import com.store.beans.ProductBean;
import com.store.bll.managers.MenuManager;
import com.store.bll.transformers.ProductTransformer;
import com.store.dal.dao.ProductDAO;
import com.store.dal.entities.Product;
import com.store.dal.managers.HibernateDBManager;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MenuManagerImpl implements MenuManager {

    // ProductTransformer productTransformer = new ProductTransformer();
    // ProductDAO productDAO = new ProductDAO();
    @Autowired
    ProductTransformer productTransformer;
    @Autowired
    ProductDAO productDAO;

    public ProductTransformer getProductTransformer() {
        return productTransformer;
    }

    public void setProductTransformer(ProductTransformer productTransformer) {
        this.productTransformer = productTransformer;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    @Transactional
    public ProductBean insertProduct(ProductBean productBean) {
        Product product = null;
        product = productDAO.add(productTransformer.transformBeanToEntity(productBean));
        return productTransformer.transformEntityToBean(product);
    }

    @Override
    @Transactional
    public ArrayList<ProductBean> showProducts() {
        // List<Product> findList = productDAO.findList();
        // return findList;
        return null;
    }

    @Override
    public ProductBean buyProduct() {
        return null;
    }

}
