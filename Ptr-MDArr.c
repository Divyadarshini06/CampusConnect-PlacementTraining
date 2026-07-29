<<<<<<< HEAD


#include<stdio.h>

int main(){
    int r,c,i,j;
    printf("Enter the number of rows and columns : ");
    scanf("%d %d",&r,&c);
    int arr[r][c],*a;
    printf("\nEnter the elements of the Multi-Dimensional array : ");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    a = &arr[0][0];
    printf("\nThe Multi-Dimensional array is : \n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            printf("%d ",*(a+(i*c)+j));
        }
        printf("\n");
    }

=======


#include<stdio.h>

int main(){
    int r,c,i,j;
    printf("Enter the number of rows and columns : ");
    scanf("%d %d",&r,&c);
    int arr[r][c],*a;
    printf("\nEnter the elements of the Multi-Dimensional array : ");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    a = &arr[0][0];
    printf("\nThe Multi-Dimensional array is : \n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            printf("%d ",*(a+(i*c)+j));
        }
        printf("\n");
    }

>>>>>>> 8ca45e29407e237a5dc6467aece1a43a5d613ccd
}