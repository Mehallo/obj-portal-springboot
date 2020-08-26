package com.objective.portal.controllers;

import com.objective.portal.models.Groups;
import com.objective.portal.repositories.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/groups")
public class GroupsContoller {

    @Autowired
    private GroupsRepository groupsRepository;

    @CrossOrigin
    @GetMapping("/list")
    public Iterable<Groups> list()
    {
        //return groupsRepository.findAll();
        return groupsRepository.findByDateinactivateIsNull();
    }

    @CrossOrigin
    @GetMapping("/id/{id}")
    public Groups get(@PathVariable("id") String id)
    {
        return groupsRepository.findById(id);
    }
}
