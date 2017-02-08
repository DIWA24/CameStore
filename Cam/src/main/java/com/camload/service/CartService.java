package com.camload.service;

import com.camload.model.Cart;


public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
