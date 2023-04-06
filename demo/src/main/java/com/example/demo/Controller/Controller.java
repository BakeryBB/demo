
package com.example.demo.Controller;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Team;
 
@RestController
@RequestMapping("/team")
public class Controller {
 
private List<Team> teams = new ArrayList<Team>();

    @RequestMapping("/list")
    public List<Team> getList(){
        return teams;
    }
@PostMapping("add")
public void addTeam(@RequestBody Team team){

    teams.add(team);
}

    }

