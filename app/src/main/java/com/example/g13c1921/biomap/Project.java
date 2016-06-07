package com.example.g13c1921.biomap;

/**
 * Created by g13c1921 on 2016-05-30.
 */

public class Project {
    private String projname;
    private long projID;
    private Theproject theproject;

    public enum Theproject { BOP, ECHINO, FISH, LACEWING, LEPI, MAMMAL,
    MUSHROOM, ODONATA, ORCHID, SCORPION,SPIDER}

    public Project(String projname, Theproject theproject){
        this.projname = projname;
        this.theproject = theproject;
        this.projID = 0;
    }

    public Project(String projname, Theproject theproject, long projID){
        this.projname = projname;
        this.theproject = theproject;
        this.projID = projID;
    }

    public String getProjname(){
        return projname;
    }

    public Theproject getTheproject(){
        return theproject;
    }

    public long getProjID(){
        return projID;
    }

    public String toString(){
        return "ID: " +projID + "Project Name: " + projname + "IconID: "
                + theproject.name();
    }

    public int getAssociatedDrawable(){
        return theprojectToDrawable(theproject);
    }

    public static int theprojectToDrawable(Theproject givenProject){
        switch (givenProject){
            case BOP:
                return  R.drawable.bop;
            case ECHINO:
                return R.drawable.echino;
            case FISH:
                return  R.drawable.fish;
            case LACEWING:
                return  R.drawable.lacewing;
            case LEPI:
                return  R.drawable.lepi;
            case MAMMAL:
                return  R.drawable.mammal;
            case MUSHROOM:
                return  R.drawable.mushroom;
            case ODONATA:
                return  R.drawable.odonata;
            case ORCHID:
                return  R.drawable.orchid;
            case SCORPION:
                return  R.drawable.scorpion;
            case SPIDER:
                return  R.drawable.spider;

        }
        return R.drawable.orchid;
    }

}
