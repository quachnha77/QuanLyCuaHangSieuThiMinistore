-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 14, 2023 lúc 03:00 PM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ministore`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `role` varchar(50) NOT NULL,
  `status` int(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`fullname`, `username`, `password`, `role`, `status`, `email`) VALUES
('Quách Thanh Nhã', 'admin', '$2a$12$axfLMGImUzoN17K97LS59es9sVzQEzBGHyrdz2UL46a8IG/mBJs/6', 'Admin', 1, 'quachnha77@gmail.com'),
('Hồ Sĩ Tịnh', 'admin1', '$2a$12$gqUT1H5YKw54LhtFRHUc.uPuTZ2TGa123gUtLL6CNG6kFM7ArzHzm', 'Admin', 1, 'hosytinh04@gmail.com'),
('12', '332', '$2a$12$2BrH5fU5W4qWz3aXPaqIk.2uCaWZUn9vmcM1O/Da4qldEjV..eK/W', 'Admin', 1, 'hosytinh04@gmail.com');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `mahd` int(50) NOT NULL,
  `makh` varchar(50) NOT NULL,
  `ngaytao` date NOT NULL,
  `nguoitao` varchar(50) NOT NULL,
  `tongtien` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`mahd`, `makh`, `ngaytao`, `nguoitao`, `tongtien`) VALUES
(9, 'null', '2023-05-07', 'Quách Thanh Nhã', 30408400),
(21, 'null', '2023-05-07', 'Quách Thanh Nhã', 30408400),
(22, '001', '2023-05-07', 'Quách Thanh Nhã', 30408400),
(24, 'null', '2023-05-07', 'Quách Thanh Nhã', 23000),
(25, '001', '2023-05-07', 'Quách Thanh Nhã', 161000),
(26, '001', '2023-05-08', 'Quách Thanh Nhã', 23000),
(27, '022', '2023-05-10', 'Hồ Sĩ Tịnh', 10000),
(28, 'null', '2023-05-12', 'Hồ Sĩ Tịnh', 21010),
(29, 'null', '2023-05-13', 'Hồ Sĩ Tịnh', 56000),
(30, '001', '2023-05-13', 'Hồ Sĩ Tịnh', 56000),
(31, '', '2023-05-13', 'Hồ Sĩ Tịnh', 33000),
(32, '001', '2023-05-13', 'Hồ Sĩ Tịnh', 33000),
(33, '', '2023-05-13', 'Hồ Sĩ Tịnh', 110000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `masp` varchar(50) NOT NULL,
  `tensp` varchar(50) NOT NULL,
  `soluong` int(11) NOT NULL,
  `dongia` int(50) NOT NULL,
  `thanhtien` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `detailbill`
--

CREATE TABLE `detailbill` (
  `mahd` int(50) NOT NULL,
  `masp` varchar(50) NOT NULL,
  `soluong` int(50) NOT NULL,
  `dongia` int(50) NOT NULL,
  `thanhtien` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `detailbill`
--

INSERT INTO `detailbill` (`mahd`, `masp`, `soluong`, `dongia`, `thanhtien`) VALUES
(16, 'N2', 2, 23000, 46000),
(16, 'K23', 6, 5060400, 30362400),
(17, 'N2', 2, 23000, 46000),
(17, 'K23', 6, 5060400, 30362400),
(18, 'N2', 2, 23000, 46000),
(18, 'K23', 6, 5060400, 30362400),
(19, 'N2', 2, 23000, 46000),
(19, 'K23', 6, 5060400, 30362400),
(20, 'N2', 2, 23000, 46000),
(20, 'K23', 6, 5060400, 30362400),
(21, 'N2', 2, 23000, 46000),
(21, 'K23', 6, 5060400, 30362400),
(22, 'N2', 2, 23000, 46000),
(22, 'K23', 6, 5060400, 30362400),
(23, 'N2', 2, 23000, 46000),
(23, 'K23', 6, 5060400, 30362400),
(24, 'N2', 1, 23000, 23000),
(25, 'N2', 7, 23000, 161000),
(26, 'N2', 1, 23000, 23000),
(27, 'J2', 1, 10000, 10000),
(28, 'SP002', 2, 7000, 14000),
(28, 'SP001', 1, 10, 10),
(28, 'SP003', 1, 7000, 7000),
(29, 'N2', 2, 23000, 46000),
(29, 'L1', 1, 10000, 10000),
(31, 'N2', 1, 23000, 23000),
(31, 'L1', 1, 10000, 10000),
(33, 'N2', 1, 23000, 23000),
(33, 'L1', 1, 10000, 10000),
(33, 'Pa1', 1, 1000, 1000),
(33, 'DFS', 2, 32000, 64000),
(33, 'POIU', 1, 12000, 12000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `detailreceipt`
--

CREATE TABLE `detailreceipt` (
  `mapn` varchar(50) NOT NULL,
  `mancc` varchar(50) NOT NULL,
  `masp` varchar(50) NOT NULL,
  `tensp` varchar(50) NOT NULL,
  `loaisp` varchar(50) NOT NULL,
  `dongia` int(50) NOT NULL,
  `soluong` int(50) NOT NULL,
  `donvi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `detailreceipt`
--

INSERT INTO `detailreceipt` (`mapn`, `mancc`, `masp`, `tensp`, `loaisp`, `dongia`, `soluong`, `donvi`) VALUES
('002', '151', 'arw', 'Đồ dùng', 'Đồ dùng', 50000, 20, 'cái'),
('001', 'Lsdd', '232', 'Dầu gội ', 'Dầu gội ', 3000, 50000, 'thùng'),
('001', '3231', 'MSS', 'Thực phẩm', 'Thực phẩm', 25000, 5, 'cái'),
('006', '012', '0012', '', '', 10000, 2, 'cái'),
('PN001', 'NCCT1', 'cola1', 'Nước Ngọt', 'Nước Ngọt', 15000, 50, 'lon'),
('PN001', 'NCC001', 'SP001', 'Dụng cụ học tập', 'Dụng cụ học tập', 10, 5000, '100'),
('PN001', 'NCC001', 'SP002', 'Dụng cụ học tập', 'Dụng cụ học tập', 7000, 50, 'cái'),
('PN004', 'NCC004', 'SP003', 'Dụng cụ học tập', 'Dụng cụ học tập', 7000, 50, 'quyển'),
('PN005', 'NCC004', 'SP004', 'Dụng Cụ học Tập', 'Dụng Cụ học Tập', 9000, 50, 'Quyển'),
('PN006', 'NCC004', 'SP005', 'Dụng Cụ Học tập', 'Dụng Cụ Học tập', 10000, 50, 'Quyển'),
('PN002', 'NCC004', 'SP006', 'Dụng cụ học tập', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('PN003', 'NCC004', 'SP007', 'Dụng cụ học tập', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('PN003', 'NCC004', 'SP008', 'Dụng cụ học tập', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('PN003', 'NCC004', 'SP009', 'Dụng cụ học tập', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('PN003', 'NCC004', 'SP010', 'Dụng cụ học tập', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('PN003', 'NCC004', 'SP011', 'Dụng cụ học tập', 'Dụng cụ học tập', 15000, 50, 'Quyển'),
('PN007', 'NCC004', 'SP012', 'Anh Văn 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('PN007', 'NCC004', 'SP013', 'Anh Văn 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('PN007', 'NCC004', 'SP014', 'Anh Văn 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('PN007', 'NCC004', 'SP015', 'Anh Văn 4', 'Dụng cụ học tập', 11000, 50, 'Quyển'),
('SP007', 'NCC004', 'SP016', 'Anh Văn 5', 'Dụng cụ học tập', 13000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP001', 'Toán 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP002', 'Toán 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP003', 'Toán 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP004', 'Toán 4', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP005', 'Toán 5', 'Dụng cụ học tập', 15000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP006', 'Ngữ Văn 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP007', 'Ngữ Văn 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP008', 'Ngữ Văn 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP009', 'Ngữ Văn 4', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('PN012', 'NCC004', 'SP010', 'Ngữ Văn 5', 'Dụng cụ học tập', 15000, 50, 'Quyển');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` varchar(64) NOT NULL,
  `hokh` varchar(64) NOT NULL,
  `tenkh` varchar(64) NOT NULL,
  `sdt` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`makh`, `hokh`, `tenkh`, `sdt`) VALUES
('001', 'Quách Thanh', 'Nhã', '09999999'),
('002', 'Lê Chánh', 'Huy', '0987654321'),
('003', 'Đặng Ngọc', 'Tính', '03456789'),
('004', 'Hồ Sĩ ', 'Tịnh', '0986821057'),
('005', 'Lê Tuấn', 'Anh', '03112348132'),
('006', 'Đặng Ngọc', 'Tính', '03456789'),
('007', 'Nguyễn Ngô Thế', 'Anh', '031212341245'),
('008', 'Võ Công ', 'Anh', '0923141551'),
('009', 'Nguyễn Hữu Quốc', 'Bảo', '07328946435'),
('010', 'Trần Đức', 'Chánh', '0986674345'),
('011', 'Huỳnh Lâm Khánh', 'Duy', '0365921745'),
('012', 'Huỳnh Nhựt', 'Dương', '05728354245'),
('013', 'Phung Văn', 'Hà', '0988656323'),
('014', 'Lê Văn', 'Hùng', '0987535785'),
('015', 'Lê Chánh', 'Huy', '091274894');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `ID` varchar(50) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `DiaChi` varchar(50) NOT NULL,
  `SDT` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`ID`, `Ten`, `DiaChi`, `SDT`) VALUES
('NCC001', 'winfat', 'Bình Tân', '038988989'),
('NCC003', 'Vinasat', 'Bình Tân', '09489895652'),
('NCC002', 'HuyChanh', 'Quan8', '0984654232'),
('NCC004', 'SyTin', 'Quận 5', '0984653492'),
('NCC005', 'Đại Học Sài Gòn', '273 An Dương Vương', '099981234'),
('NCC006', 'Kim Đồng', '272 An Dương Vương', '0293248545'),
('NCC007', 'Bộ Giáo Dục', '270 An Dương Vương', '0293248545'),
('NCC008', 'Đại học Sư Phạm', '274 An Dương Vương', '0293243234'),
('NCC009', 'Đại Học Khoa Học Tự Nhiên', 'Quận 5', '0978997568'),
('NCC012', 'Nhà Sách Nguyễn Văn Cừ', 'Quận 10', '0978994345'),
('NCC010', 'Nhà Sách 526', 'Quận 10', '0978426342');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(50) NOT NULL,
  `Ho` varchar(50) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `GioiTinh` varchar(50) NOT NULL,
  `SDT` varchar(50) NOT NULL,
  `DiaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `GioiTinh`, `SDT`, `DiaChi`) VALUES
('003', 'Nguyễn', 'Huy', 'Nữ', '0946544626', 'Bình Chánh'),
('002', 'Trần', 'Tín', 'Nam', '0956564656', 'Đồng Nai'),
('001', 'Hồ Sĩ', 'Tịnh', 'Nam', '0986821057', '273 An Dương Vương'),
('004', 'Quách Thanh', 'Nhã', 'Nam', '098988997', '273 An Dương Vương'),
('005', 'Lê Chánh', 'Huy', 'Nam', '098877823', '273 An Dương Vương'),
('006', 'Đặng Ngọc ', 'Tính', 'Nam', '0988742343', '273 An Dương Vương'),
('007', 'Trần Văn', 'An', 'Nam', '0924532533', 'Quận 3'),
('008', 'Tôn Linh', 'Phong', 'Nam', '0986822257', '233 An DƯơng Vương'),
('009', 'Nguyễn Thu', 'Thảo', 'Nữ', '0982312452', 'Quận 3'),
('010', 'Trần Bảo ', 'My', 'Nữ', '0989743421', 'Quận 5'),
('011', 'Nguyễn Thị Mỹ', 'Duyên', 'Nữ', '097424524', 'Quận 5');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `masp` varchar(50) NOT NULL,
  `tensp` varchar(50) NOT NULL,
  `loaisp` varchar(50) NOT NULL,
  `dongia` int(100) NOT NULL,
  `soluong` int(100) NOT NULL,
  `donvi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`masp`, `tensp`, `loaisp`, `dongia`, `soluong`, `donvi`) VALUES
('L1', 'Ban chai', 'Do VSCN', 10000, 29997, 'cai'),
('PL32', 'Banh ngot', 'Thuc pham', 1000, 3198, 'thung'),
('J2', 'Pessi', 'Nuoc ngot', 10000, 18, 'lon'),
('La2', 'CoCa', 'Nuoc not', 10000, 22, 'lon'),
('P32', 'Mi tom', 'Thuc pham', 12000, 100, 'thung'),
('HJS', 'Nuoc loc LAVIE', 'Nuoc uong', 15000, 20, 'chai'),
('POIU', 'Mi ly Hao Hao', 'Thuc pham', 12000, 999, 'cai'),
('LJH1', 'Keo vuot toc', 'My pham', 120000, 100, 'cai'),
('Pa1', 'Banh ngot', 'Thuc pham', 1000, 19, 'thung'),
('DGH', 'Bia SAIGON', 'Bia', 15000, 24, 'lon'),
('DFS', 'Bia Tiger', 'Bia', 32000, 97, 'lon'),
('DAA', 'Thuoc la', 'Thuoc la', 20000, 1000, 'hop'),
('301', 'Loa Mini', 'Đồ điện tử', 123000, 999, 'cái'),
('311', 'Đèn bàn', 'Đồ dùng', 50000, 20, 'cái'),
('arw', 'Loa', 'Đồ dùng', 50000, 20, 'cái'),
('232', 'Clear', 'Dầu gội ', 3000, 50000, 'thùng'),
('MSS', 'Lương khô', 'Thực phẩm', 25000, 5, 'cái'),
('cola1', 'Cocacola', 'Nước Ngọt', 15000, 50, 'lon'),
('SP012', 'Anh Văn 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('SP013', 'Anh Văn 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('SP014', 'Anh Văn 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('SP015', 'Anh Văn 4', 'Dụng cụ học tập', 11000, 50, 'Quyển'),
('SP001', 'Toán 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('SP002', 'Toán 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('SP003', 'Toán 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('SP004', 'Toán 4', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('SP005', 'Toán 5', 'Dụng cụ học tập', 15000, 50, 'Quyển'),
('SP006', 'Ngữ Văn 1', 'Dụng cụ học tập', 5000, 50, 'Quyển'),
('SP007', 'Ngữ Văn 2', 'Dụng cụ học tập', 7000, 50, 'Quyển'),
('SP008', 'Ngữ Văn 3', 'Dụng cụ học tập', 9000, 50, 'Quyển'),
('SP009', 'Ngữ Văn 4', 'Dụng cụ học tập', 12000, 50, 'Quyển'),
('SP010', 'Ngữ Văn 5', 'Dụng cụ học tập', 15000, 50, 'Quyển');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `promotion`
--

CREATE TABLE `promotion` (
  `makm` varchar(50) NOT NULL,
  `chuongtrinh` varchar(50) NOT NULL,
  `dieukien` varchar(50) NOT NULL,
  `phantram` int(50) NOT NULL,
  `ngaybd` date NOT NULL,
  `ngaykt` date NOT NULL,
  `tinhtrang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `promotion`
--

INSERT INTO `promotion` (`makm`, `chuongtrinh`, `dieukien`, `phantram`, `ngaybd`, `ngaykt`, `tinhtrang`) VALUES
('K307', 'Lễ 30-4', 'mua trên 1 triệu', 30, '2023-04-26', '2023-04-30', 'end'),
('KM012', 'Chấm điểm đồ án', 'cô cho 10đ', 100, '2023-05-16', '2023-05-17', 'enable'),
('KM142', 'Quốc tế thiếu nhi', 'có trẻ em dưới 10 tuổi theo cùng', 25, '2023-05-31', '2023-06-01', 'unenable');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `receipt`
--

CREATE TABLE `receipt` (
  `mapn` varchar(50) NOT NULL,
  `ngaytao` date NOT NULL,
  `nguoitao` varchar(50) NOT NULL,
  `mancc` varchar(50) NOT NULL,
  `tongtien` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `receipt`
--

INSERT INTO `receipt` (`mapn`, `ngaytao`, `nguoitao`, `mancc`, `tongtien`) VALUES
('002', '2023-01-23', 'Nguyen Van A', '032', 23000),
('003', '2023-05-03', 'Loading', 'N03', 123000000),
('005', '2023-05-04', 'Loading', 'BínhA', 1000000),
('002', '2023-05-04', 'Loading', '151', 1000000),
('001', '2023-05-04', 'Loading', 'Lsdd', 150000000),
('001', '2023-05-04', 'Loading', '3231', 125000),
('006', '2023-05-10', 'Hồ Sĩ Tịnh', '012', 20000),
('PN001', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCCT1', 750000),
('PN001', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCC001', 50000),
('PN001', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCC001', 350000),
('PN004', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCC004', 350000),
('PN005', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCC004', 450000),
('PN006', '2023-05-12', 'Hồ Sĩ Tịnh', 'NCC004', 500000),
('PN002', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 600000),
('PN003', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 250000),
('PN003', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 350000),
('PN003', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 450000),
('PN003', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 600000),
('PN003', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 750000),
('PN007', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 250000),
('PN007', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 350000),
('PN007', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 450000),
('PN007', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 550000),
('SP007', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 650000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 250000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 350000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 450000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 600000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 750000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 250000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 350000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 450000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 600000),
('PN012', '2023-05-14', 'Hồ Sĩ Tịnh', 'NCC004', 750000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `warehouse`
--

CREATE TABLE `warehouse` (
  `masp` varchar(50) NOT NULL,
  `tensp` varchar(50) NOT NULL,
  `loai` varchar(50) NOT NULL,
  `dongia` int(50) NOT NULL,
  `soluong` int(50) NOT NULL,
  `donvi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `warehouse`
--

INSERT INTO `warehouse` (`masp`, `tensp`, `loai`, `dongia`, `soluong`, `donvi`) VALUES
('003', 'Kinh', 'Trang Suc', 30200, 2300, 'Cai');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`mahd`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bill`
--
ALTER TABLE `bill`
  MODIFY `mahd` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
