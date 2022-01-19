/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecules;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
public class State {
    int structure;
    String name;
    int weight;
    Scanner sc= new Scanner(System.in);
    public State(int structure, String name, int weight) {
       
       this.structure = structure;
        this.name = name;
        this.weight = weight;
      
    }

    public int getStructure() {
        return structure;
    }

    public void setStructure(int structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    } 

    @Override
    public String toString() {
        return "State{" + "structure=" + structure + ", name=" + name + ", weight=" + weight + '}';
    }
    public boolean check(int i){
        boolean result;
        if(i>100) result=false;
        else result=true;
        return result;
    }
}
