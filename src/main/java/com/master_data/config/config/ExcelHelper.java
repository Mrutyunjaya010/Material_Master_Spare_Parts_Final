package com.master_data.config.config;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;


import com.master_class.Material_Master_Spare_Parts_Final;




public class ExcelHelper {
	
	
	public static boolean checkExcelFormat(MultipartFile file)
	{
		String contentType=file.getContentType();
		
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
			return true;
		else
			return false;
	}
	
	
	public static List<Material_Master_Spare_Parts_Final> conevrtExcelToListOfData(InputStream inputStream){
		
		List<Material_Master_Spare_Parts_Final> list=new ArrayList<>();
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
						
			Iterator<Sheet> iterator2 = workbook.iterator();
			
			while(iterator2.hasNext()) 
			{
				
				
				XSSFSheet sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
				int rowNumber = 0;
				java.util.Iterator<Row> iterator = sheet.iterator();
				
				while(iterator.hasNext())
				{
					Row row=iterator.next();
					
					if(rowNumber==0)
					{
						rowNumber++;
						continue;
					}
					java.util.Iterator<Cell> cells = row.iterator();
					
					int cid=0;
					Material_Master_Spare_Parts_Final d=new Material_Master_Spare_Parts_Final();
					
					while (cells.hasNext())
					{
						Cell cell = cells.next();
						
						switch(cid)
						{
						case 0:
							d.setPartId(cell.getStringCellValue());
							break;
						case 1:
							d.setPartNumber(cell.getStringCellValue());
							break;
						case 2:
							d.setDescription(cell.getStringCellValue());
							break;
						case 3:
							d.setReplacedByPartNumber(cell.getStringCellValue());
							break;
						case 4:
							d.setReplacesNumber(cell.getStringCellValue());
							break;
						case 5:
							d.setSource(cell.getStringCellValue());
							break;
						case 6:
							d.setSalesUnit(cell.getStringCellValue());	
							break;	
						case 7:
							d.setListPrice(cell.getNumericCellValue());
							break;
						case 8:
							d.setPartCost(cell.getNumericCellValue());
							break;
						case 9:
							d.setCurrency(cell.getStringCellValue());
							break;
						case 10:
							d.setPartType(cell.getStringCellValue());
							break;
						case 11:
							d.setUsage(cell.getStringCellValue());
							break;
						case 12:
							d.setAvailability(cell.getStringCellValue());
							break;
						case 13:
							d.setStatus(cell.getStringCellValue());
							break;
						case 14:
							d.setPartComplexity(cell.getStringCellValue());
							break;
						case 15:
							d.setPartUsage((int)cell.getNumericCellValue());
							break;
						case 16:
							d.setDemand(cell.getStringCellValue());
							break;
						case 17:
							d.setEvaluationType(cell.getStringCellValue());
							break;
						case 18:
							d.setBECCode(cell.getStringCellValue());
							break;
						case 19:
							d.setMaterialGroup(cell.getStringCellValue());
							break;
						case 20:
							d.setERPMaterialNumber(cell.getStringCellValue());
							break;
						case 21:
							d.setLegacyMaterial(cell.getStringCellValue());
							break;
						case 22:
							d.setAlternativePart(cell.getStringCellValue());
							break;
						default:
							break;
						}
						cid++;
					}
					
					list.add(d);
				}
				
				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}

}
