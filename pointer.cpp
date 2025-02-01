#include<iostream>
using namespace std;

int main(){
    int a = 3;
    int* b = &a;
    //& --> Adress of operator
    //* ---> Dereference operator
    cout<<"this is b pointer value a adress   "<<b<<endl;
    cout<<"this is b pointer value a adress   "<<*b<<endl;


    //pointer to pointer
    int** c = &b;
    cout<<"this is c pointer value b adress   "<<c<<endl;
    cout<<"this is c pointer value b adress   "<<*c<<endl;
    cout<<"this is c pointer value b adress   "<<**c<<endl;

    return 0;
}