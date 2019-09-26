#include <iostream>
#include <string>
using namespace std;

int main()
{
    std::cout << "Enter your first name" << endl;
    std::string firstName;
    std::cin >> firstName;

    std::cout << "Hi, " << firstName << "! This is the first C++ program you made" << endl;

    return 0;
}