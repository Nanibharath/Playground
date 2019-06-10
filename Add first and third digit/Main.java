#include<stdio.h>
int main()
{
  //Type your code here
  int n,f,l,a;
  scanf("%d",&n);
  f=n/100;
  l=n%10;
  a=f+l;
  printf("%d",a);
  return 0;
}