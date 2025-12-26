/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let curr = init;

    for(let i=0; i<nums.length;i++){
        curr = fn(curr,nums[i]);
    }

    return curr;
};