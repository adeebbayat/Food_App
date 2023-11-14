package com.adeebbayat.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adeebbayat.server.models.Order;
import com.adeebbayat.server.repositories.OrderRepository;



@Service
public class OrderService {
    
    private final OrderRepository orderRepository;

    // ?
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    // Create Order
    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

    // Find All
    public List<Order> allOrders(){
        return orderRepository.findAll();
    }

    // Find One Order
    public Order findOrder(Long id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if(optionalOrder.isPresent()){
            return optionalOrder.get();
        }
        return null;
    }

    // Update Order
    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }

    // Delete Order
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }


}

