package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ORM.Payments_ORM;
import com.sun.xml.bind.v2.model.core.ID;

// JpaRepository --> is a combination of two repositories  (CrudRepository and PagingAndSortingRepository)
// crudRepositry--> select,insert,delete,etc    PagingAndSortingRepository-->paging and sorting operations

 // we cannot provide int,fload in JPA repository as it takes wrapper class object not primitive datatypes

@Repository   // to identify that this is not a class---this is repository
public interface Payments_ORM_Repository extends JpaRepository<Payments_ORM, Long > {

}
