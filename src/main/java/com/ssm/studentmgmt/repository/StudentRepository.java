package com.ssm.studentmgmt.repository;

import com.ssm.studentmgmt.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntity,String> {
}
