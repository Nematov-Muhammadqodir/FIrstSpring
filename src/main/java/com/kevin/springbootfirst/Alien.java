package com.kevin.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Computer computer;

    public void code() {
        this.computer.compile();
    }
}
