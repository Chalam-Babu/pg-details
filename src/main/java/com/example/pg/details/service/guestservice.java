package com.example.pg.details.service;

import com.example.pg.details.model.guest;

import java.util.List;


public interface guestservice {
    public guest guestSave(guest g);
    public List<guest> getAllguests();
}
