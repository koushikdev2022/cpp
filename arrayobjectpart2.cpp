#include<iostream>
using namespace std;


class Complex{
    int a;
    int b;
    public:
        void setNumber(int n1,int n2)
        {
            a=n1;
            b=n2;
        }
        void setData(int v1,int v2){
            a = v1;
            b = v2;
        }
        void setDataBysum(Complex a1,Complex a2){
            a = a1.a + a2.a;
            b = a1.b + a2.b;
        }
        friend Complex sumComplex(Complex o1,Complex o2);
        void printNumber(){
            cout<<"your complex number is"<<a<<"+i"<<b<<endl;
        }
};
Complex sumComplex(Complex o1,Complex o2){
    Complex o3;
    o3.setNumber((o1.a+o2.a),(o2.b+o2.b));
    return o3;
}
int main(){
    Complex c1,c2,c3;
    c1.setData(1,2);
    c1.printNumber();
    c2.setData(3,2);
    c2.printNumber();
    c3.setDataBysum(c1,c2);
    c3.printNumber();
    return 0;
}