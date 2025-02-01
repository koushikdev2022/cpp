#include<iostream>
using namespace std;

int main(){
    int marks[4] = {1, 3, 5, 6};  // Correct
    
    int math[] = {1, 6, 7, 8};  // Fixed array initialization
    
    int mathMarks[4];  // Correct
    mathMarks[0] = 5;
    mathMarks[1] = 34;

    //pointer arrithmatic  adress new = address current + i*sizeof datatype
    //pointer and array

    int* p = marks;
    
    cout<<"the value of marks[0] is  "<<*p<<endl;
    cout<<"the value of marks[0] is  "<<*(p+1)<<endl;
    cout<<"the value of marks[0] is  "<<*(p+2)<<endl;
    cout<<"the value of marks[0] is  "<<*(p+3)<<endl;
    return 0;
}