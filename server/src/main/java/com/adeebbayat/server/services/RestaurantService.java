package com.adeebbayat.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adeebbayat.server.models.Restaurant;
import com.adeebbayat.server.repositories.RestaurantRepository;





@Service
public class RestaurantService {
    
    private final RestaurantRepository restaurantRepository;

    // ?
    public RestaurantService(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    // Create Restaurant
    public Restaurant addRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    // Find All
    public List<Restaurant> allRestaurants(){
        return restaurantRepository.findAll();
    }

    // Find One Restaurant
    public Restaurant findRestaurant(Long id){
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
        if(optionalRestaurant.isPresent()){
            return optionalRestaurant.get();
        }
        return null;
    }

    // Update Restaurant
    public Restaurant updateRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    // Delete Restaurant
    public void deleteRestaurant(Long id){
        restaurantRepository.deleteById(id);
    }


}

