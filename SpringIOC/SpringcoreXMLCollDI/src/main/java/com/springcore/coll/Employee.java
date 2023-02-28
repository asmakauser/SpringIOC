/**
 * 
 */
package com.springcore.coll;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ASMA KAUSER
 *
 */

@Data
@NoArgsConstructor
public class Employee {

	

	private String name;

	private List<String> phones;
	
	private Set<String> address;
	
	private Map<String,String> courses;
	
	private Properties details;

}
