package com.mycompany.Jobs.Repository;

import com.mycompany.Jobs.Entity.jobsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends CrudRepository<jobsEntity,Long> {
}
