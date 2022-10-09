package com.kim.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kim.TeaShop.model.OrderDetails;
@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

}
