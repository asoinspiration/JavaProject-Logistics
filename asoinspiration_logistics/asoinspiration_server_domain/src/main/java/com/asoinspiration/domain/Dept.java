package com.asoinspiration.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="DEPT_P")
@Entity
public class Dept implements Serializable{
	
	@Id
	@Column(name="DEPT_ID")
	@GeneratedValue(generator="sys-uuid")
	@GenericGenerator(name="sys-uuid",strategy="uuid")
	private String id;
	
	@Column(name="DEPT_NAME")
	private String deptName;
	
	@ManyToOne()
	@JoinColumn(name="PARENT_ID",referencedColumnName="DEPT_ID")
	private Dept parent;
	
	@Column(name=" STATE")
	private Integer state;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Dept getParent() {
		return parent;
	}
	public void setParent(Dept parent) {
		this.parent = parent;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", parent=" + parent + ", state=" + state + "]";
	}
	
	

}
