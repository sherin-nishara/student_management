package com.ssm.studentmgmt.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {
    @Id
    String id;
    String name;
    int age;
    String email;
}
