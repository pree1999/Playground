#include<iostream>
int main()
{
    int m,n,mat[10][10];
    int r,c;
    std::cin>>m>>n;
    for(r=0;r<m;r++){
      for(c=0;c<n;c++){
        std::cin>> mat[r] [c];
      }
    }
    for(r=0;r<n;r++){
      for(c=0;c<m;c++){
        std::cout<< mat[c] [r]<<" ";
      }
      std::cout<<" \n";
    }
}