package Ascentit.JobPosting.Service.impl;

import java.util.List;
import java.util.Optional;

import javax.swing.JInternalFrame;

import org.hibernate.FetchNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ascentit.JobPosting.Entity.JobEntity;
import Ascentit.JobPosting.Repo.Jobrepo;
import Ascentit.JobPosting.Service.JobServices;

@Service
public class JobServiceimp implements JobServices {

	@Autowired
	public Jobrepo jobrepo;

	@Override
	public JobEntity save(JobEntity jobEntity) {
		return jobrepo.save(jobEntity);
	}

	@Override
	public Optional<JobEntity> getbymail(String mail) {
		return jobrepo.findBymail(mail);
	}
	

	@Override
	public void deletebymail(String mail) {
		jobrepo.deleteBymail(mail);
	}

	@Override
	public JobEntity updatebymail(JobEntity jobEntity, String mail) {

		Optional<JobEntity> existingjobEntity = jobrepo.findBymail(mail);

		if (existingjobEntity.isPresent()) {
			JobEntity existingjob = existingjobEntity.get();

			 if (jobEntity.getFname() != null) {
			        existingjob.setFname(jobEntity.getFname());
			    }
			    if (jobEntity.getLname() != null) {
			        existingjob.setLname(jobEntity.getLname());
			    }
			    if (jobEntity.getGender() != null) {
			        existingjob.setGender(jobEntity.getGender());
			    }
			    if (jobEntity.getJobTitle() != null) {
			        existingjob.setJobTitle(jobEntity.getJobTitle());
			    }
			    if (jobEntity.getExp() != null) {
			        existingjob.setExp(jobEntity.getExp());
			    }
			    if (jobEntity.getSkills() != null) {
			        existingjob.setSkills(jobEntity.getSkills());
			    }
			    if (jobEntity.getMail() != null) {
			        existingjob.setMail(jobEntity.getMail());
			    }
			    if (jobEntity.getPhone() != null) {
			        existingjob.setPhone(jobEntity.getPhone());
			    }
			 return jobrepo.save(existingjob);
	    } else {
	        throw new FetchNotFoundException("Job not found", mail); 
	    }
	}

	@Override
	public JobEntity updatebymailfull(JobEntity jobEntity, String mail) throws FetchNotFoundException {
		Optional<JobEntity> existingjobEntity = jobrepo.findBymail(mail);

		if (existingjobEntity.isPresent()) {
			JobEntity existingjob = existingjobEntity.get();

			 if (jobEntity.getFname() != null) {
			        existingjob.setFname(jobEntity.getFname());
			    }
			    if (jobEntity.getLname() != null) {
			        existingjob.setLname(jobEntity.getLname());
			    }
			    if (jobEntity.getGender() != null) {
			        existingjob.setGender(jobEntity.getGender());
			    }
			    if (jobEntity.getJobTitle() != null) {
			        existingjob.setJobTitle(jobEntity.getJobTitle());
			    }
			    if (jobEntity.getExp() != null) {
			        existingjob.setExp(jobEntity.getExp());
			    }
			    if (jobEntity.getSkills() != null) {
			        existingjob.setSkills(jobEntity.getSkills());
			    }
			    if (jobEntity.getMail() != null) {
			        existingjob.setMail(jobEntity.getMail());
			    }
			    if (jobEntity.getPhone() != null) {
			        existingjob.setPhone(jobEntity.getPhone());
			    }
			 return jobrepo.save(existingjob);
	    } else {
	        throw new FetchNotFoundException("Job not found", mail); 
	    }
	}
	@Override
	public List<JobEntity> showdata() {
		return jobrepo.findAll();
	}

	@Override
	public List<JobEntity> searchByExpAndSkill(int exp, String skills) {
		return jobrepo.findByExpAndSkillsContaining(null, skills);
	}


	

}
