package com.ibm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Train;
import com.ibm.repo.TrainRepository;
@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository repo;
	
	@Override
	public int addTrain(Train t) {
		// TODO Auto-generated method stub
		repo.save(t);
		return t.getTcode();
	}

	@Override
	public Train getTrain(int tcode) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		Train t = repo.findById(tcode).orElseThrow(()->new IllegalArgumentException("Invalid Train Code:"+tcode));
		return t;
	}

	@Override
	public Collection<Train> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteTrain(int tcode) {
		// TODO Auto-generated method stub
		repo.deleteById(tcode);

	}

	@Override
	public void updateTrain(Train t) {
		// TODO Auto-generated method stub
		repo.save(t);
	}

}
