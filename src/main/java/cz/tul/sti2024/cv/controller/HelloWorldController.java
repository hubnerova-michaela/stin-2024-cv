package cz.tul.sti2024.cv.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/time")
    public String getTime() {
        return new Date(System.currentTimeMillis()).toString();
    }

    @RequestMapping("/prijmoutplatbu")
    public String prijmoutPlatbu() {
        XmlMapper mapper = new XmlMapper();
        return "Platba prijata";
    }

}

