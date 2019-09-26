/*
Simple Math Program

Options available:
    Addition
    Subtraction
    Multiplication
    Division
*/

#include <iostream>
#include <math.h>
#include <stdlib.h>
using namespace std;

void checkSolution(int userAnswer, int solution){
    if(userAnswer == solution){
        cout << "Correct" << endl;
    }
    else{
        cout << "Incorrect"<<endl;
    }
}

int prompt(int n1, int n2, string operation, string symbol){
    int userAnswer;
    cout << "You chose " <<  operation <<  ". You are practicing using numbers 1 - 10." << endl;
    cout << "Solve the following equation.\n" << n1 << symbol << n2 << " = ?" << endl;
    cin >> userAnswer;

    return userAnswer;
}

void add(int n1, int n2){
    int userAnswer;
    int sol = n1 + n2;
    userAnswer = prompt(n1, n2, "Addition", " + ");
    
    checkSolution(userAnswer, sol);
}

void sub(int n1, int n2){
    int userAnswer;
    int sol = n1 - n2;
    userAnswer = prompt(n1, n2, "Subtraction", " - ");

    checkSolution(userAnswer, sol);
}

void mult(int n1, int n2){
    int userAnswer;
    int sol = n1*n2;
    userAnswer = prompt(n1, n2, "Multiplication", " * ");

    checkSolution(userAnswer, sol);
}

void divide(int n1, int n2){
    int userAnswer;
    int sol = n1/n2;
    userAnswer = prompt(n1, n2, "Division", " / ");
    
    checkSolution(userAnswer, sol);
}

int main()
{
    int useroperation;
    
    cout << "Welcome to the Math Program where you can practice addition, subtraction, multiplication, and division!" << endl;
    cout << "Please chose which math operation you want to practice:\n(0)Addition\n(1)Subtraction" << endl << "(2)Multiplication" << endl << "(3)Division" << endl;
    cin >> useroperation;

    srand(time(0));

    int n1 = rand() % 10 + 1;
    int n2 = rand() % 10 + 1;

    switch (useroperation)
    {
    case 0:
        add(n1, n2);
        break;
    case 1:
        sub(n1, n2);
        break;
    case 2:
        mult(n1, n2);
        break;
    case 3:
        divide(n1, n2);
        break;
    }

    return 0;
}