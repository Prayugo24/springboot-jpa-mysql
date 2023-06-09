package com.springbootjpamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpamysql.model.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
