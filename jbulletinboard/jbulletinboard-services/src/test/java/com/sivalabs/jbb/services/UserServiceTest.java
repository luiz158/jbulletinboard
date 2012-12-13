package com.sivalabs.jbb.services;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sivalabs.jbb.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserServiceTest
{
	@Autowired
	private UserService userService;
	
	
	@Test
	@Ignore
	public void createUser()
	{
		User user = new User();
		user.setUserName("admin");
		user.setPassword("admin");
		user.setName("Administrator");
		user.setEmail("admin@gmail.com");
		user.setCreatedOn(new Date());

		User createdUser = userService.createUser(user);
		assertNotNull(createdUser);
		assertNotNull(createdUser.getUserId());
		
	}
	
	@Test
	public void getUser()
	{
		User user = userService.getUserById(1);
		assertNotNull(user);
		System.err.println(user);
		/*Set<Topic> topics = user.getTopics();
		for (Topic topic : topics)
		{
			System.err.println(topic.getTitle());
		}*/
	}
	
	@Test
	public void testFindAllusers() 
	{
		List<User> users = userService.findAllUsers();
		assertNotNull(users);
		for (User user : users) {
			System.err.println(user);
		}
	}
}
