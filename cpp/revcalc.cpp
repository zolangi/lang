/*
Revenue Calculator
*/

#include <iostream>
using namespace std;

int main()
{
    int installations, installrevenue;
    double yards, footCable, yardrevenue, totalRevenue;
    const double BASE_CHARGE = 25.00, COST_PER_FT= 2.00;
    cout << "Enter the amount of installations: " << endl;
    cin >> installations;
    cout << "Enter the total of yards of cable installed: " << endl;
    cin >> yards;
    
    installrevenue = 25 * installations;
    footCable = yards * 3;
    yardrevenue = footCable * COST_PER_FT;
    totalRevenue = installrevenue + yardrevenue;

    cout << "The total revenue earned is $" << totalRevenue << endl;

    return 0;
}