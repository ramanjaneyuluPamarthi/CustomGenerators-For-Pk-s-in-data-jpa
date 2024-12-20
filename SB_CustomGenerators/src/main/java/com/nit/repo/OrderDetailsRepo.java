package com.nit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.OrderDetailsEntity;

@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetailsEntity, Serializable >
{

}
