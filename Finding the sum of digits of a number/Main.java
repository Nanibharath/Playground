#include <stdio.h>
int main() {
	//Type your code
  int n,r,sum=0,t;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
    r=t%10;
    sum=sum+r;
    t=t/10;
  }
  printf("%d",sum);
	return 0;
}