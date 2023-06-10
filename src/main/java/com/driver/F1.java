package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Swift",4);

    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int newGears=1;
        if(newSpeed <= 10) {
            //Stop the car, set gear as 1
            newGears=1;
        } else if (newSpeed<=20) {
            newGears=2;
        }else if(newSpeed<=30){
            newGears=3;
        }else{
            newGears=4;
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeGear(newGears);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
