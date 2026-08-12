<div align='center' id='top'>

# Dependency Injection - Order Total Calculator

  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  ![Maven](https://img.shields.io/badge/maven-%23C71A36.svg?style=for-the-badge&logo=apachemaven&logoColor=white)
</div>

A Spring Boot console application that calculates the total value of an order based on its basic value, discount, and shipping cost. This project demonstrates dependency injection concepts using Spring's `@Service` components, constructor injection, and `CommandLineRunner`.

---

## Table of Contents
- [Technologies](#technologies)
- [Architecture](#architecture)
- [How It Works](#howItWorks)
- [Domain Model](#domainModel)
- [Running Locally](#runningLocally)
- [License](#license)

---

<div id='technologies'/>

## Technologies

| Badge | Technology | Purpose |
|---|---|---|
| ![Java](https://img.shields.io/badge/Java_25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) | Java 25 | Programming language |
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) | Spring Boot | Application framework and dependency injection |
| ![Lombok](https://img.shields.io/badge/Lombok-CC0000?style=for-the-badge&logo=java&logoColor=white) | Lombok | Boilerplate reduction (logging via `@Slf4j`) |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) | Maven | Build and dependency management |

---

<div id='architecture'/>

## Architecture

This project follows a simple **service-oriented** structure, where the calculation logic is split into components with a single responsibility, decoupled from the application's entry point through constructor-based dependency injection.

```
CommandLineRunner → OrderService → ShippingService
```

- **OrderService**: responsible for order-related operations.
- **ShippingService**: responsible for shipping-related operations.

---

<div id='howItWorks'/>

## How It Works

1. On startup, the application prompts the user for the order's code, basic value, and discount via the terminal
2. An `Order` object is built from the provided input
3. `OrderService` calculates the order's total value, delegating the shipping cost calculation to `ShippingService`
4. The order code and the final total are printed to the application log

---

<div id='domainModel'/>

## Domain Model

**Order**

| Field | Type |
|---|---|
| code | Integer |
| basic | Double |
| discount | Double |

**Services**

| Service | Method | Description |
|---|---|---|
| `OrderService` | `total(order: Order): double` | Calculates the order's total value, applying the discount and adding the shipping cost |
| `ShippingService` | `shipment(order: Order): double` | Calculates the shipping cost based on the order's basic value |

---

<div id='runningLocally'/>

## Running Locally

```bash
./mvnw spring-boot:run
```

Once the application starts, follow the terminal prompts to enter the order's code, basic value, and discount. The order code and total value will be printed in the application log.

---

<div id='license'/>

## License
This project is licensed under the MIT License - see the `LICENSE` file for details.

<div align='right'>

  [Back to top of page ⬆️](#top)

</div>
