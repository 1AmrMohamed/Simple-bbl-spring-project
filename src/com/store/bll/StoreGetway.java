package com.store.bll;

import com.store.beans.ProductBean;
import com.store.bll.impl.MenuManagerImpl;
import com.store.bll.managers.MenuManager;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "storeGetway")
public class StoreGetway {

    @Autowired(required = true)
    MenuManager menuManager = null;

    public MenuManager getMenuManager() {
        return menuManager;
    }

    public void setMenuManager(MenuManager menuManager) {
        this.menuManager = menuManager;
    }

    public StoreGetway() {
        // menuManager = new MenuManagerImpl();
    }

    public ProductBean insertProduct(ProductBean productBean) {
        return menuManager.insertProduct(productBean);
    }

    public ArrayList<ProductBean> showProducts() {
        return menuManager.showProducts();
    }

    public ProductBean buyProduct() {
        return menuManager.buyProduct();
    }

}
