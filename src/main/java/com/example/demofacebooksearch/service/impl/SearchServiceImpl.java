package com.example.demofacebooksearch.service.impl;

import com.example.demofacebooksearch.entity.Profile;
import com.example.demofacebooksearch.repository.SearchRepository;
import com.example.demofacebooksearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchRepository searchRepository;

    @Override
    public Profile save(Profile profile) {
        return searchRepository.save(profile);
    }

    @Override
    public List<Profile> findByUserName(String name) {
        return searchRepository.findByUserName(name);
    }
}
