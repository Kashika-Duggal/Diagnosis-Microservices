package com.hcl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiagnosisInfo {
	
	@Id
	private String diagnosisId;
	private String doctorId;
	private String diseaseName;
	

}
