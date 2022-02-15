package com.marketplace.GreenAndGo;

import static org.junit.jupiter.api.Assertions.*;
import com.marketplace.GreenAndGo.model.Hello;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void sayHelloTest() {
       Hello hello = new Hello();
       assertEquals("Hello everybody!", hello.sayHello());
        }
    }

