package com.koreait.first.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList {
	private int[] arr;
	
	public MyArrayList() {
		init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	public void add(int val) {
		int[] temp = new int[arr.length + 1];
		temp[arr.length] = val;
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public void add(int idx, int val) {
		int[] temp = new int[arr.length + 1];
		temp[idx] = val;
		for(int i=0; i<arr.length; i++) {			
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i+1] = arr[i];
			}
			//temp[i<idx ? i : i+1] = arr[i];
		}
		arr = temp;
	}
	
	public int remove(int idx) {
		int delVal = arr[idx];
		int[] temp = new int[arr.length - 1];
		
		for(int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
			// temp[i] = arr[i < idx ? i : i+1];
		}
		arr = temp;
		return delVal;
	}
	
	public int get(int idx) {
		return arr[idx];
	}
/*
	@Override
	public String toString() {
		String str = "[";		
		for(int i=0; i<arr.length; i++) {
			str += arr[i] + (i < arr.length-1 ? ", " : "");
		}		
		str += "]";
		return str;
	}
	*/
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder("[");
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			
			if(i<arr.length-1) {
				sb.append(", ");	
			}
		}	
		sb.append("]");
		return sb.toString();
	}
}







