package com.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.master.service.Excell_Service;
import com.master_class.Material_Master_Spare_Parts_Final;
import com.master_data.config.config.ExcelHelper;


@RestController
@CrossOrigin("*")
public class Excel_Controller {
	
	@Autowired
	private Excell_Service excel_Service;
	
	@PostMapping("/Material_Master_Spare_Parts_Final/upload")
	public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file)
	{
		if(ExcelHelper.checkExcelFormat(file))
		{
			this.excel_Service.save(file);
			
			return ResponseEntity.ok("File is Uploaded and data is stored in the DB");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a valid file format");
	}
	
	@GetMapping("/Material_Master_Spare_Parts_Final")
	public List<Material_Master_Spare_Parts_Final> getAllData()
	{
		return this.excel_Service.getAll_Spare_Parts();
	}
	

}
