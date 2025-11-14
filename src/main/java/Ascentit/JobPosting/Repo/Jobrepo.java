package Ascentit.JobPosting.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Ascentit.JobPosting.Entity.JobEntity;

@Repository
public interface Jobrepo extends MongoRepository<JobEntity, Integer> {

	JobEntity save(Optional<JobEntity> existingjob);

	Optional<JobEntity> findBymail(String mail);

	void deleteBymail(String mail);

	
	
    List<JobEntity> findByExpAndSkillsContaining(Integer exp, String skills);
}
