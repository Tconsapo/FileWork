/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author PC
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Calendar;
 
public class Event {
 
    @JsonProperty("Date")
    private Calendar date;
    
    @JsonProperty("Name")
    private String name;
    
    @JsonProperty("Persons")
    private ArrayList<String> persons;
 
    public Event() {
        
    }
    
    public Event(Calendar date, String name, ArrayList<String> persons){
        this.date = date;
        this.name = name;
        this.persons = persons;
    }

    public Event(Calendar date, String name) {
        this.date = date;
        this.name = name;
    }
    
    public void setEvent(Calendar date, String name){
        this.date = date;
        this.name = name;
    }
    
    public void setDate(Calendar date){
        this.date = date;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPersons(ArrayList<String> persons){
        this.persons = persons;
    }
    
    public void addPerson(String personName){
        this.persons.add(personName);
    }
    
    public void delPerson(String personName){
        this.persons.remove(personName);
    }
    
    public Calendar getDate(){
        return this.date;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    public ArrayList<String> getPersons(){
        return this.persons;
    }
    
    public String getPerson(int x){
        return (String) this.persons.get(x);
    }
    
   // public int getPersonsCount(){
   //     return this.persons.size();
   // }
 
    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(date.get(Calendar.HOUR));
        build.append(" ");
        build.append(date.get(Calendar.AM_PM));
        build.append(" ");
        build.append(date.get(Calendar.MINUTE));
        build.append(" ");
        build.append(name);
        build.append("\n");
        for (Object person: persons) {
            build.append(person);
            build.append("\n");
        }
        return build.toString();
    }
}