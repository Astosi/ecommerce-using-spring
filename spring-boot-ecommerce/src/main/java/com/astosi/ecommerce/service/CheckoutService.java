package com.astosi.ecommerce.service;

import com.astosi.ecommerce.dto.Purchase;
import com.astosi.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
