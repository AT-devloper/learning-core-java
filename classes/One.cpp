# include<iostream>
using namespace std;
int main()
{
int a=1;
sp:
if(a<=10){
cout<<2*a;
a++;

goto sp;}
}