package com.example.demofacebooksearch.service;

import com.example.demofacebooksearch.entity.Profile;

import java.util.List;

public interface SearchService {

    Profile save(Profile profile);

    List<Profile> findByUserName (String name);
}
