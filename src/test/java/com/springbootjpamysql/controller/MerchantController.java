package com.springbootjpamysql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpamysql.dto.MerchantDto;
import com.springbootjpamysql.model.Merchant;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	@PostMapping("/create")
	public Merchant create(@RequestBody MerchantDto request) {
		return null;
	}
	
	@PutMapping("/update/:id")
	public Merchant update(@PathVariable Long id, @RequestBody MerchantDto request) {
		return null;
	}
	
	@GetMapping("/all")
	public List<Merchant> getAll() {
		return null;
	}
	
	@DeleteMapping("/delete/:id") 
	public Boolean delete(@PathVariable Long id) {
		return null;
	}

}
