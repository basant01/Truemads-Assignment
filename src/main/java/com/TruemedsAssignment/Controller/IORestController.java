package com.TruemedsAssignment.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.TruemedsAssignment.Model.FinalOutputDetails;
import com.TruemedsAssignment.Model.InputStringDetails;
import com.TruemedsAssignment.Repo.InputStringDetailsRepo;
import com.TruemedsAssignment.Service.OutputDetailService;

@RestController
@RequestMapping("/truemedsString")
public class IORestController {

	@Autowired
	OutputDetailService outputDetailService;
	
	@Autowired
	InputStringDetailsRepo inputStringDetailsRepo;
	
	/**
	 * 
	 * Saving the data into firstname_lastname_java_output table
	 * 
	 * @see outputDetailSave
	 * @return String
	 * @author Basant
	 */
	@PostMapping("/saveOutputDetails")
	public String outputDetailSave()
	{
		
		outputDetailService.adjacentRemoval();
				return "After removal of duplicate data, it got saved into the firstname_lastname_java_output table successfully";
	}
	
	/**
	 * 
	 * Method to add all records into input_details table
	 * 
	 * @see inputStrings
	 * @return List of InputDetails model class
	 * @param request body for InputDetails model class
	 * @author Basant
	 */
	@PostMapping("/addInputDetails")
	public List<InputStringDetails> addStrings(@RequestBody List<InputStringDetails> inputDetails)
	{
		System.out.println("Any kind of Strings got saved into the InputDetails table");
		return outputDetailService.saveInputDetails(inputDetails);
	}
	
	/**
	 * 
	 * Method to find all records from the firstname_lastname_java_output table
	 * 
	 * @see getOutputDetails
	 * @return List of outputDetails model class
	 * @author Basant
	 */
	@GetMapping("/getOutputDetails")
	public List<FinalOutputDetails> getOutputDetails()
	{
		System.out.println("Fetching the details from firstname_lastname_java_output table");
		return outputDetailService.getOutputTableDetails();
	}
	
	/**
	 * 
	 * Method to find all records from the input_details table
	 * 
	 * @see getInputDetails
	 * @return List of InputDetails model class
	 * @author Basant
	 */
	@GetMapping("/getInputDetails")
	public List<InputStringDetails> getInputDetails()
	{
		System.out.println("Fetching the details from input_details table");
		return outputDetailService.getInputTableDetails();
	}
}