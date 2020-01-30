/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclubmanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C Bazaar
 */
abstract class players {

    private String name;
    private int age;
    private String contractNumber;
    private int jerseyNumber;
    private double salary;
    private int goal;
    private int assist;
    private int totalMatch;
    private int seasonGoal;
    private int seasonPlayingMatch;
    ArrayList<playersAgents> p;
    private double fitness;
    private int contractDuration;

    public players(String name, int age, String contractNumber, int jerseyNumber, double salary, int goal, int assist, int totalMatch, double fitness, int contractDuration) {
        this.name = name;
        this.age = age;
        this.contractNumber = contractNumber;
        this.jerseyNumber = jerseyNumber;
        this.salary = salary;
        this.goal = goal;
        this.assist = assist;
        this.totalMatch = totalMatch;
        this.fitness = fitness;
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double getFitness() {
        return fitness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSeasonGoal() {
        return seasonGoal;
    }

    public void setSeasonGoal(int season) {
        seasonGoal = seasonGoal + season;
    }

    public int getSeasonPlayingMatch() {
        return seasonPlayingMatch;
    }

    public void setSeasonPlayingMatch(int PlayingMatch) {
        seasonPlayingMatch = seasonPlayingMatch + PlayingMatch;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getGoal() {
        return goal;
    }

    public int getAssist() {
        return assist;
    }

    public int getTotalMatch() {
        return totalMatch;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGoal(int go) {
        goal = goal + go;
    }

    public void setTotalMatch(int total) {
        totalMatch = totalMatch + total;
    }

    abstract void getBonus();

    void checkSchdule() {
        String aa = " ", bb = " ", cc = " ";
        try {
            File f = new File("matchSchdule.txt");
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                aa = s.nextLine();
            }
        } catch (Exception e) {

        }
        System.out.println("Match:" + aa);

    }

}
