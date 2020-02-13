package com.alfonsotienda.holaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.alfonsotienda.holaspring.model.Cliente;

@SpringBootApplication
public class HolaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaspringApplication.class, args);
	}

	public void getAllArticlesDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
			RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/clientes";
			HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
			ResponseEntity<Cliente[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Cliente[].class);
			Cliente[] clientes = responseEntity.getBody();
			for(Cliente cliente : clientes) {
				  System.out.println(cliente.toString());
			}
		}

}
