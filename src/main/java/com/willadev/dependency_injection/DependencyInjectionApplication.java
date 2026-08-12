package com.willadev.dependency_injection;


import com.willadev.dependency_injection.entities.Order;
import com.willadev.dependency_injection.services.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class DependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	static void main(String[] args) {

		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Código: ");
		int code = sc.nextInt();
		sc.nextLine();

		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		sc.nextLine();

		System.out.print("Desconto: ");
		double discount = sc.nextDouble();
		sc.nextLine();

		Order order = new Order(code, basic, discount);

		log.info("Pedido código {}", order.getCode());
		log.info("Valor total: {}", String.format("R$ %.2f", orderService.total(order)));

		sc.close();
	}
}
