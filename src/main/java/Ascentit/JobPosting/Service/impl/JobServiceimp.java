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
	public Optional<JobEntity> getbyid(int id) {
		return jobrepo.findById(id);
	}

	@Override
	public void deletebyid(int id) {
		jobrepo.deleteById(id);
	}

	@Override
	public JobEntity updatebyid(JobEntity jobEntity, int id) {

		Optional<JobEntity> existingjobEntity = jobrepo.findById(id);

		if (existingjobEntity.isPresent()) {
			JobEntity existingjob = existingjobEntity.get();

			if (jobEntity.getDescription() != null) {
				existingjob.setDescription(jobEntity.getDescription());
			}
			if (jobEntity.getExp() != 0) {
				existingjob.setExp(jobEntity.getExp());
			}
			if (jobEntity.getJobTitle() != null) {
				existingjob.setJobTitle(jobEntity.getJobTitle());
			}
			 return jobrepo.save(existingjob);
	    } else {
	        throw new FetchNotFoundException("Job not found", id); 
	    }
	}

	@Override
	public JobEntity updatebyidfull(JobEntity jobEntity, int id) throws FetchNotFoundException {
		Optional<JobEntity> existingjobEntity = jobrepo.findById(id);

		if (existingjobEntity.isPresent()) {
			JobEntity existingjob = existingjobEntity.get();

			if (jobEntity.getDescription() != null) {
				existingjob.setDescription(jobEntity.getDescription());
			}
			if (jobEntity.getExp() != 0) {
				existingjob.setExp(jobEntity.getExp());
			}
			if (jobEntity.getJobTitle() != null) {
				existingjob.setJobTitle(jobEntity.getJobTitle());
			}
			 return jobrepo.save(existingjob);
	    } else {
	        throw new FetchNotFoundException("Job not found", id); 
	    }
	}
	@Override
	public List<JobEntity> showdata() {
		return jobrepo.findAll();
	}

}
