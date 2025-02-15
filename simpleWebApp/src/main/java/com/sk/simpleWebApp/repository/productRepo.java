package com.sk.simpleWebApp.repository;

import com.sk.simpleWebApp.product.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product,Integer> {


}
