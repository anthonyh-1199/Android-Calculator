package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {
    private final AppCompatActivity parent;
    private BigDecimal lValue , rValue; //number1 is the current solution stored in the calculator, number2 is the value used in whatever calculation is done to number1
    private StringBuilder inputbuffer; //Buffer for input values
    private String output, operationbuffer; //Buffer for operations

    public Calculator(AppCompatActivity parent) {
        this.parent = parent;
        // Initialize default operand values
        this.lValue  = BigDecimal.ZERO;
        this.rValue = BigDecimal.ZERO;

        // Initialize the input buffer
        this.inputbuffer = new StringBuilder("0");
        this.operationbuffer = "";
        this.output = "0";


    }

    public void process(String button) {

        //Input

        if ( button.equals( parent.getResources().getString(R.string.btn0) ) ) {
            // if the buffer isn't 0, add a 0 to the buffer
            if (!"0".equals(inputbuffer.toString())) {
                inputbuffer.append("0");
                rValue = new BigDecimal(inputbuffer.toString());
                output = inputbuffer.toString();
            } else {
                rValue = BigDecimal.ZERO;
                output = "0";
            }
        }

        if ( button.equals( parent.getResources().getString(R.string.btn1) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("1");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn2) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("2");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn3) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("3");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn4) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("4");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn5) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("5");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn6) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("6");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn7) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("7");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn8) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("8");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn9) ) ) {
            if ("0".equals(inputbuffer.toString())) {
                inputbuffer.replace(0, inputbuffer.length(), "");
            }
            inputbuffer.append("9");
            rValue = new BigDecimal(inputbuffer.toString());
            output = inputbuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDec) ) ) {
            if (!inputbuffer.toString().contains(".")) { //If the inputbuffer doesn't already have a decimal
                inputbuffer.append(".");
                rValue = new BigDecimal(inputbuffer.toString());
                output = inputbuffer.toString();
            }
        }

        //Operations

        if ( button.equals( parent.getResources().getString(R.string.btnPlus) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            //Put an addition operation in the operation buffer
            operationbuffer = "add";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMinus) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            //Put a subtraction operation in the operation buffer
            operationbuffer = "subtract";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDiv) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            //Put a subtraction operation in the operation buffer
            operationbuffer = "divide";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMul) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            //Put a subtraction operation in the operation buffer
            operationbuffer = "multiply";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnPer) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            //Put a subtraction operation in the operation buffer
            operationbuffer = "modulo";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnEq) ) ) {
            //Do the previous operation in the operation buffer
            operate();

            operationbuffer = "";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSqRt) ) ) {
            rValue = BigDecimal.valueOf((Math.pow(rValue .doubleValue(),0.5)));
            output = rValue.toString();
            inputbuffer.replace(0, inputbuffer.length(), "0");
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSign) ) ) {
            rValue = rValue.multiply(BigDecimal.valueOf(-1));
            output = rValue.toString();
            inputbuffer.replace(0, inputbuffer.length(), rValue.toString());;
    }

        if ( button.equals( parent.getResources().getString(R.string.btnClear) ) ) {
            // the "Clear" button was pressed; assign zero to operands and reset buffers
            inputbuffer.replace(0, inputbuffer.length(), "0");
            lValue = BigDecimal.ZERO;
            rValue = BigDecimal.ZERO;
            output = inputbuffer.toString();
            operationbuffer = "";
        }


    }

    public void operate(){
        switch(operationbuffer){
            case "add" :
                lValue = lValue.add(rValue);
                output = lValue.toString();
                rValue = lValue;
                inputbuffer.replace(0, inputbuffer.length(), "0");
                break;
            case "subtract" :
                lValue = lValue.subtract(rValue);
                output = lValue.toString();
                rValue = lValue;
                inputbuffer.replace(0, inputbuffer.length(), "0");
                break;
            case "divide" :
                if (rValue.compareTo(BigDecimal.ZERO) == 0){ //Divide by zero code
                    output = "Divide by zero error";
                    inputbuffer.replace(0, inputbuffer.length(), "0");
                    lValue = BigDecimal.ZERO;
                    rValue = BigDecimal.ZERO;
                    operationbuffer = "";
                } else {
                    lValue = lValue.divide(rValue);
                    output = lValue.toString();
                    rValue = lValue;
                    inputbuffer.replace(0, inputbuffer.length(), "0");
                    break;
                }
            case "multiply" :
                lValue = lValue.multiply(rValue);
                output = lValue.toString();
                rValue = lValue;
                inputbuffer.replace(0, inputbuffer.length(), "0");
                break;
            case "modulo" :
                lValue = lValue.remainder(rValue);
                output = lValue.toString();
                rValue = lValue;
                inputbuffer.replace(0, inputbuffer.length(), "0");
                break;
            default :
                lValue = rValue;
                output = lValue.toString();
                inputbuffer.replace(0, inputbuffer.length(), "0");
                break;
        }
    }

    public String getDisplay(){
        return output;
    }


}
