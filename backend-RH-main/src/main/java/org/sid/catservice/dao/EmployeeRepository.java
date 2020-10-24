package org.sid.catservice.dao;

import org.sid.catservice.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  @RestResource(path = "/ByNom")
  public List<Employee> findByNomContains( @Param("mc") String name);
}


