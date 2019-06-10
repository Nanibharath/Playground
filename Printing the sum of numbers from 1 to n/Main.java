#include <stdio.h>
int main() {
	//Type your code
  int n,i;
  scanf("%d",&n);
  int sum=0;
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
    printf("%d",sum);
	return 0;
}