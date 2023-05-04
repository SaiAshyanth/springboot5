package com.diseaseDatabase.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Disease;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease,Integer> 
{
	List<Disease> findByNameStartingWith(String prefix);
	List<Disease> findByNameEndingWith(String suffix);
	List<Disease> findByCountry(String country);
	//positional parameter,order should match
			@Query("select d from Disease d where d.country=?1 and d.name=?2")
		     public List<Disease> getDiseaseByCountry(String country,String name);
	        //named parameter
	        @Query("select d from Disease d where d.country=:country")
		    public List<Disease> getDiseaseByCountry(String country);
			//DML
			@Modifying
			@Query("delete from Disease d where d.name=?1")
			public int deleteDiseaseByName(String name);
	        @Modifying
	        @Query("update Disease d set d.country=?1 where d.name=?2")
	        public int updateDiseaseByName(String country,String name);
	        @Query(value="select * from Disease d where d.country=?",nativeQuery=true)
	        public List<Disease> fetchDiseaseByCountry(String country);

}
