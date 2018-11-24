package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.DynamicArray;


public class DataStructuresAndAlgorithms {

    public static void main(String[] args) {
        
        DynamicArray<Integer> da = new DynamicArray<>();
        //1 = 1
        da.add(4);
        System.out.println("Size: " + da.getSize());
        //1*2=2
        da.add(8);
        System.out.println("Size: " + da.getSize());
        //2*2=4
        da.add(12);
        System.out.println("Size: " + da.getSize());
        //4*1=4
        da.add(14);
        System.out.println("Size: " + da.getSize());
        //4*2= 8 
        da.add(22);
        System.out.println("Size: " + da.getSize());
    }
    
}
