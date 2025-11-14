package org.practice.springboot_demo.repository;

import org.practice.springboot_demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
