package com.hcl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.service.DiagnosisInfoService;
import com.hcl.entity.DiagnosisInfo;



@RestController
@RequestMapping("/DiagnosisInfo")
public class DiagnosisInfoController {

	@Autowired
	DiagnosisInfoService diagnosisInfoService;

	@PostMapping("/addInfo")
	public String addDiagnosisInfo(@RequestBody DiagnosisInfo diagnosis) {

		String addStatus = diagnosisInfoService.addDiagnosisInfo(diagnosis);

		return addStatus;
	}
	
	@GetMapping("/getDiagnosis/{diagnosisId}")
		public DiagnosisInfo getDiagnosisById(@PathVariable String diagnosisId) {
		
		DiagnosisInfo diagnosis = diagnosisInfoService.getDiagnosisById(diagnosisId);
		
		return diagnosis;
		
		
	}
}
