package com.profiler.access.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Employee {
	private String firstName;
	private String lastName;
	private String phoneNumber;

}
