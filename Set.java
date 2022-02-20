import java.io.*;
import java.util.*;


public class Set {
    private String[] common;
    private int commons;
    private String[] uncommon;
    private int uncommons;
    private String[] rare;
    private int rares;
    private String[] mythic;
    private int mythics;
    private String[] land;
    private int lands;
    private String[] nonStandard;
    private int nonStandards;
  
  
    Random rand;
    Scanner infile; //load from txt file

    public Set(String name) throws Exception
    {
        infile = new Scanner(new File(name+".txt")); //create scanner
        rand = new Random(); //generator for random random numbers

        commons = infile.nextInt(); //load quantities and initilize arrays
        System.out.println(commons);
        common = load(commons);
        uncommons = infile.nextInt();
        uncommon  = load(uncommons);
        rares = infile.nextInt();
        rare = load(rares);
        mythics = infile.nextInt();
        mythic  = load(mythics);
        lands = infile.nextInt();
        land= load(lands);
        nonStandards = infile.nextInt();
        nonStandard= load(nonStandards);
        infile.close();


    }

    private String[] load(int amount)
    {
        String[] list = new String[amount];
        for (int i = 0; i < amount; i++)
        {
            list[i] = infile.nextLine();
        }
        return list;
    }

    public void print()
    {
        for (int i = 0; i < common.length; i++)
        {
            System.out.println(common[i]);
        }
    }

}
