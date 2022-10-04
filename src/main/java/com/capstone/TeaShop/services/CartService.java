package com.capstone.TeaShop.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.capstone.TeaShop.model.Cart;
import com.capstone.TeaShop.repository.CartRepository;



public class CartService{
	@Autowired
	CartRepository cart_repo;

	
}
