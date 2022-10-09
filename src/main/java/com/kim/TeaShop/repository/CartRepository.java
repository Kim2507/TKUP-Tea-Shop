package com.kim.TeaShop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kim.TeaShop.model.*;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	public Cart findByUser(User user);

}
