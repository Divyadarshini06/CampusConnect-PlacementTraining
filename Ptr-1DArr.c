<<<<<<< HEAD
#include<stdio.h>

int main(){
    int n,i;
    printf("Enter the size of the 1D array : ");
    scanf("%d",&n);
    int arr[n],*a;
    printf("Enter the elements of the 1D array : ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    a = &arr[0];
    printf("\nThe 1D array is... : \n");
    for(i=0;i<n;i++){
        printf("%d ",*(a+i));
    }
    


=======
#include<stdio.h>

int main(){
    int n,i;
    printf("Enter the size of the 1D array : ");
    scanf("%d",&n);
    int arr[n],*a;
    printf("Enter the elements of the 1D array : ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    a = &arr[0];
    printf("\nThe 1D array is... : \n");
    for(i=0;i<n;i++){
        printf("%d ",*(a+i));
    }
    


>>>>>>> 8ca45e29407e237a5dc6467aece1a43a5d613ccd
}