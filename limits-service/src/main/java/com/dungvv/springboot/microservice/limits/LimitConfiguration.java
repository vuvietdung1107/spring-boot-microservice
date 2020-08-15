package com.dungvv.springboot.microservice.limits;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration implements Serializable {
    private int maximum;
    private int minimum;
}
