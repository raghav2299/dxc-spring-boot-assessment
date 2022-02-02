package com.dxclearninig1.controller;

import com.dxclearninig1.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value="/message")
   public String getMessage(){
       return "hiiiiiiiiiiiiii";

    }

  
    @GetMapping(path="/person")
    public List<Person> allPersons(){
        ArrayList<Person> list= newArraylist<person>();
        Iterator<Employee>it =personService.findAll().iterator();
        while(it.hasnext());
        return list;

    }

    @GetMapping(path="/person/{id}")
    public Person getPerson(@PathVariable int id){
        return personService.findBy(Id).get();

    }

    @PostMapping(path="/person")
    public void insertPerson(@PathVariable Person person){
        personService.save(person);

    }

    @DeleteMapping(path="/person/{id}")
    public void deletePerson(@RequestBody Person person){
        personService.save(person);
    }


    @PutMapping(path="/person/{id}")
    public void updatePerson(@RequestBody Person person){
        personService.save(person);
    }



    
}
