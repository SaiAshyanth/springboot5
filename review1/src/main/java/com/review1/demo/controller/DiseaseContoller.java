package com.review1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review1.demo.model.Disease;
import com.review1.demo.service.DiseaseService;
@RestController
public class DiseaseContoller {
	  
      @Autowired
      DiseaseService disService;
      @GetMapping("/displaydis")
      public List<Disease> getAllDiseases()
      {
    	  List<Disease> disList=disService.getAllDisease();
    	  return disList;
      }
      @PostMapping(value="/postdis")
      public Disease saveDisease(@RequestBody Disease d)
      {
    	  return disService.saveDisease(d);
      }
      @PutMapping(value="/putdis")
      public Disease updateDisease(@RequestBody Disease d)
      {
    	  return disService.updateDisease(d);
      }
      @DeleteMapping(value="/deletedis/{num}")
      public void deleteDisease(@PathVariable("num") int num)
      {
    	  disService.deleteDisease(num);
      }
}
