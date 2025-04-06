-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-04-2025 a las 05:50:38
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacen_la_colmena`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresar_producto` (IN `p_nombre` VARCHAR(100), IN `p_precio` DECIMAL(10,2), IN `p_stock` INT, IN `p_lote` VARCHAR(50), IN `p_fecha_ingreso` DATE)   BEGIN
    -- VERIFICAR QUE EL STOCK Y EL PRECIO SEAN VÁLIDOS
    IF p_stock >= 0 AND p_precio > 0 THEN
        -- INSERTAR EL NUEVO PRODUCTO EN LA TABLA
        INSERT INTO productos (nombre, precio, stock, lote, fecha_ingreso) 
        VALUES (p_nombre, p_precio, p_stock, p_lote, p_fecha_ingreso);
    ELSE
        -- GENERAR ERROR SI LOS DATOS SON INVÁLIDOS
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El precio debe ser mayor a 0 y el stock no puede ser negativo';
    END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresar_stock` (IN `p_id_producto` INT, IN `p_cantidad` INT)   BEGIN
    -- VERIFICAR QUE LA CANTIDAD SEA POSITIVA
    IF p_cantidad > 0 THEN
        -- ACTUALIZAR EL STOCK DEL PRODUCTO
        UPDATE productos 
        SET stock = stock + p_cantidad
        WHERE id_producto = p_id_producto;
    ELSE
        -- GENERAR ERROR SI LA CANTIDAD NO ES VÁLIDA
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'La cantidad a ingresar debe ser mayor a 0';
    END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_venta` (IN `p_nombre_cliente` VARCHAR(100), IN `p_id_producto` INT, IN `p_cantidad` INT, IN `p_precio_total` DECIMAL(10,2))   BEGIN
    DECLARE v_stock INT;

    -- OBTENER STOCK DISPONIBLE
    SELECT stock INTO v_stock FROM productos WHERE id_producto = p_id_producto;

    IF v_stock >= p_cantidad THEN
        -- INICIAR TRANSACCIÓN
        START TRANSACTION;
        
        -- REGISTRAR LA VENTA
        INSERT INTO ventas (nombre_cliente, id_producto, cantidad, precio_total, fecha_salida)
        VALUES (p_nombre_cliente, p_id_producto, p_cantidad, p_precio_total, CURDATE());
        
        -- ACTUALIZAR STOCK
        UPDATE productos 
        SET stock = stock - p_cantidad 
        WHERE id_producto = p_id_producto;
        
        -- CONFIRMAR CAMBIOS
        COMMIT;
    ELSE
        -- SI NO HAY STOCK SUFICIENTE, CANCELAR LA OPERACIÓN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Stock insuficiente para la venta';
    END IF;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `lote` varchar(50) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `fecha_ingreso` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre`, `precio`, `stock`, `lote`, `usuario`, `fecha_ingreso`) VALUES
(1, 'Aceite 1 Litro', 12.50, 30, '122025', 'AlbertoRo123', '18 de Febrero del 2025'),
(2, 'Inka Kola 3 Litros', 9.80, 50, '142025', 'CamiloTo200', '14 de Marzo del 2024'),
(3, 'Detergente Patito 1 Kilo', 7.20, 40, '222025', 'JuanPe2024', '22 de abril del 2024'),
(4, 'Arroz Superior 5 Kg', 25.00, 20, '142025', 'HernCo223', '30 de Diciembre del 2024');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `password`) VALUES
('AlbertoRo123', 'sise2025'),
('Camilo2025', 'sise2025'),
('CamiloTo200', 'sise2025'),
('HernCo223', 'sise2025'),
('Jose2025', 'sise2025'),
('JuanPe2024', 'sise2025'),
('Marcelo2025', 'sise2025');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `fk_usuario` (`usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`usuario`) REFERENCES `usuarios` (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
