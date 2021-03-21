package com.homework.mymath;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = coeffs.length-1; i >= 0 ; i--){
            if(i == 1){
                result += coeffs[i] + "x" + "+";
            }
            else if(i != 0){
                result += coeffs[i] + "x^" + i + "+";
            }
            else{
                result += coeffs[i];
            }
        }
        return result;
    }

    public double evaluate(double x){
        double result = 0;
        for(int i = coeffs.length-1; i>=0;i--){
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        double[] newCoeffs;
        //для сложения полиномов разной длины выбираем наибольший из них
        if(this.coeffs.length < right.coeffs.length){
            newCoeffs = right.coeffs.clone();
            int smallLength =  this.coeffs.length;
            for(int i = 0; i < smallLength; i++){
                newCoeffs[i] += this.coeffs[i];
            }
        }
        else{
            newCoeffs = this.coeffs.clone();
            int smallLength =  right.coeffs.length;
            for(int i = 0; i < smallLength; i++){
                newCoeffs[i] += right.coeffs[i];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        int newSize = this.coeffs.length + right.coeffs.length - 1;
        double[] newCoeffs = new double[newSize];
        for(int i = 0; i < this.coeffs.length; i++){
            for(int j = 0; j < right.coeffs.length;j++){
                newCoeffs[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
