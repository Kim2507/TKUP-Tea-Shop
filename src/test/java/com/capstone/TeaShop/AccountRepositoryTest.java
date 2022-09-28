package com.capstone.TeaShop;


import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.test.annotation.Rollback;

import com.capstone.TeaShop.model.User;
import com.capstone.TeaShop.repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)

public class AccountRepositoryTest {
	@Autowired
	private UserRepository user_repo;
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateAccount() {
		User acc = new User();
		acc.setEmail("chris@gmail.com");
		acc.setPassword("321defew");
		
		User savedAcc = user_repo.save(acc);
		User existedAcc = entityManager.find(User.class, savedAcc.getUid());
		
		assertThat(existedAcc.getEmail()).isEqualTo(acc.getEmail());
		
	}
	
//	@Test
//	public void testFindUserEmail() {
//		String email = "chris@gmail.com";
//		User user = user_repo.findByEmail(email);
//		assertThat(user).isNotNull();
//	}
	

}
