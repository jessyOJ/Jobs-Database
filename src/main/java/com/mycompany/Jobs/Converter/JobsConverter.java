package com.mycompany.Jobs.Converter;

import com.mycompany.Jobs.Entity.jobsEntity;
import com.mycompany.Jobs.Model.JobsModel;
import org.springframework.stereotype.Component;

@Component
public class JobsConverter {
    public JobsModel converttoModel( jobsEntity entity){
        JobsModel JM = new JobsModel();
        JM.setName(entity.getName());
        JM.setDescription(entity.getDescription());
        JM.setSalary(entity.getSalary());
        JM.setLocation(entity.getLocation());
        JM.setQualification(entity.getQualification());
        return JM;
    }
    public jobsEntity converttoEntity(JobsModel model){
        jobsEntity JE = new jobsEntity();
        JE.setName(model.getName());
        JE.setDescription(model.getDescription());
        JE.setSalary(model.getSalary());
        JE.setLocation(model.getLocation());
        JE.setQualification(model.getQualification());
        return JE;
    }
}
