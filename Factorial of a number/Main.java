#include<iostream>
int main(){
  int n,fac=1;
  std::cin>>n>>fac;
  for(int i=1;i<=n;i++){
    fac=fac*i;}
  std::cout<<fac;
}