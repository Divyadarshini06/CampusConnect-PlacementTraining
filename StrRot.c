#include <stdio.h>
#include <string.h>

int main() {
    char str[100], temp[100];
    int n, len, i, j = 0;

    printf("Enter the string: ");
    scanf("%s", str);

    printf("Enter number of rotations: ");
    scanf("%d", &n);

    len = strlen(str);
    n = n % len;   // Handle rotations greater than string length

    // Copy characters from nth position to end
    for (i = n; i < len; i++) {
        temp[j++] = str[i];
    }

    // Copy first n characters
    for (i = 0; i < n; i++) {
        temp[j++] = str[i];
    }

    temp[j] = '\0';

    printf("Rotated String: %s\n", temp);

    return 0;
}