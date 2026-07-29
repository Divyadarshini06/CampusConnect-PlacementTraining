<<<<<<< HEAD
#include <stdio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class abc
{
    public :
    void operations(int a,int b)
    {
        cout<<a+b<<std::endl;
    }
   
};
class abcd
{
    public :
    void operations(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
   
};
int main()
{
    abc cs;
   abcd it;
   cs.operations(5,6);
   it.operations(15,7);
=======
#include <stdio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class abc
{
    public :
    void operations(int a,int b)
    {
        cout<<a+b<<std::endl;
    }
   
};
class abcd
{
    public :
    void operations(int a,int b)
    {
        cout<<abs(a-b)<<std::endl;
    }
   
};
int main()
{
    abc cs;
   abcd it;
   cs.operations(5,6);
   it.operations(15,7);
>>>>>>> 8ca45e29407e237a5dc6467aece1a43a5d613ccd
}