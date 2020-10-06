package com.company;

import java.lang.reflect.Array;

public class Perceptron {


    float[] weights = new float[2];
    float learningRate = (float) 0.2;
    float bias ;
    int sumOfDesiredOutput;
    int sumOfReceviedOutput;

    int error;

    int[] desiredOutput ={1,1,1,1,-1,-1,-1};
    int[] receviedOutput = new int[7];
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







    int makeDecision( float v){

        if(v >= 0 ){

            return 1;
        } else {
            return  -1;
        }

    }



    float updateWeight(float weight , int error , double input , float learningRate){


            weight+= learningRate*error*input;



        return weight;
    }


    float updateBias(float bias , int error  , float learningRate){


            bias+= learningRate*error;


        return bias;
    }



    float[] initializeWeights(){

        for (int i = 0; i < weights.length; i++) {

            weights[i] = (float) (Math.random() * (1 - (0)));
//            System.out.println(" weights[" + i +"]  = " +weights[i]);
        }


        return weights;
    }



    float initializeBias(){

        // initializing bias between 0 and 1
        bias = (float) (Math.random() * (1 - (0)));
//        System.out.println("Bias = " + bias);

        return bias;
    }



    double[]  calculateOutput(float[] weights , float bias){

        float v;

        double[] zero = {0};

        System.out.println("*************** APPLES ****************");
            System.out.println();
            // apple 1

            // initializing weights between 0 and 1


            //calculating v
            v = (float) (apple1[0] * weights[0] + apple1[1] * weights[1] + bias);
            System.out.println("V for apple 1 = " + v);

            //calculating output
            output = makeDecision(v);
            System.out.println("y for apple 1 = " + output);
            receviedOutput[0] = output;


            System.out.println("error after training for apple 1  = " + error);


            System.out.println("*******************************");
            System.out.println();


            // apple 4


            v = (float) (apple4[0] * weights[0] + apple4[1] * weights[1] + bias);
            System.out.println("V for apple 4 = " + v);
            output = makeDecision(v);
            System.out.println("y for apple 4 = " + output);
            receviedOutput[1] = output;


            System.out.println("error after training for apple 4  = " + error);


            System.out.println("*******************************");
            System.out.println();

            // apple 7


            v = (float) (apple7[0] * weights[0] + apple7[1] * weights[1] + bias);
            System.out.println("V for apple 7 = " + v);
            output = makeDecision(v);
            System.out.println("y for apple 7 = " + output);


            receviedOutput[2] = output;


            System.out.println("*******************************");
            System.out.println();


            // apple 3


            //calculating v
            v = (float) (apple3[0] * weights[0] + apple3[1] * weights[1] + bias);
            System.out.println("V for apple 3 = " + v);
            //calculating output
            output = makeDecision(v);
            System.out.println("y for apple 3 = " + output);
            receviedOutput[3] = output;


            System.out.println("*************** PEARS ****************");
            System.out.println();

            // For pear 2


            v = (float) (pear2[0] * weights[0] + pear2[1] * weights[1] + bias);
            System.out.println("V = " + v);
            output = makeDecision(v);
            System.out.println("Output = " + output);
            receviedOutput[4] = output;


            System.out.println("*******************************");


            // For pear 4


            v = (float) (pear4[0] * weights[0] + pear4[1] * weights[1] + bias);

            System.out.println("V = " + v);

            output = makeDecision(v);
            System.out.println("Output for pear 4 = " + output);
            receviedOutput[5] = output;


            System.out.println("*******************************");

            // For pear 1

            v = (float) (pear1[0] * weights[0] + pear1[1] * weights[1] + bias);
            System.out.println("V = " + v);

            output = makeDecision(v);
            System.out.println("Output for pear 1 = " + output);
            receviedOutput[6] = output;


            System.out.println();
            System.out.print("desiredOutput[ ");
            for (int dO : desiredOutput) {
                sumOfDesiredOutput+=dO;
                System.out.print(dO + ",");
            }

            System.out.println("]");


            System.out.print("receviedOutput[ ");
            for (int ro : receviedOutput) {
                sumOfReceviedOutput+=ro;
                System.out.print(ro + ",");
            }

            System.out.println("]");

            if((desiredOutput[0] - receviedOutput[0]) != 0){
                double[] arr = {weights[0],apple1[0] ,weights[1] ,  apple1[1] ,desiredOutput[0] - receviedOutput[0] , bias };
                return arr;
            } else if((desiredOutput[1] - receviedOutput[1]) != 0){
                double[] arr = {weights[0], apple4[0] , weights[1],apple4[1] ,desiredOutput[1] - receviedOutput[1], bias };
                return arr;
            } else if((desiredOutput[2] - receviedOutput[2]) != 0){
                double[] arr = {weights[0], apple7[0] , weights[1], apple7[1] ,desiredOutput[2] - receviedOutput[2] , bias};
                return arr;
            } else if((desiredOutput[3] - receviedOutput[3]) != 0){
                double[] arr = {weights[0],apple3[0] ,weights[1], apple3[1] ,desiredOutput[3] - receviedOutput[3], bias };
                return arr;
            } else if((desiredOutput[4] - receviedOutput[4]) != 0){
                double[] arr = {weights[0],pear2[0] , weights[1],pear2[1] ,desiredOutput[4] - receviedOutput[4] , bias};
                return arr;
            }else if((desiredOutput[5] - receviedOutput[5]) != 0){
                double[] arr = {weights[0],pear4[0] ,weights[1], pear4[1] ,desiredOutput[5] - receviedOutput[5], bias };
                return arr;
            }else if((desiredOutput[6] - receviedOutput[6]) != 0){
                double[] arr = {weights[0], pear1[0] ,weights[1], pear1[1] ,desiredOutput[6] - receviedOutput[6] , bias};
                return arr;
            } else {
                return zero ;
            }





//        System.out.println("*************** Other fruits ****************");
//        System.out.println();
//
//
//
//        System.out.println();
//        System.out.println("Apple 2 ");
//        System.out.println();
//
//
//
//        v = (float) (weights[0]*apple2[0] + weights[1]*apple2[1] + bias);
//        output = makeDecision(v);
//        System.out.println(" output for apple 2  = " + output);
//
//        System.out.println();
//        System.out.println("Apple 4 ");
//        System.out.println();
//
//
//
//        v = (float) (weights[0]*apple4[0] + weights[1]*apple4[1] + bias);
//        output = makeDecision(v);
//        System.out.println(" output for apple 4  = " + output);
//
//
//        System.out.println();
//        System.out.println("Apple 7");
//        System.out.println();
//
//
//
//        v = (float) (weights[0]*apple7[0] + weights[1]*apple7[1] + bias);
//        output = makeDecision(v);
//        System.out.println(" output for apple 7  = " + output);
//
//        System.out.println();
//        System.out.println("Apple 3 ");
//        System.out.println();
//
//
//
//        v = (float) (weights[0]*apple3[0] + weights[1]*apple3[1] + bias);
//        output = makeDecision(v);
//
//        System.out.println(" output for apple 3  = " + output);
//
//
//
//        // pear
//
//
//        System.out.println();
//        System.out.println("Pear 3 ");
//        System.out.println();
//
//        v = (float) (weights[0]*pear3[0] + weights[1]*pear3[1] + bias);
//        output = makeDecision(v);
//
//        System.out.println(" output for pear 3  = " + output);

        }


    }







