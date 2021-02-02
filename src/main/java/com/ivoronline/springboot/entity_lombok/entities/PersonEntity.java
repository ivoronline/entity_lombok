package com.ivoronline.springboot.entity_lombok.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Component
public class PersonEntity {
  private Long    id;
  private String  name;
  private Integer age;
}






