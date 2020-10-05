package com.company;

import java.lang.reflect.Array;

public class Perceptron {


    float[] weights = new float[2];

    float learningRate = (float) 0.2;
    float bias ;

    int error;

    int[] desiredOutput ={1,1,1,1,-1,-1,-1};
    int output ;

    double[] apple1 = {0.21835,0.81884,1 };
    double[] apple2 = {0.14115,0.83535,1};
    double[] apple3 = {0.37022,0.8111,1};
    double[] apple4 = {0.31565,0.83101,1};
    double[] apple5 = {0.36484,0.8518,1};
    double[] apple6 = {0.46111,0.82518,1};
    double[] apple7 = {0.55223,0.83449,1};
    double[] apple8 = {0.16975,0.84049,1};
    double[] apple9 = {0.49187,0.80889,1};
    double[] pear1 = {0.14913,0.77104,-1};
    double[] pear2 = {0.18474,0.6279,-1};
    double[] pear3 = {0.08838,0.62068,-1};
    double[] pear4 = {0.098166,0.79092,-1};


    double allFruits[][] = {apple1, apple2 , apple3 , apple4 , apple5 , apple6 ,apple7 , apple8, apple9 , pear1 , pear2 , pear3 , pear4};











    int makeDecision( float v){

        if(v >= 0 ){

            return 1;
        } else {
            return  -1;
        }

    }


    void calculateOutput(){

        float v;

        // apple 1

        for (int i = 0; i < weights.length; i++) {

            weights[i] = (float) (Math.random() * (1 - (0)));
            System.out.println(" weights[" + i +"] for apple 1 = " +weights[i]);
        }

        bias = (float) (Math.random() * (1 - (0)));
        System.out.println("Bias = " + bias);


        v = (float) (apple1[0]*weights[0] + apple1[1]*weights[1] + bias);
        System.out.println("V for apple 1 = " + v);
        output = makeDecision(v);
        System.out.println("y for apple 1 = " + output);

        error = desiredOutput[0] - output;
        System.out.println("error before training for apple 1  = " + error);

        if(error != 0){


            for (int i = 0; i < 100; i++){
                weights[0]+= learningRate*error*apple1[0];
                weights[1] += learningRate*error*apple1[1];
                bias+=learningRate*error;

                v = (float) (apple1[0]*weights[0] + apple1[1]*weights[1] + bias);
                output=makeDecision(v);
                error=desiredOutput[0]-output;

            }
            System.out.println("error after training for apple 1  = " + error);


        }




        // apple 4


        for (int i = 0; i < weights.length; i++) {

            weights[i] = (float) (Math.random() * (1 - (0)));
            System.out.println(" weights[" + i +"] for apple 4 = " +weights[i]);
        }

        bias = (float) (Math.random() * (1 - (0)));
        System.out.println("Bias = " + bias);


        v = (float) (apple4[0]*weights[0] + apple4[1]*weights[1] + bias);
        System.out.println("V for apple 4 = " + v);
        output = makeDecision(v);
        System.out.println("y for apple 4 = " + output);

        error = desiredOutput[0] - output;
        System.out.println("error before training for apple 4  = " + error);

        if(error != 0){


            for (int i = 0; i < 100; i++){
                weights[0]+= learningRate*error*apple1[0];
                weights[1] += learningRate*error*apple1[1];
                bias+=learningRate*error;

                v = (float) (apple4[0]*weights[0] + apple4[1]*weights[1] + bias);
                output=makeDecision(v);
                error=desiredOutput[0]-output;

            }
            System.out.println("error after training for apple 4  = " + error);


        }




        // For pear 2

        // calculate v


        for (int i = 0; i < weights.length; i++) {

            weights[i] = (float) (Math.random() * (1 - (0)));
            System.out.println(" weights[" + i +"] for pear 2 = " +weights[i]);
        }

        v = (float) (pear2[0]*weights[0] + pear2[1]*weights[1] + bias);

        System.out.println("V = " + v);

         output = makeDecision(v);
        System.out.println("Output = " + output);

         error = desiredOutput[4] - output;
        System.out.println("Error = " + error);

         if(error != 0) {

             System.out.println("Error (before training) = " + error);

             for (int i = 0; i < 100; i++) {

                 weights[0] += learningRate * error * pear2[0];
                 weights[1] += learningRate * error * pear2[1];
                 bias+= learningRate*error;

                 v = (float) (pear2[0]*weights[0] + pear2[1]*weights[1] + bias);
                 output = makeDecision(v);
                 error = desiredOutput[4] - output;
             }

             System.out.println("Error (after training) = " + error);

         }

    }





}
