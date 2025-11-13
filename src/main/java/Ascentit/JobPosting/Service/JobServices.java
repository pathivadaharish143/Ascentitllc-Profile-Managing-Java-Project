package Ascentit.JobPosting.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Ascentit.JobPosting.Entity.JobEntity;

@Service
public interface JobServices {

	public JobEntity save(JobEntity jobEntity);

	public List<JobEntity> showdata();

	public Optional<JobEntity> getbyid(int id);

	public void deletebyid(int id);

	public JobEntity updatebyid(JobEntity jobEntity, int id);

	public JobEntity updatebyidfull(JobEntity jobEntity, int id);

}
