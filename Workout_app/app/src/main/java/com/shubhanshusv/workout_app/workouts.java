package com.shubhanshusv.workout_app;

import java.util.ArrayList;
import java.util.List;


public class workouts {

    List<String> load_workouts(String bodypart){

        List<String> workout = new ArrayList<String>();

        if(bodypart.equals("Chest")){

            workout.add("Bench Press");

        }else if(bodypart.equals("Biceps")){

            workout.add("Bicep curls");

        }else if(bodypart.equals("Back")){

            workout.add("Back exercise");

        }else if(bodypart.equals("Triceps")){

            workout.add("triceps");


        }else if(bodypart.equals("Shoulder")){

            workout.add("Shoulder press");


        }else if(bodypart.equals("Legs")){

            workout.add("Squats");


        }else if(bodypart.equals("Abs")){

            workout.add("Crunches");


        }




        return workout;



    }


}
