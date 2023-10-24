package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Product;
import com.food.ordering.system.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
    /**
     * Pass {@link Product} list to the restaurant.
     * @param restaurant restaurant
     * @return Restaurant
     */
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
