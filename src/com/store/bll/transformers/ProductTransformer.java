package com.store.bll.transformers;

import com.store.beans.ProductBean;
import com.store.dal.entities.Product;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class ProductTransformer {

    public ProductBean transformEntityToBean(Product productEntity) {
        if (productEntity == null) {
            return null;
        }
        ProductBean productBean = new ProductBean();
        // Transform
        productBean.setProductId(productEntity.getProductId().intValue());
        productBean.setProductName(productEntity.getProductName());
        productBean.setProductPrice(productEntity.getProductPrice().intValue());
        productBean.setProductQty(productEntity.getProductQty().intValue());
        productBean.setTotalPrice(productEntity.getProductPrice().intValue() * productEntity.getProductQty().intValue());
        return productBean;
    }

    public Product transformBeanToEntity(ProductBean productBean) {
        if (productBean == null) {
            return null;
        }
        Product product = new Product();
        product.setProductId(new BigDecimal(productBean.getProductId()));
        product.setProductName(productBean.getProductName());
        product.setProductPrice(new BigDecimal(productBean.getProductPrice()));
        product.setProductQty(new BigDecimal(productBean.getProductQty()));
        return product;
    }
}
