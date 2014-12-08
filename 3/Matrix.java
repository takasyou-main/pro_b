import java.io.*;

public class Matrix
{
     public static void main(String[] args)
    {
	double[][] tens1 ={ {1.0 , 2.0} ,
			    {3.0 , 4.0} };
	double[][] tens2 ={ {1.5 , 0.0} ,
			    {0.0 , 1.5} };
	double[][] result= new double[2][2];
	for (int i=0;i<tens1.length; i++){
	    for(int k=0;k<tens1[i].length;k++){
		double sum=0;
		for(int j=0;j<tens1[i].length;j++){
		    sum+=tens1[i][j]*tens2[j][k];
		}
		result[i][k]=sum;
	    }
	}
	for(int i=0;i<result.length;i++){
	    for(int j=0;j<result[i].length;j++){
		System.out.print(result[i][j]+" ");
	    }
	    System.out.println("");
	}                    
    }                                                                                                
}   
