package com.astosi.ecommerce.dto;

import com.astosi.ecommerce.entity.Address;
import com.astosi.ecommerce.entity.Customer;
import com.astosi.ecommerce.entity.Order;
import com.astosi.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
