package Ascentit.JobPosting.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Ascentit.JobPosting.Entity.JobEntity;

@Service
public interface JobServices {

	public JobEntity save(JobEntity jobEntity);

	public List<JobEntity> showdata();

	public Optional<JobEntity> getbymail(String  mail);

	public void deletebymail(String mail);

	public JobEntity updatebymail(JobEntity jobEntity, String mail);

	public JobEntity updatebymailfull(JobEntity jobEntity, String mail);

	public  List<JobEntity> searchByExpAndSkill(int exp, String skills);


}
