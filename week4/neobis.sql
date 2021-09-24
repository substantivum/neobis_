CREATE TABLE `cake` (
  `id` int DEFAULT NULL,
  `flavour` varchar(45) DEFAULT NULL,
  `cream` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `layers` int DEFAULT NULL,
  `cost` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `donut` (
  `id` int NOT NULL,
  `flavour` varchar(45) NOT NULL,
  `glaze_type` varchar(45) DEFAULT NULL,
  `cost` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `pie` (
  `id` int DEFAULT NULL,
  `crust_type` varchar(45) DEFAULT NULL,
  `cost` int DEFAULT NULL,
  `inner_type` varchar(45) DEFAULT NULL,
  `flavour` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `uniquedonut` (
  `id` int DEFAULT NULL,
  `flavour` varchar(45) DEFAULT NULL,
  `glaze_type` varchar(45) DEFAULT NULL,
  `cost` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



