package com;

import java.util.Objects;

import jakarta.persistence.Column;

public class Project {
	private int Projectid;
	
	//@Column(name="projectName",nullable = false,length=100)
	private String projectName;
	
	//@Column(name="frontendtech",nullable = false,length=100)
	private String frontendTech;
	
	//@Column(name="backendtech",nullable = false,length=100)
	private String backendTech;
	
	
	public Project() {
		super();
		
	}
	public Project(int projectid, String projectName, String frontendTech, String backendTech) {
		super();
		Projectid = projectid;
		this.projectName = projectName;
		this.frontendTech = frontendTech;
		this.backendTech = backendTech;
	}
	
	public int getProjectid() {
		return Projectid;
	}
	public void setProjectid(int projectid) {
		Projectid = projectid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getFrontendTech() {
		return frontendTech;
	}
	public void setFrontendTech(String frontendTech) {
		this.frontendTech = frontendTech;
	}
	public String getBackendTech() {
		return backendTech;
	}
	public void setBackendTech(String backendTech) {
		this.backendTech = backendTech;
	}
	
	@Override
	public String toString() {
		return "Project [Projectid=" + Projectid + ", projectName=" + projectName + ", frontendTech=" + frontendTech
				+ ", backendTech=" + backendTech + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Projectid, backendTech, frontendTech, projectName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Projectid == other.Projectid && Objects.equals(backendTech, other.backendTech)
				&& Objects.equals(frontendTech, other.frontendTech) && Objects.equals(projectName, other.projectName);
	}
	
	
	
}
