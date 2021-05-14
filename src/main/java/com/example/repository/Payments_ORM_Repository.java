package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ORM.Payments_ORM;
import com.example.request_POST.InClause;
import com.sun.xml.bind.v2.model.core.ID;
import java.lang.String;

// JpaRepository --> is a combination of two repositories  (CrudRepository and PagingAndSortingRepository)
// crudRepositry--> select,insert,delete,etc    PagingAndSortingRepository-->paging and sorting operations

 // we cannot provide int,float in JPA repository as it takes wrapper class object not primitive datatypes

@Repository   // to identify that this is not a class---this is repository
public interface Payments_ORM_Repository extends JpaRepository<Payments_ORM, Long > {
	
List<Payments_ORM> findByBenAccount(String benAccount);
List<Payments_ORM> findByBenAccountAndBenName(String benAccount,String benName);
List<Payments_ORM> findByBenAccountOrBenName(String benAccount,String benName);
List<Payments_ORM> findByBenNameIn (List<String> benNames);
}
