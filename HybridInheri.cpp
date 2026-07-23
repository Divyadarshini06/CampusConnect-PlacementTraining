#include <iostream>
using namespace std;

class Parent1
{
public:
    void add(int a, int b)
    {
        cout << "Addition: " << a + b << endl;
    }
};

class Parent2
{
public:
    void sub(int a, int b)
    {
        cout << "Subtraction: " << a - b << endl;
    }
};

// Multilevel Inheritance
class Child1 : public Parent1
{
public:
    void mul(int a, int b)
    {
        cout << "Multiplication: " << a * b << endl;
    }
};

// Multiple Inheritance
class Child2 : public Child1, public Parent2
{
public:
    void div(int a, int b)
    {
        cout << "Division: " << a / b << endl;
    }
};

int main()
{
    Child2 obj;

    obj.add(10, 40);
    obj.sub(30, 10);
    obj.mul(2, 5);
    obj.div(20, 5);

    return 0;
}