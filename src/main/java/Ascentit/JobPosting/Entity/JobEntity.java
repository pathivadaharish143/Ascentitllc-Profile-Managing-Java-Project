package Ascentit.JobPosting.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class JobEntity {

	public Integer id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String jobTitle;
	public Integer exp;
	public String Description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "JobEntity [id=" + id + ", jobTitle=" + jobTitle + ", exp=" + exp + ", Description=" + Description + "]";
	}

	public JobEntity(Integer id, String jobTitle, Integer exp, String description) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.exp = exp;
		Description = description;
	}

	public JobEntity() {
		super();
	}

}
