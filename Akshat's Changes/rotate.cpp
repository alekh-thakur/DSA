#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    vector <int> a={0,1,2,3,4,5,6,7,8,9,10};
    int k;
    cout<<"Enter K:";
    cin>>k;
    rotate(a.begin(),a.begin()+k,a.end());
    for(int i=0;i<a.size();i++){
        cout<<a[i]<<" ";
    }
}