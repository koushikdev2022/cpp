#include<iostream>
#include"this.h";
using namespace std;

int c = 45;
int main(){
   int a=5,b=6,c;
   c=a+b; 
   cout<<"the name is "<<c<<endl;
   cout<<"the globalc"<<::c<<endl;

   float d=34.4f;
   long double e =34.4l;


    cout<<"size of"<<sizeof(34.4f)<<endl;
     cout<<"size of"<<sizeof(34.4F)<<endl;
     cout<<"size of"<<sizeof(34.4l)<<endl;
     cout<<"size of"<<sizeof(34.4L)<<endl;
      cout<<"size of"<<sizeof(34.4)<<endl;
   //always f for float

   // refarance variable

   float x = 45;
   float & y = x;
   // type custing
   int a = 45;
    cout<<"size of"<<float(a)<<endl;
}