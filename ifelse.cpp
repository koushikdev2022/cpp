#include<iostream>
#include<iomanip>
using namespace std;


int main(){
    int age;
    cout<<"insert your age";
    cin>>age;
    if(age>0){
        cout<<"you are adult";
    }else{
        cout<<"you are kid";
    }
    switch(age){
        case 18:
           cout<<"you are adult";
           break;
        case  22:  
           cout<<"you are above adult";
           break;
        default:
             break;
    }

    for (int i;i<4;i++){
         cout<<"vaule of i"<<i<<endl;
    };

    int f = 0;
    while(f<=40){
         cout<<"vaule of f"<<f<<endl;
         f++;
    };
    do{
        cout<<"vaule of f"<<f<<endl;
         f++;
    }while(f<=40);
    return 0;
}