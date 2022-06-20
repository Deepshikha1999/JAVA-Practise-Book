package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Integer>{

}
