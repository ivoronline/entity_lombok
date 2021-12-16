package com.ivoronline.springboot.entity_lombok.controllers;

import com.ivoronline.springboot.entity_lombok.entities.PersonEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  //============================================================================
  // HELLO
  //============================================================================
  @ResponseBody
  @RequestMapping("Hello")
  String hello() {

    //CREATE PERSON ENTITY
    PersonEntity personEntity = new PersonEntity();
                 personEntity.setName("John");

    //USE LOMBOK'S GETTER
    String name = personEntity.getName();

    //RETURN SOMETHING
    return "Hello " + name;

  }

}
