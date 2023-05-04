package com.diseaseDatabase.demo.controller;

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

import com.diseaseDatabase.demo.model.Disease;
import com.diseaseDatabase.demo.service.DiseaseService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class DiseaseContoller {
	  
      @Autowired
      DiseaseService disService;
      
      @Tag(name="Get Method to get All Diseases",description="Get All Disease info")
      @GetMapping("/displaydis")
      public List<Disease> getAllDiseases()
      {
    	  List<Disease> disList=disService.getAllDisease();
    	  return disList;
      }
      @Tag(name="Post Method to post new disease",description="Post new disease")
      @PostMapping(value="/postdis")
      public Disease saveDisease(@RequestBody Disease d)
      {
    	  return disService.saveDisease(d);
      }
      @Tag(name="Put Method to update Diseases",description="Update Disease info")
      @PutMapping(value="/putdis/{num}")
      public Disease updateDisease(@RequestBody Disease d,@PathVariable("num") int num)
      {
    	  return disService.updateDisease(d,num);
      }
      @Tag(name="Delete Method to delete Diseases",description="Delete Disease info")
      @DeleteMapping(value="/deletedis/{num}")
      public void deleteDisease(@PathVariable("num") int num)
      {
    	  disService.deleteDisease(num);
      }
      @Tag(name="Get Method to Sort All Diseases",description="Sort Disease info")
      @GetMapping("/sortDisease/{name}")
      public List<Disease> sortDisease(@PathVariable("name") String name)
      {
      	return disService.sortDisease(name);
      }
      @Tag(name="Get Method to Paginate All Diseases",description="Paginate Disease info")
      @GetMapping("pagination/{nm}/{sp}")
  	public List<Disease> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
  	{
  		return disService.paginate(num,size);
  	}
      @Tag(name="Get Method to Paginate and Sort All Diseases",description="Paginate and Sort Disease info")
  	@GetMapping("pagination/{nm}/{sp}/{inr}")
  	public List<Disease> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
  	{
  		return disService.paginate(num,size,name);
  	}
      @Tag(name="Get Method to fetch disease by it's Prefix",description="Get Disease info by prefix")
  	@GetMapping("/fetchPrefix")
  	public List<Disease> fetchDiseaseByNamePrefix(@RequestParam String prefix)
  	{
  		return disService.fetchDiseaseByNamePrefix(prefix);
  	}
      @Tag(name="Get Method to fetch disease by it's Suffix",description="Get Disease info by suffix")
  	@GetMapping("/fetchSuffix")
  	public List<Disease> fetchDiseaseByNameSuffix(@RequestParam String suffix)
  	{
  		return disService.fetchDiseaseByNameSuffix(suffix);
  	}
      @Tag(name="Get Method to get All Diseases By Country ",description="Get All Disease info by country")
  	@GetMapping("/fetchCountry")
  	public List<Disease> fetchDiseaseByNameCountry(@RequestParam String country)
  	{
  		return disService.fetchDiseaseByNameCountry(country);
  	}
      @Tag(name="Get Method to get All Diseases by Country and Disease name",description="Get All Disease info by country and name")
  	@GetMapping("/fetchDiseaseByCountry/{country}/{name}")
  	public List<Disease> fetchDiseaseByNameCountry(@PathVariable String country,@PathVariable String name)
  	{
  		return disService.getDiseaseByCountry(country,name);
  	}
      @Tag(name="Delete Method to delete Diseases by it's name",description="Delete Disease info by name")
  	@DeleteMapping("/deleteDiseaseByName/{name}")
    public String deleteDiseaseByName(@PathVariable String name)
    {
 	   int result = disService.deleteDiseaseByName(name);
 	   if(result>0)
 		     return "Disease record deleted";
 	   else
 		     return "Problem occured while deleting";
    }
      @Tag(name="Put Method to Update Disease Country using name",description="Update Disease country using name")
    @PutMapping("/updateDiseaseByName/{country}/{name}")
    public String updateDiseaseByName(@PathVariable String country,String name)
    {
 	   int res = disService.updateDiseaseByName(country, name);
 	   if(res>0)
 		      return "Disease record updated";
 	   else
 		    return "Problem occured";
    }
      @Tag(name="Get Method to Disease by country name",description="Get Disease info by country")
    @GetMapping("/fetchDiseaseByCountryName/{country}")
    public List<Disease> fetchDiseaseByCountry(@PathVariable String country)
    {
  	  return disService.fetchDiseaseByCountry(country);
    }
}
