/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let s = [];
    let j = 0;
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
           s[j++] = arr[i];
        }
    }

    return s;
};