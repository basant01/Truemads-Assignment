package com.TruemedsAssignment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TruemedsAssignment.Model.InputStringDetails;

@Repository
public interface InputStringDetailsRepo extends JpaRepository<InputStringDetails, String> {

}
