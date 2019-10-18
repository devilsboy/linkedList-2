

import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
//import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class lab4 {
    Node head;
    static Scanner sc = new Scanner(System.in);

//    static LinkedList<String> l_list1 = new LinkedList<String>();
//    static LinkedList<String> l_list2 = new LinkedList<String>();
   static lab4 l_list1 = new lab4();
   static lab4 l_list2 = new lab4();
    static class Node {

        String data;
        Node next;
        Node(String d)
        {
            data = d;
            next = null;
        }
    }


    static void bookingFlight() {
        System.out.println("Enter the flight number you want to book: ");
        String q = sc.next();
        if (q.equals("A1")||q.equals("a1")) {
            System.out.println("Enter the number of passengers you want to book for flight A1");
            int w = sc.nextInt();
            for (int i = 0; i < w; i++) {
                System.out.println("Enter the first name of passenger: " + (i + 1));
//                l_list1.add(sc.next());
                String n = sc.next();
                Node new_node = new Node(n);
                new_node.next = null;
                // If the Linked List is empty,
                // then make the new node as head
                if (l_list1.head == null) {
                    l_list1.head = new_node;
                }
                else {
                    // Else traverse till the last node
                    // and insert the new_node there
                    Node last = l_list1.head;
                    while (last.next != null) {
                        last = last.next;
                    }

                    // Insert the new_node at last node
                    last.next = new_node;
                }
            }
        }
        else if (q.equals("A2")||q.equals("a2")) {
            System.out.println("Enter the number of passengers you want to book for flight A2");
            int w = sc.nextInt();
            for (int i = 0; i < w; i++) {
                System.out.println("Enter the first name of passenger: " + (i + 1));
//                l_list2.add(sc.next());
                String m = sc.next();
                Node new_node = new Node(m);
                new_node.next = null;
                // If the Linked List is empty,
                // then make the new node as head
                if (l_list2.head == null) {
                    l_list2.head = new_node;
                }
                else {
                    // Else traverse till the last node
                    // and insert the new_node there
                    Node last = l_list2.head;
                    while (last.next != null) {
                        last = last.next;
                    }

                    // Insert the new_node at last node
                    last.next = new_node;
                }
            }
        }
        else{
            System.out.println("The entered flight number is not available");
        }

    }


    static void printNames(){
        System.out.println("Enter the flight number for which you want to print the Passenger list: ");
        String e = sc.next();
        if (e.equals("A1") || e.equals("a1")){
            Node currNode = l_list1.head;
            if (l_list1.head == null){
                System.out.println("No Passengers");
            }
            else {
                System.out.print("Names of Passengers in A1: ");

                // Traverse through the LinkedList
                while (currNode != null) {
                    // Print the data at current node
                    System.out.print(currNode.data + " ");

                    // Go to next node
                    currNode = currNode.next;
                }
            }

//            if (l_list1.size() == 0){
//                System.out.println("No Passenger");
//            }
//            else{
//                System.out.println(Arrays.toString(l_list1.toArray()));
//            }
        }
        else if (e.equals("A2")||e.equals("a2")){
            Node currNode = l_list2.head;
            if (l_list2.head == null){
                System.out.println("No Passengers");
            }
            else {
                System.out.print("Names of passengers in A2: ");

                // Traverse through the LinkedList
                while (currNode != null) {
                    // Print the data at current node
                    System.out.print(currNode.data + " ");

                    // Go to next node
                    currNode = currNode.next;
                }
            }
//            if (l_list2.size()==0){
//                System.out.println("No Passenger");
//            }
//            else {
//                System.out.println(Arrays.toString(l_list2.toArray()));
//            }
        }
        else{
            System.out.println("The entered flight number is not available");
        }
    }
    static void printSize(){
        System.out.println("Enter the flight number for which you want to print the number of passengers: ");
        String e = sc.next();
        if (e.equals("A1")||e.equals("a1")){
            Node currNode = l_list1.head;
            if (l_list1.head == null){
                System.out.println("0");
            }
            else {
                int count = 0;

                // Traverse through the LinkedList
                while (currNode != null) {
                    count++;


                    // Go to next node
                    currNode = currNode.next;
                }
                System.out.println("Number of passengers: "+count);
            }
//            if (l_list1.size() == 0){
//                System.out.println("0");
//            }
//            else{
//                System.out.println(l_list1.size());
//            }
        }
        else if (e.equals("A2")||e.equals("a2")) {
            Node currNode = l_list2.head;
            if (l_list2.head == null) {
                System.out.println("0");
            } else {
                int count = 0;

                // Traverse through the LinkedList
                while (currNode != null) {
                    count++;


                    // Go to next node
                    currNode = currNode.next;
                }
                System.out.println("Number of passengers: " + count);
            }
        }
//            if (l_list2.size()==0){
//                System.out.println("0");
//            }
//            else {
//                System.out.println(l_list2.size());
//            }
//
        else{
            System.out.println("The entered flight number is not available");
        }
    }
        public static void main (String[]args){
        while (true) {
            System.out.println("1. Book a reservation");
            System.out.println("2. List of passengers");
            System.out.println("3. Number of passengers");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int u = sc.nextInt();
            if (u == 1){
                bookingFlight();
            }
            else if (u==2){
                printNames();
            }
            else if (u==3){
                printSize();
            }
            else if (u==4){
                System.out.println("Terminated");
                break;
            }
            else {
                System.out.println("Wrong Input");
            }
            System.out.println();
            System.out.println("Enter 1 to continue, anything else to break");
            int i = sc.nextInt();
            if (i != 1){
                System.out.println("Terminated");
                break;
            }
        }
        }
}

