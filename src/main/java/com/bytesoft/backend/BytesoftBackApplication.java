package com.bytesoft.backend;

import com.bytesoft.backend.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.bytesoft.backend.modelo")
public class BytesoftBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytesoftBackApplication.class, args);
	}

}
