# Android-Calculator

## Description

A simple Android application that provides a calculator that performs basic operations. The user interacts with the application through a responsive button-based interface.

This project was developed for a college course using Google's official Android IDE, Android Studio.

## How It Works

The calculator tracks and stores the current state of the calculator through a series of buffers:
- An input buffer that tracks the current values of the operands
- An operation buffer that tracks the current operation
- An output buffer that updates the UI according to the user's input and operations' results

Each button passes its value into the process() method, which interacts with the buffers and calls the operate() function to perform the buttons' respective calculations.

## Sample Screenshot

![alt text](https://i.imgur.com/fww9T5k.png)
