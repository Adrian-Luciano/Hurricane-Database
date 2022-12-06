package com.HurricaneDatabase.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.HurricaneDatabase.demo.model.User;
import com.HurricaneDatabase.demo.service.userService;
import com.HurricaneDatabase.demo.model.States;
import com.HurricaneDatabase.demo.service.stateService;
import com.HurricaneDatabase.demo.model.Metrics;
import com.HurricaneDatabase.demo.service.metricService;
import com.HurricaneDatabase.demo.model.Damage;
import com.HurricaneDatabase.demo.service.damageService;
import com.HurricaneDatabase.demo.model.Cyclone;
import com.HurricaneDatabase.demo.service.cycloneService;
import com.HurricaneDatabase.demo.model.Classification;
import com.HurricaneDatabase.demo.service.classService;
import com.HurricaneDatabase.demo.model.Basin;
import com.HurricaneDatabase.demo.service.basinService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class runQueries {
    @Autowired
	private userService user;
    @Autowired
	private stateService state;
    @Autowired
	private metricService metric;
    @Autowired
	private damageService damage;
    @Autowired
	private cycloneService cyc;
    @Autowired
	private classService classi;
    @Autowired
	private basinService bas;
    

    public List<User> getUsers(String username, String pass){
        return user.getAll();
    }
    public List<Cyclone> getCyclones(){
        return cyc.getAll();
    }
    public List<Basin> getBasin(){
        return bas.getAll();
    }
    public void saveCyclone(String name, int year){
        Cyclone temp = new Cyclone();
        temp.setName(name);
        temp.setYear(year);
        cyc.saveCyc(temp);
    }
    public List<Cyclone> getCycID(String name){
        return cyc.findByName(name);
    }

    public void getCycInfo(String name){
        List<Cyclone> get = cyc.findByName(name);
        int id = get.get(0).getId();
        List<Metrics> stats = metric.getMetrics(id);
        if(stats.isEmpty()){
            System.out.println("NO METRICS AVAILABLE");

        }else{
            System.out.println("Metrics: ");
        for(int i = 0; i < stats.size(); i++){
        System.out.print("|Latitude: " + stats.get(0).getLat());
        System.out.print(" |Longitude: " + stats.get(0).getLon());
        System.out.print(" |Wind speed: " + stats.get(0).getWind());
        System.out.print(" |longitude: " + stats.get(0).getLon());
        System.out.print(" |date:  " + stats.get(0).getDate());
        System.out.println(" |classification: " + stats.get(0).getClassi() + "|");
        }
    }

        List<States> states = state.affectedStates(id);
        if(states.isEmpty()){
            System.out.println("No states were affected or have been added");
        }
        else{
            System.out.println("States Affected: ");
            for(int i = 0; i < states.size(); i++){
                System.out.print("|" + states.get(i).getName() + "|");
            }
            System.out.println("");
        }

        List<Damage> dam = damage.getInfo(id);
        if(dam.isEmpty()){
            System.out.println("No damage stats available");
        }
        else{
            System.out.println("Damage: ");
            for(int i = 0; i < dam.size(); i++){
                System.out.print("|Cost: " + dam.get(i).getCost());
                System.out.print("|Death: " + dam.get(i).getDeath() +"|");
            }
            System.out.println("");
        }

        List<Classification> type = classi.findByID(id);
        if(type.isEmpty()){
            System.out.println("No classifications");
        }
        else{
            System.out.println("All Classifications: ");
            for(int i = 0; i < type.size(); i++){
                System.out.print("|Classification: " + type.get(i).getName() + "|");
            }
            System.out.println("");
        }

        List<Basin> where = bas.getBasin(id);
        if(where.isEmpty()){
            System.out.println("No classifications");
        }
        else{
            System.out.println("Basin:");
            System.out.print("|" + where.get(0).getName() + "|");
            System.out.println("");
        }
    }
}
