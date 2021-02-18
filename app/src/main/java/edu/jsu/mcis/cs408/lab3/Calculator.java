package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {
    private final AppCompatActivity parent;
    private BigDecimal lValue , rValue; //number1 is the current solution stored in the calculator, number2 is the value used in whatever calculation is done to number1
    private StringBuilder inputbuffer;
    private String output;

    public Calculator(AppCompatActivity parent) {
        this.parent = parent;
        // Initialize default operand values
        this.lValue  = new BigDecimal("0");
        this.rValue = new BigDecimal("0");

        // Initialize the input buffer
        this.inputbuffer = new StringBuilder("");
        this.output = "0";
    }

    public void process(String button) {

        if ( button.equals( parent.getResources().getString(R.string.btn0) ) ) {
            // if the buffer isn't 0, add a 0 to the buffer
            if (inputbuffer.length() != 0) {
                inputbuffer.append("0");
                rValue = new BigDecimal(inputbuffer.toString());
                output = inputbuffer.toString();
            } else {
                output = "0";
            }
        }

        if ( button.equals( parent.getResources().getString(R.string.btn1) ) ) {
            inputbuffer.append("1");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn2) ) ) {
            inputbuffer.append("2");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn3) ) ) {
            inputbuffer.append("3");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn4) ) ) {
            inputbuffer.append("4");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn5) ) ) {
            inputbuffer.append("5");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn6) ) ) {
            inputbuffer.append("6");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn7) ) ) {
            inputbuffer.append("7");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn8) ) ) {
            inputbuffer.append("8");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn9) ) ) {
            inputbuffer.append("9");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnPlus) ) ) {
            //add the values of lValue and rValue
            rValue = new BigDecimal(inputbuffer.toString());
            lValue.add(rValue);
            output = lValue.toString();
            inputbuffer.replace(0, inputbuffer.length(), "");
        }

        if ( button.equals( parent.getResources().getString(R.string.btnClear) ) ) {
            // the "Clear" button was pressed; assign zero to operands and reset buffers
            inputbuffer.replace(0, inputbuffer.length(), "");
            lValue = new BigDecimal(0);
            rValue = new BigDecimal(0);
            output = "0";
        }


    }

    public void add(){
        lValue .add(rValue);
    }

    public void subtract(){
        lValue .subtract(rValue);
    }

    public void divide(){
        lValue .divide(rValue);
    }

    public void multiply(){
        lValue .multiply(rValue);
    }

    public void negate(){
        lValue .negate();
    }

    public void squareroot(){
        //Converts number1 to a double to use Math.pow for calculating the square root
        lValue = BigDecimal.valueOf((Math.pow(lValue .doubleValue(),0.5)));
    }

    public void modulus(){
        lValue .remainder(rValue);
    }

    public String getDisplay(){
        return output;
    }


}
