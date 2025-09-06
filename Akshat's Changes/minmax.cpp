#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    int min=0;
    int max=0;
    vector<int>a={0,1,2,3,4,5,6,7,8,9,10};
    for(int i=0;i< a.size();i++){
        if(a[i]<=min){
            min=a[i];
        }
        if(a[i]>=max){
            max=a[i];
        }
    }
    cout<<"min: "<<min<<endl;
    cout<<"max: "<<max<<endl;
    return 0;
}