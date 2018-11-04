package org.hush.provider;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: hewater
 * @create: 2018-11-04 22:12
 **/
@RestController
public class ProviderController {

    @RequestMapping(value = "/info", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(){
        Person person=new Person();
        person.setId(1);
        person.setAge(18);
        person.setName("mike");
        return person;
    }

}
