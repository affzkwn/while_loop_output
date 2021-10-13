package com.quiz.while_loop_output;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhileLoopOutputApplication {

	public static void main(String[] args) {
		int N = 1;
		while (N <= 32) {
			N = N * 2;
			System.out.println (N + " ");
		}

	}

}
