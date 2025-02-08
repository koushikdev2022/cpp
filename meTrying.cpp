#include<iostream>
using namespace std;

class Koushik{
    public:
        void name(int a, int b){
            cout<<"full sum"<<a+b;
        }
};
int main(){
    Koushik k;
    k.name(1,2);
    return 0;
}