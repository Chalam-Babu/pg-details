package com.example.pg.details.controller;


import com.example.pg.details.model.guest;
import com.example.pg.details.service.guestservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/guest")
public class guestcontroller {
    @Autowired
    private guestservice gs;

    @PostMapping("/add")

    public String add(@RequestBody guest g){
        gs.guestSave(g);
        return "guest add sucessfully";
    }

    @GetMapping("/getAll")
    public List<guest> getAllguests(){
        return gs.getAllguests();
    }

}
