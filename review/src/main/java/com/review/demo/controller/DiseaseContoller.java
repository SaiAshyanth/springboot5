package com.review.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.review.demo.model.Disease;
import com.review.demo.service.DiseaseService;
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
      @PutMapping(value="/putdis/{num}")
      public Disease updateDisease(@RequestBody Disease d,@PathVariable("num") int num)
      {
    	  return disService.updateDisease(d,num);
      }
      @DeleteMapping(value="/deletedis/{num}")
      public void deleteDisease(@PathVariable("num") int num)
      {
    	  disService.deleteDisease(num);
      }
      @GetMapping("/sortDisease/{name}")
      public List<Disease> sortDisease(@PathVariable("name") String name)
      {
      	return disService.sortDisease(name);
      }
      @GetMapping("pagination/{nm}/{sp}")
  	public List<Disease> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
  	{
  		return disService.paginate(num,size);
  	}
  	@GetMapping("pagination/{nm}/{sp}/{inr}")
  	public List<Disease> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
  	{
  		return disService.paginate(num,size,name);
  	}
  	@GetMapping("/fetchPrefix")
  	public List<Disease> fetchDiseaseByNamePrefix(@RequestParam String prefix)
  	{
  		return disService.fetchDiseaseByNamePrefix(prefix);
  	}
  	@GetMapping("/fetchSuffix")
  	public List<Disease> fetchDiseaseByNameSuffix(@RequestParam String suffix)
  	{
  		return disService.fetchDiseaseByNameSuffix(suffix);
  	}
  	@GetMapping("/fetchCountry")
  	public List<Disease> fetchDiseaseByCountry(@RequestParam String country)
  	{
  		return disService.fetchDiseaseByCountry(country);
  	}

}
