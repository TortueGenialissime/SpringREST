package fr.paullegall.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import fr.paullegall.bean.Personne;

@RestController
@RequestMapping(value="/test")
public class TestController {

	@RequestMapping(value="/bjr",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<Personne>> sayHello() {
		List<Personne> personnes = new ArrayList<Personne>();
		Personne personne = new Personne("Gerard", "Poupidou", 23);
		Personne personne2 = new Personne("dsds", "sdddd", 28);
		personnes.add(personne);
		personnes.add(personne2);
		return new ResponseEntity<List<Personne>>(personnes, HttpStatus.OK);
	}
}	
