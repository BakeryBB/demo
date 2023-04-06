
package com.example.demo.Controller;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Team;
import com.example.demo.repositories.TeamRepo;
 
@RestController
@RequestMapping("/team")
public class Controller {
 
private List<Team> teams = new ArrayList<Team>();

@Autowired
private TeamRepo teamRepo;

    @RequestMapping("/list")
    public List<Team> getList(){
        return teamRepo.findAll();
    }
@PostMapping("add")
public Team addTeam(@RequestBody Team team){

    return teamRepo.save(team);

    //teams.add(team);
}

    }

