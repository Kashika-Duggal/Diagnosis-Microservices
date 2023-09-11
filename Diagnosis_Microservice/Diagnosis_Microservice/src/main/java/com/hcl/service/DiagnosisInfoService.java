package com.hcl.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.repository.DiagnosisInfoRepository;
import com.hcl.entity.DiagnosisInfo;

@Service
public class DiagnosisInfoService {

	@Autowired
	DiagnosisInfoRepository diagnosisInfoRepository;
	
	public String addDiagnosisInfo(DiagnosisInfo diagnosis) {
		
		diagnosisInfoRepository.save(diagnosis);
		
		return "Diagnosis Record Added Successfully";
		
	}

	public DiagnosisInfo getDiagnosisById(String diagnosisId) {
		
		Optional<DiagnosisInfo> diagnosis = diagnosisInfoRepository.findById(diagnosisId);
		
		if(diagnosis.isPresent()) {
			
			return diagnosis.get();
		}
		return null;
		
	}
}
