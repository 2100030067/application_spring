package com.infy.Fa1;

import java.util.List;

public interface FaService {
	 List<FaEntity> getAllAnnotations();

	 void saveAnnotation(FaEntity annotation);

}
