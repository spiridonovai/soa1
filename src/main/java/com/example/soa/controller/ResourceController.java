package com.example.soa.controller;

import com.example.soa.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created by nydiarra on 06/05/17.
 */
@RestController
@RequestMapping("/resources")
public class ResourceController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return "{\" proba \":\" asdsad \"}";
    }


}

