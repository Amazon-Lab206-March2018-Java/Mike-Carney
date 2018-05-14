function sort(arr);
var count = arr.length;
while (count > 0){
    for(var i = 0; 1 < count; i++){
        if (arr[i] > arr[i+1]){
            temp1 = arr[i];
            temp2 = arr[i+1];
            arr[i] = temp2;
            arr[i+1]=temp1;
        }
    }
    count --;
}

