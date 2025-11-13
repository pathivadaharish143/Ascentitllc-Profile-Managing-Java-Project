package Ascentit.JobPosting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ascentit.JobPosting.Entity.JobEntity;
import Ascentit.JobPosting.Service.JobServices;
import Ascentit.JobPosting.Service.impl.JobServiceimp;
import jakarta.xml.ws.Response;

@RestController
@RequestMapping("/Ascentitllc")
public class JobController {

	@Autowired
	public JobServiceimp jobServices;

	@PostMapping("/postjob")
	public ResponseEntity<JobEntity> save(@RequestBody JobEntity jobEntity) {
		return new ResponseEntity<JobEntity>(jobServices.save(jobEntity), HttpStatus.ACCEPTED);

	}

	@GetMapping("/getdata")
	public ResponseEntity<List<JobEntity>> getall() {
		return new ResponseEntity<List<JobEntity>>(jobServices.showdata(), HttpStatus.ACCEPTED);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<JobEntity> findone(@PathVariable int id) {
		return jobServices.getbyid(id).map(JobEntity -> new ResponseEntity<>(JobEntity, HttpStatus.ACCEPTED))
				.orElse(new ResponseEntity<JobEntity>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/delete/{id}")
	public void deleteone(@PathVariable int id) {
		jobServices.deletebyid(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<JobEntity> update(@RequestBody JobEntity jobnEntity, @PathVariable int id) {

		return new ResponseEntity<JobEntity>(jobServices.updatebyidfull(jobnEntity, id), HttpStatus.ACCEPTED);
	}

	@PatchMapping("/updateone/{id}")
	public ResponseEntity<JobEntity> updateone(@RequestBody JobEntity jobEntity, @PathVariable int id) {

		return new ResponseEntity<JobEntity>(jobServices.updatebyid(jobEntity, id), HttpStatus.ACCEPTED);
	}
}
