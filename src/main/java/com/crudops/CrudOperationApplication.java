package com.crudops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.crudops.dao.UserRepository;
import com.crudops.entities.User;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(CrudOperationApplication.class, args);
		UserRepository userRepository=Context.getBean(UserRepository.class);
		
//		User user=new User();
//		user.setName("Veerendra");
//		user.setCity("Indore");
//		user.setStatus("I am learning sp boot");
		
		//create single user
//		User user1=new User();
//		user1.setName("syam");
//		user1.setCity("Indore");
//		user1.setStatus("I am learning crud ops in boot");
		//User u1=userRepository.save(user1);
		//create multiple user 
//		User user2=new User();
//		user2.setName("ram syam");
//		user2.setCity("Bhopal");
//		user2.setStatus("I am learning crud ops");
		//User u2=userRepository.save(user2);
		
//		List<User> list1=new ArrayList<User>();
//		list1.add(user1);
//		//list1.add(user);
//		list1.add(user2);
//		Iterable<User> users = userRepository.saveAll(list1);
//		users.forEach(res->{
//			System.out.println(res);
//		});
		
		//updating user data or finding data by id
//		Optional<User> udata = userRepository.findById(253);
//		User user = udata.get();
//		user.setName("mohan lal");
//		user.setCity("bhopal");
//		User save = userRepository.save(user);
		
		//find all data with findAll()
		//Iterable<User> all = userRepository.findAll();
//		all.forEach(res->{
//			System.out.println(res);
//		});
		//other way to getting data
//		Iterator<User> itr = all.iterator();
//		while(itr.hasNext()) {
//			User next = itr.next();
//			System.out.println(next);
//		}
		
		//delete user
		//userRepository.deleteById(252);
		//delete all user by iterator
//		Iterable<User> users = userRepository.findAll();
//		users.forEach(user->System.out.println(user));
//		userRepository.deleteAll(users);
		//List<User> findByName = userRepository.findByName("syam");
		//List<User> findByNameAndCity = userRepository.findByNameAndCity("syam", "Indore");
//		List<User> findbyCity = userRepository.findByCity("Bhopal");
//		findbyCity.forEach(user->System.out.println(user));
//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(e->System.out.println(e));
		
		List<User> userByName = userRepository.getUserByName("ram syam");
		System.out.println(userByName);
		System.out.println("done.........");
		List<User> getusers = userRepository.getusers();
		getusers.forEach(e->System.out.println(e));
		
		
	}

}
