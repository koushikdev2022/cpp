#include<iostream>
#include<iomanip>
using namespace std;

int sum(int a,int b){
    int c = a+b;
    return c;

};

//function  prototypeing for def 

int def(int a,int b);
int main(){
    int d =  sum(1,2);
    int f = def(1,2);
    cout<<"sum is "<<d;
    cout<<"def is "<<f;
    return 0;
}


int def(int a,int b){
    int c = b-a;
    return c;

};