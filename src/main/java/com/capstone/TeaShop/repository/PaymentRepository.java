package com.capstone.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.TeaShop.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
