package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.DiagnosisInfo;


@Repository
@RequestMapping("/DiagnosisInfo")
public interface DiagnosisInfoRepository extends CrudRepository<DiagnosisInfo, String> {

}
