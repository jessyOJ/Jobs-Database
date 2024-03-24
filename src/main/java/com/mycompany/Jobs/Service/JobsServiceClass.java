package com.mycompany.Jobs.Service;

import com.mycompany.Jobs.Converter.JobsConverter;
import com.mycompany.Jobs.Entity.jobsEntity;
import com.mycompany.Jobs.Model.JobsModel;
import com.mycompany.Jobs.Repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobsServiceClass implements JobsService {
    @Autowired
    public JobsRepository jobsRepository;
    @Autowired
    public JobsConverter jobsConverter;
    @Override
    public JobsModel postJobs(JobsModel jobs) {
        jobsEntity je = jobsConverter.converttoEntity(jobs);
        je= jobsRepository.save(je);
        JobsModel model =jobsConverter.converttoModel(je);
        return model;
    }

    @Override
    public List<JobsModel> jobs() {
        List<jobsEntity> listof = ( List<jobsEntity> )jobsRepository.findAll();
List<JobsModel>modellist = new ArrayList<>();
        for(jobsEntity entity : listof){
            JobsModel model  =jobsConverter.converttoModel(entity);
            modellist.add(model);
        }
        return modellist;
    }

    @Override
    public JobsModel updateAll(JobsModel jobs, Long jobID) {
        JobsModel jobModel = null;
        Optional<jobsEntity> option = jobsRepository.findById(jobID);
        if (option.isPresent()){
            jobsEntity JE = option.get();
            JE.setName(jobs.getName());
            JE.setDescription(jobs.getDescription());
            JE.setSalary(jobs.getSalary());
            JE.setLocation(jobs.getLocation());
            JE.setQualification(jobs.getQualification());
            jobModel =jobsConverter.converttoModel(JE);
            jobsRepository.save(JE);
        }
        return jobModel;
    }

    @Override
    public JobsModel updateName(JobsModel jobs, Long jobID) {
        JobsModel jobModel = null;
        Optional<jobsEntity> option = jobsRepository.findById(jobID);
        if (option.isPresent()){
            jobsEntity JE=option.get();
            JE.setName(jobs.getName());
            jobModel =jobsConverter.converttoModel(JE);
            jobsRepository.save(JE);
        }
        return jobModel;
    }

    @Override
    public JobsModel updateDescription(JobsModel jobs, Long jobID) {
        JobsModel jobsModel =null;
        Optional<jobsEntity> option = jobsRepository.findById(jobID);
        if (option.isPresent()){
            jobsEntity JE =option.get();
            JE.setDescription(jobs.getDescription());
            jobsModel=jobsConverter.converttoModel(JE);
            jobsRepository.save(JE);
        }
        return jobsModel;
    }

    @Override
    public JobsModel updateSalary(JobsModel jobs, Long jobID) {
        JobsModel jobsModel =null;
        Optional<jobsEntity> option = jobsRepository.findById(jobID);
        if (option.isPresent()){
            jobsEntity JE =option.get();
            JE.setSalary(jobs.getSalary());
            jobsModel=jobsConverter.converttoModel(JE);
            jobsRepository.save(JE);
        }
        return jobsModel;
    }

    @Override
    public JobsModel updateLocation(JobsModel jobs, Long jobID) {
            JobsModel jobsModel =null;
            Optional<jobsEntity> option = jobsRepository.findById(jobID);
            if (option.isPresent()){
                jobsEntity JE =option.get();
                JE.setLocation(jobs.getLocation());
                jobsModel=jobsConverter.converttoModel(JE);
                jobsRepository.save(JE);
        }
        return jobsModel;
    }

    @Override
    public JobsModel updateQualification(JobsModel jobs, Long jobID) {
            JobsModel jobsModel =null;
            Optional<jobsEntity> option = jobsRepository.findById(jobID);
            if (option.isPresent()){
                jobsEntity JE =option.get();
                JE.setQualification(jobs.getQualification());
                jobsModel=jobsConverter.converttoModel(JE);
                jobsRepository.save(JE);
        }
        return jobsModel;
    }

    @Override
    public void delete(Long jobID) {
         jobsRepository.deleteById(jobID);

    }
}
