// build MaxHeap
// Created by Yancheng Lu on 2020/11/4.
#include <iostream>
using namespace std;

class MaxHeap {
private:
    vector<int> heap;
    int size;

public:
    void BuildMaxHeap(int A[], int len){
        for(int i = len/2; i >= 0; i--){
            HeapAdjust(A, i, len);
        }
    }
    void HeapAdjust(int A[],int k,int len){
        A[0]=A[k]; //A[0]暂存子树的根结点
        for(int i =2*k; i <= len; i*=2){
            if(i<len && A[i]<A[i+1]) i++; //取key较大的子结点的下标
            if(A[0]>=A[i]) break; //筛选结束
            else{
                A[k]=A[i]; //将A[i]调整到双亲结点上
                k=i; //修改k值，以便继续向下筛选
            }
        }
        A[k]=A[0]; //被筛选结点的值放入最终位置
    }
};

int main(){
    int A[10] = {0, 1, 3, 2, 6, 5, 7, 8, 9, 4};
    MaxHeap maxHeap;
    maxHeap.BuildMaxHeap(A, 10);
    for(int i = 0; i < 10; i++){
        cout << A[i] << " ";
    }
    return 0;
}