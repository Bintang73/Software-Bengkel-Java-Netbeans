-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2022 at 06:44 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bengkelbaru`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang_jasa`
--

CREATE TABLE `barang_jasa` (
  `kd_barang` int(10) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang_jasa`
--

INSERT INTO `barang_jasa` (`kd_barang`, `nama_barang`, `harga`, `stok`) VALUES
(3, 'oli', 12000, 12),
(4, 'motor', 120000, 16),
(7, 'mobil', 120000, 12),
(8, 'ban luar', 150000, 5),
(10, 'ban luar irc', 150000, 15),
(11, 'ban dalam federal', 45000, 20),
(12, 'oli yamalube sport', 55000, 10),
(13, 'oli federal matic', 48000, 20),
(14, 'busi denso', 58000, 20),
(15, 'busi ngk', 45000, 15);

-- --------------------------------------------------------

--
-- Table structure for table `montir`
--

CREATE TABLE `montir` (
  `kd_montir` int(10) NOT NULL,
  `nama_montir` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_telp` varchar(255) NOT NULL,
  `email` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `montir`
--

INSERT INTO `montir` (`kd_montir`, `nama_montir`, `alamat`, `no_telp`, `email`) VALUES
(115, 'Robit', 'Purbalingga', '085540523007', 'robit@gmail.com'),
(116, 'Bintang', 'Cilacap', '08564637637', 'bintang@gmail.com'),
(117, 'Nizar', 'Purwokerto', '089765432567', 'nizar@gmail.com'),
(118, 'Imun', 'Kebumen', '0867747747474', 'imun@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `nota`
--

CREATE TABLE `nota` (
  `kd_transaksi` int(10) NOT NULL,
  `nama_pembeli` varchar(255) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `uang_pembeli` int(10) NOT NULL,
  `kembalian` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_transaksi` int(10) NOT NULL,
  `id` int(25) NOT NULL,
  `kd_barang` int(11) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `nama_pembeli` varchar(255) NOT NULL,
  `harga` int(10) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `uang_pembeli` int(10) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `kembalian` int(10) NOT NULL,
  `tanggal` varchar(255) NOT NULL,
  `kd_montir` int(10) NOT NULL,
  `nama_montir` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kd_transaksi`, `id`, `kd_barang`, `nama_barang`, `nama_pembeli`, `harga`, `jumlah`, `uang_pembeli`, `total_bayar`, `kembalian`, `tanggal`, `kd_montir`, `nama_montir`) VALUES
(1, 1, 8, 'Ban', 'Robit', 15000, 1, 20000, 15000, 5000, '2022-12-12', 116, 'Bintang'),
(5, 1, 8, 'ban luar', 'Sikum', 150000, 2, 1400000, 300000, 1100000, '19/12/2022', 0, 'Imun');

-- --------------------------------------------------------

--
-- Table structure for table `userlogin`
--

CREATE TABLE `userlogin` (
  `id` int(25) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `no_telp` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `no_karyawan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userlogin`
--

INSERT INTO `userlogin` (`id`, `username`, `password`, `email`, `fullname`, `no_telp`, `address`, `no_karyawan`) VALUES
(1, 'robit', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 'robit123@gmail.com', 'Robit Khoerulloh Arrohman', '085432123145', 'Purwokerto', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang_jasa`
--
ALTER TABLE `barang_jasa`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indexes for table `montir`
--
ALTER TABLE `montir`
  ADD PRIMARY KEY (`kd_montir`);

--
-- Indexes for table `nota`
--
ALTER TABLE `nota`
  ADD UNIQUE KEY `kd_transaksi` (`kd_transaksi`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kd_transaksi`),
  ADD KEY `id` (`id`) USING BTREE,
  ADD KEY `kd_montir` (`kd_montir`) USING BTREE,
  ADD KEY `kd_barang` (`kd_barang`) USING BTREE;

--
-- Indexes for table `userlogin`
--
ALTER TABLE `userlogin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang_jasa`
--
ALTER TABLE `barang_jasa`
  MODIFY `kd_barang` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `montir`
--
ALTER TABLE `montir`
  MODIFY `kd_montir` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=119;

--
-- AUTO_INCREMENT for table `nota`
--
ALTER TABLE `nota`
  MODIFY `kd_transaksi` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `kd_transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `userlogin`
--
ALTER TABLE `userlogin`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `nota_ibfk_1` FOREIGN KEY (`kd_transaksi`) REFERENCES `transaksi` (`kd_transaksi`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id`) REFERENCES `userlogin` (`id`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`kd_montir`) REFERENCES `montir` (`kd_montir`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`kd_barang`) REFERENCES `barang_jasa` (`kd_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
