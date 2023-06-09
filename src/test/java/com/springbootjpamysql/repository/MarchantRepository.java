package com.springbootjpamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpamysql.model.Merchant;

public interface MarchantRepository extends JpaRepository<Merchant, Long>{

}
