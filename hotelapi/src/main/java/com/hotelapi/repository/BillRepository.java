package com.hotelapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapi.entity.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
