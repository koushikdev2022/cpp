#include<iostream>
using namespace std;
 class Koushik{
    int num;
    public:
        void read(void);
        void write(void);
 };


void Koushik::read(void) {
    int num;
    cout << "Enter the num: ";
    cin >> num;

}

void Koushik::write(void){
    cout << "Enter the num: "<<num;
}
int main(){
    Koushik s;
    s.read();
    s.write();
    return 0;
}