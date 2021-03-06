package com.asoinspiration.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Lazy;

import com.alibaba.fastjson.annotation.JSONField;


@Entity
@Table(name="EXPORT_PRODUCT_C")
@DynamicUpdate(true)
@DynamicInsert(true)
public class ExportProduct implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EXPORT_PRODUCT_ID")
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String id;	  	
	
	@ManyToOne
	@JoinColumn(name="EXPORT_ID")
	private Export export;			//报运货物和报运的关系，多对一
	
	@ManyToOne
	@JoinColumn(name="FACTORY_ID")
	private Factory factory;		//报运货物和厂家的关系，多对一
	
	@OneToMany(mappedBy="exportProduct",cascade=CascadeType.ALL)
	private Set<ExtEproduct> extEproducts;		//报运货物和报运附件的关系，一对多

	@Column(name="PRODUCT_NO")
	private String productNo;		
	@Column(name="PACKING_UNIT")
	private String packingUnit;			//PCS/SETS
	@Column(name="CNUMBER")
	private Integer cnumber;
	@Column(name="BOX_NUM")
	private Integer boxNum;
	@Column(name="GROSS_WEIGHT")
	private Double grossWeight;
	@Column(name="NET_WEIGHT")
	private Double netWeight;
	@Column(name="SIZE_LENGTH")
	private Double sizeLength;
	@Column(name="SIZE_WIDTH")
	private Double sizeWidth;	
	@Column(name="SIZE_HEIGHT")
	private Double sizeHeight;
	@Column(name="EX_PRICE")
	private Double exPrice;			//sales confirmation 中的价格（手填）
	@Column(name="PRICE")
	private Double price;
	@Column(name="TAX")
	private Double tax;			//收购单价=合同单价
	
	@Column(name="ORDER_NO")
	private Integer orderNo;	
	
	/*private String factoryId;
	public String getFactoryId() {
		factoryId = factory.getId();
		return factoryId;
	}
	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}	
	
	public String getPackingUnit() {
		return this.packingUnit;
	}
	public void setPackingUnit(String packingUnit) {
		this.packingUnit = packingUnit;
	}	
	
	public Integer getCnumber() {
		return this.cnumber;
	}
	public void setCnumber(Integer cnumber) {
		this.cnumber = cnumber;
	}	
	
	public Integer getBoxNum() {
		return this.boxNum;
	}
	public void setBoxNum(Integer boxNum) {
		this.boxNum = boxNum;
	}	
	
	public Double getGrossWeight() {
		return this.grossWeight;
	}
	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}	
	
	public Double getNetWeight() {
		return this.netWeight;
	}
	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}	
	
	public Double getSizeLength() {
		return this.sizeLength;
	}
	public void setSizeLength(Double sizeLength) {
		this.sizeLength = sizeLength;
	}	
	
	public Double getSizeWidth() {
		return this.sizeWidth;
	}
	public void setSizeWidth(Double sizeWidth) {
		this.sizeWidth = sizeWidth;
	}	
	
	public Double getSizeHeight() {
		return this.sizeHeight;
	}
	public void setSizeHeight(Double sizeHeight) {
		this.sizeHeight = sizeHeight;
	}	
	
	public Double getExPrice() {
		return this.exPrice;
	}
	public void setExPrice(Double exPrice) {
		this.exPrice = exPrice;
	}	
	
	public Double getPrice() {
		return this.price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
	
	public Double getTax() {
		return this.tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}	
	
	public Integer getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public Export getExport() {
		return export;
	}
	public void setExport(Export export) {
		this.export = export;
	}
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	public Set<ExtEproduct> getExtEproducts() {
		return extEproducts;
	}
	public void setExtEproducts(Set<ExtEproduct> extEproducts) {
		this.extEproducts = extEproducts;
	}	
	
	
}
