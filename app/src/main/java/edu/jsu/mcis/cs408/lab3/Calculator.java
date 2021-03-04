package edu.jsu.mcis.cs408.lab3;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class Calculator {
    private final AppCompatActivity parent;
    private BigDecimal leftOperand , rightOperand; //number1 is the current solution stored in the calculator, number2 is the value used in whatever calculation is done to number1
    private StringBuilder inputBuffer ; //Buffer for input values
    private String outputBuffer, operationBuffer ; //Buffer for operations
    private boolean inputAccumulate; //True - input is appended to the current input value; False - input replaces the current input value

    public Calculator(AppCompatActivity parent) {
        this.parent = parent;
        // Initialize default operand values
        this.leftOperand = null;
        this.rightOperand = null;

        // Initialize the input buffer
        this.inputBuffer = new StringBuilder("0"); //Default input value is 0
        this.operationBuffer = "";
        this.outputBuffer = "0";

        //Set accumulate switch to false
        this.inputAccumulate = false;
    }

    public void process(String button) {

        //Input

        if ( button.equals( parent.getResources().getString(R.string.btn0) ) ) {
            // if the input buffer isn't currently 0
            if (!"0".equals(inputBuffer.toString())) {
                //If accumulate is true, append a 0
                if (inputAccumulate = true) {
                    inputBuffer.append("0");
                } else { //If accumulate is false, replace the current input buffer with 0
                    inputBuffer.replace(0, inputBuffer.length(), "0");

                }
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn1) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "1");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("1");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn2) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "2");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("2");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn3) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "3");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("3");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn4) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "4");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("4");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn5) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "5");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("5");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn6) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "6");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("6");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn7) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "7");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("7");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn8) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "8");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("8");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btn9) ) ) {
            //If the buffer is 0 or accumulate = false
            //Replace the current input buffer and make accumuluate = true
            if (("0".equals(inputBuffer.toString()) || inputAccumulate == false)){
                inputBuffer.replace(0, inputBuffer.length(), "9");
                inputAccumulate = true;
            } else {
                //If the buffer isn't 0 and accumulate = true
                //Append the digit to the input buffer
                inputBuffer.append("9");
            }
            //Update the output buffer
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDec) ) ) {
            //If the input buffer doesn't already contain a decimal, append one
            if (!inputBuffer.toString().contains(".")) {
                inputBuffer.append(".");
                //Update the output buffer
                outputBuffer = inputBuffer.toString();
            }
        }

        //Operations

        if ( button.equals( parent.getResources().getString(R.string.btnPlus) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();

            //Put an addition operation in the operation buffer
            operationBuffer = "add";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMinus) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();

            //Put an addition operation in the operation buffer
            operationBuffer = "subtract";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnDiv) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();

            //Put an addition operation in the operation buffer
            operationBuffer = "divide";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnMul) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();

            //Put an addition operation in the operation buffer
            operationBuffer = "multiply";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnPer) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();

            //Put an addition operation in the operation buffer
            operationBuffer = "modulo";
        }

        if ( button.equals( parent.getResources().getString(R.string.btnEq) ) ) {
            //Convert the input buffer and store it as an operand
            if (leftOperand == null){
                leftOperand = new BigDecimal(inputBuffer.toString());
            } else {
                rightOperand = new BigDecimal(inputBuffer.toString());
            }

            //If the operation buffer isn't empty, calculate its operation
            if (operationBuffer != null) {
                operate();
            }

            //Update the output buffer to show the answer of the previous operation (stored in leftOperand)
            outputBuffer = leftOperand.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSqRt) ) ) {
            //Take the current input buffer value and replace it with its square root
            BigDecimal temp = new BigDecimal(inputBuffer.toString());
            temp = BigDecimal.valueOf((Math.pow((temp.doubleValue()),0.5)));
            inputBuffer.replace(0, inputBuffer.length(), temp.toString());
            outputBuffer = inputBuffer.toString();
        }

        if ( button.equals( parent.getResources().getString(R.string.btnSign) ) ) {
            //Take the current input buffer value and replace it with its value * -1
            BigDecimal temp = new BigDecimal(inputBuffer.toString());
            temp = temp.multiply(BigDecimal.valueOf(-1));
            inputBuffer.replace(0, inputBuffer.length(), temp.toString());
            outputBuffer = inputBuffer.toString();
    }

        if ( button.equals( parent.getResources().getString(R.string.btnClear) ) ) {
            // the "Clear" button was pressed; assign default values and reset buffers

            // Default operand values
            leftOperand = null;
            rightOperand = null;

            // Reset the buffers
            inputBuffer.replace(0, inputBuffer.length(), "0");; //Default input value is 0
            operationBuffer = null;
            outputBuffer = "0";

            //Set accumulate switch to false
            inputAccumulate = false;
        }


    }

    public void operate(){

        //If the leftOperand is null, abort
        if (leftOperand != null) {

            //If the rightOperand is null, use the leftOperand value
            if (rightOperand == null) {
                rightOperand = leftOperand;
            }

            //Perform the operation stored in the buffer
            switch (operationBuffer) {
                case "add":
                    leftOperand = leftOperand.add(rightOperand); //Add the operands together
                    break;
                case "subtract":
                    leftOperand = leftOperand.subtract(rightOperand); //Subtract the leftOperand by the rightOperand
                    break;
                case "divide":
                    if (rightOperand.compareTo(BigDecimal.ZERO) == 0) { //If the rightOperand is 0, do divide by zero error
                        //TO-DO
                    } else {
                        leftOperand = leftOperand.divide(rightOperand); //Divide the left operand by the right operand
                        break;
                    }
                case "multiply":
                    leftOperand = leftOperand.multiply(rightOperand); //Multiply the operands
                    break;
                case "modulo":
                    leftOperand = leftOperand.remainder(rightOperand); //Get the remainder of the operands
                    break;
                default:
                    break;
            }
            outputBuffer = leftOperand.toString(); //Update the output buffer
            inputBuffer.replace(0, inputBuffer.length(), leftOperand.toString()); //Update the input buffer
            inputAccumulate = false; //Set accumulate to false
        }
    }

    public String getDisplay(){
        return outputBuffer;
    }


}
