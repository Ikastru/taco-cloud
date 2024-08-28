package com.example.taco_cloud.repository;

import com.example.taco_cloud.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    TacoOrder save(TacoOrder order);
}