#include<iostream.h>
main()
{int N,A[50],result=0,op;
cout<<"Calculator"<<endl;
cout<<"Menu"<<endl;
cout<<"1.Addition"<<endl;
cout<<"2.Subtraction"<<endl;
cout<<"3.Multiplication"<<endl;
cout<<"4.Division"<<endl;
cout<<"Enter number 1 to 4"<<endl;
cin>>op;
cout<<"Enter value of N"<<endl;
cin>>N;
for(int i=0;i<N;i++)
{
cout<<"Enter next value"<<endl;
cin>>A[i];
}
switch(op){
case 1:for(i=0;i<N;i++){result+=A[i];}cout<<"Addition is "<<result<<endl;break;
case 2:for(i=0;i<N;i++){result-=A[i];}cout<<"Subtraction is "<<result<<endl;break;
case 3:result=1;for(i=0;i<N;i++){result*=A[i];}cout<<"Multiplication is "<<result<<endl;break;
case 4:result=1;for(i=0;i<N;i++){result/=A[i];}cout<<"Division is "<<result<<endl;break;
default:cout<<"Enter number between 1 to 4"<<endl;break;
}
}