#include<iostream>
using namespace std;

int add(int a,int b){
    cout<<"hi";
    return a+b;
}

int add(int a,int b, int c){
      cout<<"by";
    return a+b+c;
}

int main(){


    cout<<"this is"<<add(1,2)<<endl;
    cout<<"this is"<<add(1,2,3)<<endl;
    return 0;
}