package com.esther.lab.wk04;

public class BMI {
    private double weightKG;
    private double heightMeter;
    private static final double POUNDTOKG = 0.45359237;
    private static final double INCHTOM = 0.0254;

    public void setWeightKG(float weightPound){
        this.weightKG = weightPound*POUNDTOKG;
        //this.weightPound refers to line 4 attribute.
        // weightPound refers to arg.
    }

    public void setHeightMeter(float heightInch){
        this.heightMeter = heightInch*INCHTOM;
    }
    public double getBMI(){
        return(weightKG/(Math.pow(heightMeter, 2)));
    }

}
