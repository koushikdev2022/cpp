#include <iostream>
using namespace std;

// Pass-by-value (won't work outside this function)
void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

// Pass-by-reference using pointers (this works)
void swapPoint(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int x = 4, y = 5;

    cout << "Before swapping: x = " << x << ", y = " << y << endl;
    
    swap(x, y); // This won't change x and y
    cout << "After swap (pass-by-value): x = " << x << ", y = " << y << endl;

    swapPoint(&x, &y); // This will actually swap x and y
    cout << "After swapPoint (pass-by-reference): x = " << x << ", y = " << y << endl;

    return 0;
}
