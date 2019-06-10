#include <stdio.h>
int main() {
	//Type your code
  int n,i,t;
  scanf("%d",&n);
  t=n;
  for(i=0;i<=2*t;i++)
  {
    if(i%2==1)
      printf("%d\n",i);
  }
	return 0;
}