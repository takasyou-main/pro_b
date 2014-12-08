/*
フィボナッチ数列を求めるプログラム-メモ式
 */
#include <iostream>
using namespace std;
int const N=201411385%10000;//万の剰余を求め、3桁残す処理。マクロにしろよ
int *mFib= new int[N+1];

int Fib(int n){
  if(n<=0)return 0;//実行されないことを祈る
  if(n<=2)return 1;//Fib(1)=Fib(2)=0
  //どちらか片方が計算されていなければ、再帰して求める
  if(mFib[n-1]==0||mFib[n-2]==0)  mFib[n]=(Fib(n-1)%1000)+(Fib(n-2)%1000);
  //そうでなければメモから計算
  else mFib[n]=(mFib[n-1]%1000)+(mFib[n-2]%1000);
  return mFib[n]%1000;
}
int main(){
  //0で初期化
  for(int i=1;i<=N;i++){
    mFib[i]=0;
  }
  mFib[1]=1;//Fib(1)=Fib(2)=1
  mFib[2]=1;
  cout << "学籍番号の下４桁は" << N << endl;
  cout << "Fib("<< N << ")の下３桁は" << Fib(N) << endl;
  return 0;
}
