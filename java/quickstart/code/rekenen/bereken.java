package com.capgemini.training;
public class bereken {
public static int optellen(String[] getallen) {
int sum = 0;
for (int i = 0; i < getallen.length; i++) { 
sum = sum + Integer.valueOf(getallen[i]); } 
return sum; }}
