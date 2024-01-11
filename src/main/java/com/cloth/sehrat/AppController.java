package com.cloth.sehrat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class AppController {
	
	//Repositories
	@Autowired
	ProductRespository product;
	@Autowired
	UserRepository user;
	
	//Adding User 
//	@PostMapping("/signup")
//	public UserEntity addUser(@RequestBody List<UserEntity> userentity) {
//		return user.save(userentity.get(0));
//	}
	@PostMapping("/signup")
	public UserEntity addUser(@RequestBody UserEntity userentity) {
		return user.save(userentity);
	}
	//Getting User
	@GetMapping("/getAllUsers")
	public List<UserEntity> users(){
		return (List<UserEntity>) user.findAll();
	}
	
	//adding product
	@PostMapping("/addproducts")
	public ProductEntity addProduct(@RequestBody ProductEntity productentity) {
		return product.save(productentity);
	}
	
	//getting product
	@GetMapping("/allproducts")
	public List<ProductEntity> products(){
		return (List<ProductEntity>) product.findAll();
	}
}
