#include <iostream>
using namespace std;

int main() {
    int a;
    
    cout << "Enter score to be graded: " << endl;
    cin >> a;

    if (a>95)  {
        cout << "Grade is A+";
    } else if (a >= 91 && a <= 95 ) {
        cout << "Grade is A";
    } else if (a >= 86 && a <= 90 ) {
        cout << "Grade is B+";
    } else if (a >= 81 && a <= 85 ) {
        cout << "Grade is B";
    } else if (a >= 76 && a <= 80 ) {
        cout << "Grade is C+";
    } else if (a >= 71 && a <= 75 ) {
        cout << "Grade is C";
    } else if (a >= 61 && a <= 70 ) {
        cout << "Grade is D";
    } else if (a >= 51 && a <= 60 ) {
        cout << "Grade is E";
    } else {
        cout << "Grade is F";
    }
}