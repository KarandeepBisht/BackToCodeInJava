package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        int arr[] = {1, 2, 4, 8, 6};
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest + " " + largest);
	}

}
