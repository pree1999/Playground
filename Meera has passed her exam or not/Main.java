#include<iostream>
int main()
{
  int n,high,c=0;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    std::cin>>arr[i];
  }
  std::cin>>high;
  for(int i=0;i<n;i++){
    if(high==arr[i]){
      c++;
      break;
    }
  }
  if(c!=0)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
  
}