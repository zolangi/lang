/*
Calculate the weight of a sphere using its radius

Radius (feet)
Density (pounds/cubic feet)
weight (pounds and tons)
*/
#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    double radius, density, weight, length;
    const double PI = 3.14159;
    cout << "Enter the radius (feet) of the ball" << endl;
    cin >> radius;
    cout << "Enter the density (pounds/cubic feet) of the ball" << endl;
    cin >> density;

    weight = density * ((4.0 * PI * pow(radius,3) )/3.0);

    cout << "The weight of the ball is " << weight << " pounds. Or "<< weight/2000 <<" tons." << endl;

    return 0;
}