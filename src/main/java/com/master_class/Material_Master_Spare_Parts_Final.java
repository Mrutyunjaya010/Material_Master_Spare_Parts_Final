package com.master_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Material_Master_Spare_Parts_Final")
public class Material_Master_Spare_Parts_Final {
	
	@Id
	@Column(name="PartId")
	private String PartId;
	
	@Column(name="PartNumber")
	private String PartNumber;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="ReplacedByPartNumber")
	private String ReplacedByPartNumber;
	
	@Column(name="ReplacesNumberReplacesNumber")
	private String ReplacesNumber;
	
	@Column(name="Source")
	private String Source;
	
	@Column(name="SalesUnit")	
	private String SalesUnit;
	
	@Column(name="ListPrice")
	private double ListPrice;
	
	@Column(name="PartCost")
	private double PartCost;
	
	@Column(name="Currency")
	private String Currency;
	
	@Column(name="PartType")
	private String PartType;
	
	@Column(name="Usage")
	private String Usage;
	
	@Column(name="Availability")
	private String Availability;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="PartComplexity")
	private String PartComplexity;
	
	@Column(name="PartUsage")
	private int PartUsage;
	
	@Column(name="Demand")
	private String Demand;
	
	@Column(name="EvaluationType")
	private String EvaluationType;
	
	@Column(name="BECCode")
	private String BECCode;
	
	@Column(name="MaterialGroup")
	private String MaterialGroup;
	
	@Column(name="ERPMaterialNumber")
	private String ERPMaterialNumber;
	
	@Column(name="LegacyMaterial")
	private String LegacyMaterial;
	
	@Column(name="AlternativePart")
	private String AlternativePart;
	
	
	
	
	public Material_Master_Spare_Parts_Final() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Material_Master_Spare_Parts_Final(String partId, String partNumber, String description,
			String replacedByPartNumber, String replacesNumber, String source, String salesUnit, double listPrice,
			double partCost, String currency, String partType, String usage, String availability, String status,
			String partComplexity, int partUsage, String demand, String evaluationType, String bECCode,
			String materialGroup, String eRPMaterialNumber, String legacyMaterial, String alternativePart) {
		super();
		PartId = partId;
		PartNumber = partNumber;
		Description = description;
		ReplacedByPartNumber = replacedByPartNumber;
		ReplacesNumber = replacesNumber;
		Source = source;
		SalesUnit = salesUnit;
		ListPrice = listPrice;
		PartCost = partCost;
		Currency = currency;
		PartType = partType;
		Usage = usage;
		Availability = availability;
		Status = status;
		PartComplexity = partComplexity;
		PartUsage = partUsage;
		Demand = demand;
		EvaluationType = evaluationType;
		BECCode = bECCode;
		MaterialGroup = materialGroup;
		ERPMaterialNumber = eRPMaterialNumber;
		LegacyMaterial = legacyMaterial;
		AlternativePart = alternativePart;
	}
	public String getPartId() {
		return PartId;
	}
	public void setPartId(String partId) {
		PartId = partId;
	}
	public String getPartNumber() {
		return PartNumber;
	}
	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getReplacedByPartNumber() {
		return ReplacedByPartNumber;
	}
	public void setReplacedByPartNumber(String replacedByPartNumber) {
		ReplacedByPartNumber = replacedByPartNumber;
	}
	public String getReplacesNumber() {
		return ReplacesNumber;
	}
	public void setReplacesNumber(String replacesNumber) {
		ReplacesNumber = replacesNumber;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getSalesUnit() {
		return SalesUnit;
	}
	public void setSalesUnit(String salesUnit) {
		SalesUnit = salesUnit;
	}
	public double getListPrice() {
		return ListPrice;
	}
	public void setListPrice(double listPrice) {
		ListPrice = listPrice;
	}
	public double getPartCost() {
		return PartCost;
	}
	public void setPartCost(double partCost) {
		PartCost = partCost;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getPartType() {
		return PartType;
	}
	public void setPartType(String partType) {
		PartType = partType;
	}
	public String getUsage() {
		return Usage;
	}
	public void setUsage(String usage) {
		Usage = usage;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPartComplexity() {
		return PartComplexity;
	}
	public void setPartComplexity(String partComplexity) {
		PartComplexity = partComplexity;
	}
	public int getPartUsage() {
		return PartUsage;
	}
	public void setPartUsage(int partUsage) {
		PartUsage = partUsage;
	}
	public String getDemand() {
		return Demand;
	}
	public void setDemand(String demand) {
		Demand = demand;
	}
	public String getEvaluationType() {
		return EvaluationType;
	}
	public void setEvaluationType(String evaluationType) {
		EvaluationType = evaluationType;
	}
	public String getBECCode() {
		return BECCode;
	}
	public void setBECCode(String bECCode) {
		BECCode = bECCode;
	}
	public String getMaterialGroup() {
		return MaterialGroup;
	}
	public void setMaterialGroup(String materialGroup) {
		MaterialGroup = materialGroup;
	}
	public String getERPMaterialNumber() {
		return ERPMaterialNumber;
	}
	public void setERPMaterialNumber(String eRPMaterialNumber) {
		ERPMaterialNumber = eRPMaterialNumber;
	}
	public String getLegacyMaterial() {
		return LegacyMaterial;
	}
	public void setLegacyMaterial(String legacyMaterial) {
		LegacyMaterial = legacyMaterial;
	}
	public String getAlternativePart() {
		return AlternativePart;
	}
	public void setAlternativePart(String alternativePart) {
		AlternativePart = alternativePart;
	}
	
	

}
