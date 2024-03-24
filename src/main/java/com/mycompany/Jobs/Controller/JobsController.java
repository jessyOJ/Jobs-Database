package com.mycompany.Jobs.Controller;

import com.mycompany.Jobs.Model.JobsModel;
import com.mycompany.Jobs.Service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
    @Autowired
    public JobsService service;
    @PostMapping("/jobsAvailable")
    public ResponseEntity<JobsModel> postJob(@RequestBody JobsModel jobs){
        JobsModel model = service.postJobs(jobs);
        ResponseEntity<JobsModel> response = new ResponseEntity<>(model, HttpStatus.CREATED);
        return response;
    }
    @GetMapping("/jobsAvailable")
    public ResponseEntity< List< JobsModel >> getAll(){
        List< JobsModel >jobs = service.jobs();
        ResponseEntity< List< JobsModel >> response = new ResponseEntity<>(jobs,HttpStatus.OK);
return response;
    }
    @PutMapping("/jobsAvailable/updateAll/{jobID}")
    public ResponseEntity<JobsModel> updateAll(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateAll( jobs,jobID);
        ResponseEntity<JobsModel>reponse = new ResponseEntity<>(jobs,HttpStatus.OK);
        return reponse;
    }
    @PatchMapping("/jobsAvailable/updateName/{jobID}")
    public ResponseEntity<JobsModel> updateName(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateName(jobs, jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(jobs,HttpStatus.OK);
        return response;
    }
    @PatchMapping("/jobsAvailable/updateQualifications/{jobID}")
    public ResponseEntity<JobsModel> updateQualifications(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateQualification(jobs, jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(jobs,HttpStatus.OK);
        return response;
    }
    @PatchMapping("/jobsAvailable/updateLocation/{jobID}")
    public ResponseEntity<JobsModel> updateLocation(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateLocation(jobs, jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(jobs,HttpStatus.OK);
        return response;
    }
    @PatchMapping("/jobsAvailable/updateDescription/{jobID}")
    public ResponseEntity<JobsModel> updateDescription(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateDescription(jobs, jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(jobs,HttpStatus.OK);
        return response;
    }
    @PatchMapping("/jobsAvailable/updateSalary/{jobID}")
    public ResponseEntity<JobsModel> updateSalary(@RequestBody JobsModel jobs,@PathVariable Long jobID){
        jobs = service.updateSalary(jobs, jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(jobs,HttpStatus.OK);
        return response;
    }
    @DeleteMapping("/jobsAvailable/Delete/{jobID}")
    public  ResponseEntity<JobsModel> delete(@PathVariable Long jobID){
        service.delete(jobID);
        ResponseEntity<JobsModel>response = new ResponseEntity<>(null,HttpStatus.OK);
        return response;
    }
}
