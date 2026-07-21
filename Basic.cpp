#include<stdio.h>
#include<iostream>
using namespace std;

class abc
{
    public :
       void add(int a,int b)
       {
        cout<<a+b<<std::endl;
       }
};
int main()
{
    abc d;
    d.add(15,20);
    return 0;
}