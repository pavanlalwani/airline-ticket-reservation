package com.org;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.org.dao.UserDao;
import com.org.models.User;
import com.org.service.UserService;

@SpringBootTest
class UserTest {
	
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserDao dao;

	@Test
	void testaddUser() {
		User user = new User();
		user.setUsername("tarun");
		user.setEmail("someone@example.com");
		user.setPassword("12345678");
		when(dao.save(user)).thenReturn(user);
		ResponseEntity<?> createduser = userService.createUser(user);
		assertEquals(user, createduser.getBody());
	}

}
