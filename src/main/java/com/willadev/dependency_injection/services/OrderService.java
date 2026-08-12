package com.willadev.dependency_injection.services;

import com.willadev.dependency_injection.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return (order.getBasic() * ((100 - order.getDiscount()) / 100)) + shippingService.shipment(order);
    }
}
