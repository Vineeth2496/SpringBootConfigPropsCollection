package com.SpringBootConfigProps.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.SpringBootConfigProps.model.ProductInfo;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class CollectionTestRunner implements CommandLineRunner {

	private List<String> details;
	//private Set<String> details;
	//private String[] details;
	private Map<String, Integer> version;
	
	private ProductInfo pob;	//HAS - A
	
	@Override
	public void run(String... args) throws Exception {
		//System.out.println(details.getClass());
		//System.out.println(version.getClass());
		System.out.println(this);

	}

}
