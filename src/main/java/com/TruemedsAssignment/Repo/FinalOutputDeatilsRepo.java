package com.TruemedsAssignment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TruemedsAssignment.Model.FinalOutputDetails;

@Repository
public interface FinalOutputDeatilsRepo extends JpaRepository<FinalOutputDetails, String> {

}
