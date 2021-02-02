package com.tts;

import java.util.*;
import java.security.*;

    interface Food {

        String getType();
    }

    class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    class FoodFactory {
        // The FoodFactory class contains a method getFood(String) that
        // returns a new instance of Pizza or Cake according to its parameter.
        public Food getFood(String order) {

            Food theFood = null;
            if (order.equalsIgnoreCase("cake")) {
                theFood = new Cake();
            } else if (order.equalsIgnoreCase("pizza")) {
                theFood = new Pizza();
            }
            return theFood;
        }//End of getFood method

    }//End of FoodFactory class

    class Solution {

        public static void main(String args[]){
            Do_Not_Terminate.forbidExit();

            try{

                Scanner sc=new Scanner(System.in);
                //creating the factory
                FoodFactory foodFactory = new FoodFactory();

                //factory instantiates an object
                Food food = foodFactory.getFood(sc.nextLine());

                System.out.println("The factory returned "+food.getClass());
                System.out.println(food.getType());
            }
            catch (Do_Not_Terminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }

    }//end Solution class

    class Do_Not_Terminate {

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1L;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }//end Do_Not_Terminate class
