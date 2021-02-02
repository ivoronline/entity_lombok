package com.ivoronline.springboot.entity_lombok.controllers;

import com.ivoronline.springboot.entity_lombok.entities.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonEntity personEntity;

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    personEntity.setName("John");
    String name = personEntity.getName();
    return "Hello12345 " + name;
  }

}
