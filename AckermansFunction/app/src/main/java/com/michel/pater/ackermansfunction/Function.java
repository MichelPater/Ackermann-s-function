package com.michel.pater.ackermansfunction;

/**
 * Created by Michel on 2/13/2015.
 */
public class Function {

    public int ackermansFunction(int firstArgument, int secondArgument) {
        int result;


        if( firstArgument == 0)
        {
            result = secondArgument +1;
        }
        else if(secondArgument == 0){
            result = ackermansFunction(firstArgument -1, 1);
        }
        else
        {
            result = ackermansFunction(firstArgument -1, ackermansFunction(firstArgument, secondArgument -1));
        }
        return result;

    }




}
