#include <stdio.h>
int main() {
	//Type your code
  int n,i,r=0,d,t;
  scanf("%d",&n);
  t=n;
  for(i=1;n>0;i++)
  {
    d=n%10;
    r=r+(d*d*d);
    n=n/10;
  }
  if(t==r)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}