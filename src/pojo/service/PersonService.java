package pojo.service;
import pojo.data.Person;

public class PersonService{
    private Person person=new Person();

    public String personSayHello(String name){
        if(name==null){
		return "error: the name is null.";
	}
        
        this.person.setName(name);
        return this.person.sayHello();
    }
}
