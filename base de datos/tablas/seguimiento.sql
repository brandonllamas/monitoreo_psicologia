-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2018 a las 02:51:53
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `psicologia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguimiento`
--

CREATE TABLE `seguimiento` (
  `id` int(11) NOT NULL,
  `nombre_e` varchar(30) NOT NULL,
  `maetro_acomp_actual` varchar(30) NOT NULL,
  `maestro_acomp_anterior` varchar(30) NOT NULL,
  `fecha` varchar(43) NOT NULL,
  `grado` varchar(30) NOT NULL,
  `antiguedad_estudiante` int(30) NOT NULL,
  `motivo_rem` varchar(900) NOT NULL,
  `seguimiento_apoyo` varchar(900) NOT NULL,
  `observaciones_impor` varchar(900) NOT NULL,
  `TI` int(99) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `seguimiento`
--

INSERT INTO `seguimiento` (`id`, `nombre_e`, `maetro_acomp_actual`, `maestro_acomp_anterior`, `fecha`, `grado`, `antiguedad_estudiante`, `motivo_rem`, `seguimiento_apoyo`, `observaciones_impor`, `TI`) VALUES
(1, 'brandon llamas larios', 'jordi', 'jordi', '18-04-1018', '11', 100, 'dasdsad', 'dawdwafa', 'dsadsac', 1002092830),
(2, 'laura sesrrano ', 'jordi', 'jordi', '17-04-2018', '11', 13, 'loaoasndsabjdshadasb', 'bjasfasfhasf samnfdawdwafa', 'fnasdmbfafasdsadsac', 100),
(5, 'pff', 'laura', 'laura', '19-04-2018', '8', 3, 'fsafas', 'fsafsafsa', 'fasfasfas', 0),
(6, 'brandon llamas larios', 'jordi', 'jordi', '31-10-2018', '11', 100, 'lcuraaaaaaaaaaaaaaaaaaaa	', 'no le hicieron nada	', 'esta loco', 1002092830);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
