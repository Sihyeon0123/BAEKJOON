#include <stdio.h>
 
int main(void)
{
    int test_case;
    int T;
    setbuf(stdout, NULL);
    scanf("%d", &T);
    for (test_case = 1; test_case <= T; ++test_case){
        int input;
        int temp, len = 0;
        int arr[9] = {0};
        int arr2[9] = {0};
 
        scanf("%d",&input);
        temp = input;
        int min=input, max=input;
 
        // 자릿수 계산
        while(temp != 0){
            temp= temp/10;
            len++;
        }  
         
        // 스플릿
        for(int i=0; i<len; i++){
            arr[len-1-i] = input % 10;
            arr2[len-1-i] = input % 10;
            input = input / 10;
        }
         
        for(int i=0; i<len; i++){
            int temp = arr[i];
            for(int j=i+1; j<len; j++){
                for(int i=0; i<len; i++){
                    arr2[i] = arr[i];
                }   
                arr2[i] = arr2[j];
                arr2[j] = temp;
                 
                if(arr2[0] != 0){
                    int temp_value = 0;
                    for(int k=0; k<len; k++){
                        temp_value *= 10;
                        temp_value += arr2[k];
                    }    
 
                    if(min > temp_value){
                        min = temp_value;
                    }
                    if(max < temp_value){
                        max = temp_value;
                    }
                }
            }
        }
        printf("#%d %d %d\n",test_case, min, max);
         
    }
    return 0; 
}