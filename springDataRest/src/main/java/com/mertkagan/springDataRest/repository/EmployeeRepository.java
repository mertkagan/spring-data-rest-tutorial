package com.mertkagan.springDataRest.repository;

import com.mertkagan.springDataRest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByFirstName(@Param("firstName") String firstName);
}
