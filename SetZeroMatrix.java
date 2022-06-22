package com.DsaSheetChallenge;

import java.util.HashSet;
import java.util.Set;

//Problem 1
public class SetZeroMatrix {
	public static void setZeros(int matrix[][]) {
        // Write your code here..
        if(matrix==null || matrix[0].length<=1){
            return;
        }
        Set<Integer> zeroRows = new HashSet<Integer>();
        Set<Integer> zeroCols = new HashSet<Integer>();
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(matrix[row][col]==0){
                    zeroRows.add(row);
                    zeroCols.add(col);
                }
            }
        }
        for(int row:zeroRows){
            for(int col=0;col<matrix[row].length;col++){
                matrix[row][col]=0;
            }
        }
        for(int col:zeroCols){
            for(int row=0;row<matrix.length;row++){
                matrix[row][col]=0;
            }
        }
	}
}
