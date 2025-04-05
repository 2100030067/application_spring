package com.infy.Fa1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaServiceImpl implements FaService {

    @Autowired
    private FaRepo faRepo;

    @Override
    public List<FaEntity> getAllAnnotations() {
        return (List<FaEntity>) faRepo.findAll();
    }

	@Override
	public void saveAnnotation(FaEntity annotation) {
		faRepo.save(annotation);
	}
}
