#include<iostream>
using namespace std;
int main()
{
int n,high=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  for(int i=0;i<n;i++){
  if(high<arr[i])
    high=arr[i];
}
cout<<high;
}