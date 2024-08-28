package com.example.taco_cloud.repository;

import com.example.taco_cloud.entity.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}