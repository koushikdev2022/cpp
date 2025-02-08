#include<iostream>
using namespace std;

class Employee{
    private:
        int a,b,c;

    public:
        int d,e;
        void setData(int a1,int b1,int c1);//Declear  
        void getData(){
            cout<<"The value of a is"<<a<<endl;
        }
};

void Employee :: setData(int a1, int b1, int c1){
    a = a1;
    b = b1;
    c = c1;
}

int main(){
    Employee koushik;

    koushik.d = 5;
    koushik.e = 6;
    koushik.setData(1,2,3);
    koushik.getData();
    return 0;
}