package com.mycompany.Jobs.Service;

import com.mycompany.Jobs.Model.JobsModel;

import java.util.List;

public interface JobsService {
    JobsModel postJobs( JobsModel jobs);//to post a job(POST)
    List<JobsModel > jobs();//to get the list of all available jobs(GET)
    JobsModel updateAll(JobsModel jobs,Long jobID);//to update a job(PUT)
    JobsModel updateName(JobsModel jobs,Long jobID);//update job name(PATCH)
    JobsModel updateDescription(JobsModel jobs,Long jobID);//update job description(PATCH)
    JobsModel updateSalary(JobsModel jobs,Long jobID);//update job salary(PATCH)
    JobsModel updateLocation(JobsModel jobs,Long jobID);//update job Location(PATCH)
    JobsModel updateQualification(JobsModel jobs,Long jobID);//update job Qualification(PATCH)

    void delete(Long jobID);//delete job(DELETE)
}
