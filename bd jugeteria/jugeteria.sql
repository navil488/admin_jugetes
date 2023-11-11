-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         11.1.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para bd_jugeteria
CREATE DATABASE IF NOT EXISTS `bd_jugeteria` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `bd_jugeteria`;

-- Volcando estructura para tabla bd_jugeteria.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `ID_Cliente` int(11) DEFAULT NULL,
  `Nombre_Cliente` varchar(50) DEFAULT NULL,
  `Numero_telefono` int(11) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.cliente: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_jugeteria.detallepedido
CREATE TABLE IF NOT EXISTS `detallepedido` (
  `ID_Detalle` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Pedido` int(11) DEFAULT NULL,
  `ID_Silla` int(11) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `PRECIO_TOTAL` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID_Detalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.detallepedido: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_jugeteria.detalle_ventas
CREATE TABLE IF NOT EXISTS `detalle_ventas` (
  `ID_Detalle_Ventas` int(11) DEFAULT NULL,
  `ID_ventas` int(11) DEFAULT NULL,
  `Producto_Vendido` int(11) DEFAULT NULL,
  `Cantidad_vendida` int(11) DEFAULT NULL,
  `Precio_unit` decimal(20,6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.detalle_ventas: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_jugeteria.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `ID_producto` int(11) NOT NULL,
  `Nombre_producto` varchar(50) DEFAULT NULL,
  `Descripcion_producto` varchar(50) DEFAULT NULL,
  `Categoria` varchar(50) DEFAULT NULL,
  `precio_unit` decimal(20,6) DEFAULT NULL,
  `Stock` int(11) DEFAULT NULL,
  `ID_provedor` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.producto: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_jugeteria.provedores
CREATE TABLE IF NOT EXISTS `provedores` (
  `ID_provedor` int(11) DEFAULT NULL,
  `Empresa` varchar(50) DEFAULT NULL COMMENT 'nombre de la empresa proveedora',
  `Numero_Telefono` int(11) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.provedores: ~0 rows (aproximadamente)

-- Volcando estructura para tabla bd_jugeteria.ventas
CREATE TABLE IF NOT EXISTS `ventas` (
  `ID_Ventas` int(11) DEFAULT NULL,
  `Fecha_ventas` date DEFAULT NULL,
  `ID_Cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla bd_jugeteria.ventas: ~0 rows (aproximadamente)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
