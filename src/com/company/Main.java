package com.company;

public class Main {



    public static void main(String[] args) {




        Perceptron perceptron = new Perceptron();

        float[] weights = new float[2];
        float bias;
        float learningRate = (float) 0.2;

        double[] arr =  perceptron.calculateOutput(perceptron.initializeWeights(), perceptron.initializeBias());


           while (arr[0] != 0){

               weights[0]  = perceptron.updateWeight((float) arr[0], (int) arr[4], arr[1] , learningRate);
               weights[1]  = perceptron.updateWeight((float) arr[2], (int) arr[4], arr[3] , learningRate);
               bias =  perceptron.updateBias((float) arr[5] , (int) arr[4] ,learningRate);
               arr = perceptron.calculateOutput(weights, bias);

               System.out.println("Error = " + (int) arr[4]);
               System.out.println("weight[0] = " + (int) arr[0]);


           }









    }
}
