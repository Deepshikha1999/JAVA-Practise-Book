package com.ibm.service;

import java.util.Collection;

import com.ibm.entity.Train;


public interface TrainService {

	int addTrain(Train t);
	
	Train getTrain(int tcode) throws IllegalArgumentException;
	
	Collection<Train> getAll();
	
	void deleteTrain(int tcode);
	
	void updateTrain(Train t);
}
