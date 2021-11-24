package com.master_data_to_repository.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master_class.Material_Master_Spare_Parts_Final;

@Repository
public interface Material_Master_Spare_Parts_Final_Repo extends JpaRepository<Material_Master_Spare_Parts_Final, String>{
	
	
	
}
