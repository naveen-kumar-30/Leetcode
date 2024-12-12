class Solution {
public:
    vector<int> sortArray(vector<int>& arr) {
    qsort(arr,0,arr.size()-1);
        return arr;
    }
    void qsort(vector<int> &arr,int low,int high){
        if(low<high){
           int Pindex = partion(arr,low,high);
            qsort(arr,low,Pindex-1);
            qsort(arr,Pindex+1,high);
        }
    }
    int partion(vector<int> &arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr[i],arr[j]); 
            }
        }
            swap(arr[low],arr[j]);
        return j;
    }

    
};