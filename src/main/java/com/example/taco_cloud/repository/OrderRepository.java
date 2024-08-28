package com.example.taco_cloud.repository;

import com.example.taco_cloud.entity.TacoOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
            String deliveryTo, String deliveryCity);

    List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);

    @Query("Order o where o.deliveryCity=’Seattle’")
    List<TacoOrder> readOrdersDeliveredInSeattle();
}