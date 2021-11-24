package com.master.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.master_class.Material_Master_Spare_Parts_Final;
import com.master_data.config.config.ExcelHelper;
import com.master_data_to_repository.repo.Material_Master_Spare_Parts_Final_Repo;

@Service
public class Excell_Service {
	
	@Autowired
	private Material_Master_Spare_Parts_Final_Repo excel_Repo;
	
	public void save(MultipartFile file)
	{
		
		try {
			List<Material_Master_Spare_Parts_Final> listOfData = ExcelHelper.conevrtExcelToListOfData(file.getInputStream());
			this.excel_Repo.saveAll(listOfData);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public List<Material_Master_Spare_Parts_Final> getAll_Spare_Parts()
	{
		return this.excel_Repo.findAll();
		
	}

}
