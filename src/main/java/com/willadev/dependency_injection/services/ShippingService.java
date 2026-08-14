package com.willadev.dependency_injection.services;

import com.willadev.dependency_injection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double result;

        if (order.getBasic() >= 200.00) {
            result = 0.0;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.00) {
            result = 12.00;
        } else {
            result = 20.00;
        }

        return result;
    }
}
