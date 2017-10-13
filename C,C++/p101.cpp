#include<iostream>
#include<string.h>
#include<vector>
using namespace std;
vector<unsigned int> block[25];
int Index[25];

void print(int N){
	for(int i=0;i<N;i++){
		cout<<i<<":"; 
		for(int j=0;j<block[i].size();j++)
			cout <<" "<< block[i][j];
		cout<<endl; 
	}
		
}

void Clear(int p){
	int F=0;
	int end=block[Index[p]].size()-1;

	for(int i=0;i<block[Index[p]].size();i++){
		if(block[Index[p]][i]==p)
			F=i;
	}
	for(int i=end;i>F;i--){
		Index[block[Index[p]][i]]=block[Index[p]][i];
		block[block[Index[p]][i]].push_back(block[Index[p]][i]);
		block[Index[p]].pop_back();
	}
}
 
void Move(int a,int b){
	vector<unsigned int> temp;
	int F=0;
	int end=block[Index[a]].size()-1;
	for(int i=0;i<block[Index[a]].size();i++){
		if(block[Index[a]][i]==a)
			F=i;
	}
	for(int i=end;i>=F;i--){
		temp.push_back(block[Index[a]][i]);
		block[Index[a]].pop_back();
	}
	end=temp.size()-1;
	for(int i=end;i>=0;i--){
		Index[temp[i]]=Index[b];
		block[Index[b]].push_back(temp[i]);
		temp.pop_back();
	}
} 
//move onto 
void move_onto(int a,int b){
	Clear(a);
	Clear(b);
	block[Index[a]].pop_back();     //move a 
	block[Index[b]].push_back(a);
	Index[a]=Index[b];	 
}
//move over 
void move_over(int a,int b){
	Clear(a);
	block[Index[a]].pop_back();     //move a 
	block[Index[b]].push_back(a);
	Index[a]=Index[b];	 
}
int main(){
	int N,a,b;
	string I1,I2;
	cin >> N;
		for(int i=0;i<N;i++){
			block[i].push_back(i);
			Index[i]=i;
		}
		while(cin>>I1){
			if(strcmp(I1.c_str(),"quit")==0)
				break;
			else{
				cin>>a>>I2>>b;
				if(a==b||Index[a]==Index[b]&&a<N&&b<N){
				}
				else{
					 
					if(strcmp(I1.c_str(),"move")==0&&strcmp(I2.c_str(),"onto")==0) 
						move_onto(a,b);
					else if(strcmp(I1.c_str(),"move")==0&&strcmp(I2.c_str(),"over")==0)
						move_over(a,b);
					else if(strcmp(I1.c_str(),"pile")==0&&strcmp(I2.c_str(),"onto")==0){
						Clear(b);
						Move(a,b);
					}
					else if(strcmp(I1.c_str(),"pile")==0&&strcmp(I2.c_str(),"over")==0)
						Move(a,b);	
					
				}
			}
			//print(N);
			//cout<<endl;
		}
		print(N);
		//clear vector
		for(int i=0;i<N;i++)
			block[i].clear();
	
	return 0;
} 
