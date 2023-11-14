package com.adeebbayat.server.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adeebbayat.server.models.Order;
import com.adeebbayat.server.models.User;
import com.adeebbayat.server.services.ItemService;
import com.adeebbayat.server.services.OrderService;
import com.adeebbayat.server.services.PaymentService;
import com.adeebbayat.server.services.RestaurantService;
import com.adeebbayat.server.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class FoodAPI {

    @Autowired
    UserService userService;

    @Autowired
    ItemService itemService;

    @Autowired
    OrderService orderService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("")
    public String home() {
        return "Welcome to my REST API!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
    List<User> users = userService.allUsers();
    return users;}

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
    List<Order> orders = orderService.allOrders();
    return ResponseEntity.ok(orders);

    
}


} 

