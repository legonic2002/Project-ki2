/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecules;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Legon
 */
public class Molecules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<State> list = new ArrayList<>();
        Behaviors p1 = new Behaviors();
        System.out.println("Leave the object in ArayList");
        p1.Constructor();
        p1.Display();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s ", "STRUCTUE", "NAME", "WEIGHT");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(State State: list){
            System.out.format("%10s %20s %20d ",
                    State.getStructure(), State.getName(), State.getWeight());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    }
    

