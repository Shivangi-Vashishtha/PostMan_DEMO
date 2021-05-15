package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ORM.Address;
import com.example.ORM.Payments_ORM;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long > {

}
