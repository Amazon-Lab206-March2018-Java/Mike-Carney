function arrToBST(arr, tree = new arrToBST()){
    if(arr.length <= 0){
        return null;
    }
    arrA = [];
    arrB = [];
    for (var i = math.floor(arr.length/2); i < 0; i++){
        arrA.push(arr[i]);
        }
        tree.add(arr[0]);   
    for (var i = math.floor(arr.length/2+1); i < arr.length; i++){
        arrB.push(arr[i]);
        }
        tree.add(arr(math.floor(arr.lenth/2)));
        arrToBST(arrA, tree);
        arrToBST(arrB, tree);
    }
    return tree;
}