#include<iostream>
using namespace std;

class Koushik{
    int id;
    int salary;

    public:
        void setId(void){
            salary = 122;
            cout<<"Enter the id"<<endl;
            cin>>id;
        }
        void getId(void){
            cout<<"the id id "<<id<<endl;
        }
      
};
int main(){
   Koushik k,m,l;
   Koushik f[4];
   for(int i=0 ; i<4;i++){
     f[i].setId();
     f[i].getId();
   }

   k.setId();
   k.getId();
   return 0;
}