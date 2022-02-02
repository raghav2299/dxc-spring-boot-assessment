package com.dxclearninig1;

import java.util.ArrayList;
import java.util.List;

import com.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
  

    public List<Person> getALLPersons()
    {
        List<Person> persons = (List<Person>)this.personRepository.findAll();
        return list;
        
    }
        
    public Person getPerson(Integer Id)
    {
        for(Person p : list){
            if(p.getId()==id){

            }
        }
        return null;

        public Person UpdatePerson(Person person){
            for(Person p :list){
                if(p.getId()== person.getId())
                {
                    p.setPersonName(person.getPersonName());

                }
            }
        }

        public Person deletePerson(int id){
            list.remove(id);
        }


    }
    
}
