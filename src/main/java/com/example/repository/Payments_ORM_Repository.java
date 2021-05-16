package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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


@Query("from Payments_ORM where ben_name IN :benNames")
List<Payments_ORM> getByBenNameIn (List<String> benNames);

@Query("from Payments_ORM where ben_name=:benName and ben_Account= :benAccount" )
List<Payments_ORM> getByBenAccountAndBenName(String benAccount,String benName);

//List<Payments_ORM> findByAddressCity(String city);-->GetByCity/meerut


//select * from payments_orm s,address a where s.address_id=a.id and a.city='meerut';
@Query("from Payments_ORM where address.city= :city")
List<Payments_ORM> getByAddressCity(String city);
}
