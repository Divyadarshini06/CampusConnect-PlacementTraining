#include <stdio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
    try
    {
        float a=10.0f;
        float b=0.0f;
        if (b==0.0f)
        throw runtime_error("afdsg");
        cout<<a;
    }
    catch(const std::exception& error)
    {
       cout<<"error:"<<error.what(); 
    }
    catch(...)
    {
        cout<<"complete";
    }
}