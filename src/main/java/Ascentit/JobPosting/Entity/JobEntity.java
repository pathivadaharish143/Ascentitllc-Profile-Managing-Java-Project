package Ascentit.JobPosting.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class JobEntity {

	public String id;
	@Id
	public String fname;
	public String lname;
	public String gender ;
	public String jobTitle;
	public Integer exp;
	public String skills;
	public String mail;
	public Long phone;
	
	
	
	

	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getFname() {
		return fname;
	}





	public void setFname(String fname) {
		this.fname = fname;
	}





	public String getLname() {
		return lname;
	}





	public void setLname(String lname) {
		this.lname = lname;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getJobTitle() {
		return jobTitle;
	}





	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}





	public Integer getExp() {
		return exp;
	}





	public void setExp(Integer exp) {
		this.exp = exp;
	}





	public String getSkills() {
		return skills;
	}





	public void setSkills(String skills) {
		this.skills = skills;
	}





	public String getMail() {
		return mail;
	}





	public void setMail(String mail) {
		this.mail = mail;
	}





	public Long getPhone() {
		return phone;
	}





	public void setPhone(Long phone) {
		this.phone = phone;
	}





	public JobEntity(String id, String fname, String lname, String gender, String jobTitle, Integer exp, String skills,
			String mail, Long phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.exp = exp;
		this.skills = skills;
		this.mail = mail;
		this.phone = phone;
	}





	@Override
	public String toString() {
		return "JobEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", jobTitle="
				+ jobTitle + ", exp=" + exp + ", skills=" + skills + ", mail=" + mail + ", phone=" + phone + "]";
	}





	public JobEntity() {
		super();
	}






}
