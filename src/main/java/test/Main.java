package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Event e = new Event(new GregorianCalendar(), "Some Name", new ArrayList<>());
        Event _e = new Event(new GregorianCalendar(), "Some Name 1", new ArrayList<>());
        e.addPerson("Mark");
        e.addPerson("ForDel");
        e.addPerson("NonMark");
        e.delPerson("ForDel");
        try {
            Conv.toJSON(e, "filename");
        } catch (IOException er) {
            System.out.println("error");
        }
        Event e1 = Conv.toJavaObject("filename");
        System.out.println(e1.getDate());
        System.out.println(e1.getName());
        int n = e.getPersons().size();
        for(int i = 0; i < n; i++){
            System.out.println(e.getPerson(i));
        }
        System.out.println();
        
        _e.addPerson("Mark");
        _e.addPerson("ForDel");
        _e.addPerson("NonMark");
        _e.delPerson("ForDel");
        try {
            Conv.toJSON(_e, "filename1");
        } catch (IOException er) {
            System.out.println("error");
        }
        Event _e1 = Conv.toJavaObject("filename1");
        System.out.println(_e1.getDate());
        System.out.println(_e1.getName());
        n = _e.getPersons().size();
        for(int i = 0; i < n; i++){
            System.out.println(_e.getPerson(i));
        }
        
        File f = new File("filename1");
        f.delete();
            
    }
}
