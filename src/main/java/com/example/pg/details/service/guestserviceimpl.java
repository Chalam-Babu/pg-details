package com.example.pg.details.service;

import com.example.pg.details.model.guest;
import com.example.pg.details.repositary.guestrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class guestserviceimpl implements guestservice {

    @Autowired
    private guestrepo gr;

    @Override
    public guest guestSave(guest g) {
        return gr.save(g);
    }

    @Override
    public List<guest> getAllguests() {
        return gr.findAll();
    }
}
