#include<iostream>
using namespace std;

struct employee{
    int eid;
    string name;
    float salary;
};


typedef struct inturn{
    int eid;
    string name;
    float salary;
}ep;

union money{
    int rice;
    char car;
    float pound;
};

int main(){
    struct employee harry;
    union money anyOne;

    enum Meal{breakfast,lunch,dinner};
    cout<<lunch<<endl;
    harry.eid = 1;
    harry.name ="koushik";
    harry.salary = 12.90;

  
    return 0;
}