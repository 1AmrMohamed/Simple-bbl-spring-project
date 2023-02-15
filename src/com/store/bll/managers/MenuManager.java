package com.store.bll.managers;

import com.store.beans.ProductBean;
import java.util.ArrayList;

public interface MenuManager {

    public ProductBean insertProduct(ProductBean productBean);

    public ArrayList<ProductBean> showProducts();

    public ProductBean buyProduct();
}
