USE [master]
GO
/****** Object:  Database [Tocotoco]    Script Date: 11/13/2018 10:48:38 PM ******/
CREATE DATABASE [Tocotoco]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Tocotoco', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\Tocotoco.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Tocotoco_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\Tocotoco_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [Tocotoco] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Tocotoco].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Tocotoco] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Tocotoco] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Tocotoco] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Tocotoco] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Tocotoco] SET ARITHABORT OFF 
GO
ALTER DATABASE [Tocotoco] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Tocotoco] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Tocotoco] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Tocotoco] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Tocotoco] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Tocotoco] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Tocotoco] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Tocotoco] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Tocotoco] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Tocotoco] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Tocotoco] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Tocotoco] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Tocotoco] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Tocotoco] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Tocotoco] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Tocotoco] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Tocotoco] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Tocotoco] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Tocotoco] SET  MULTI_USER 
GO
ALTER DATABASE [Tocotoco] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Tocotoco] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Tocotoco] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Tocotoco] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Tocotoco] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Tocotoco] SET QUERY_STORE = OFF
GO
USE [Tocotoco]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [Tocotoco]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/13/2018 10:48:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[Password] [nvarchar](80) NULL,
	[Account_Detail_Id] [int] NULL,
	[Role_ID] [int] NULL,
	[Status] [int] NULL,
	[Create_Date] [date] NULL,
	[Active_code] [nvarchar](50) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account_Detail]    Script Date: 11/13/2018 10:48:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_Detail](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](100) NOT NULL,
	[Phone_Number] [nvarchar](50) NOT NULL,
	[Gender] [bit] NOT NULL,
	[Address] [nvarchar](500) NOT NULL,
	[NoteAddress] [nvarchar](1000) NULL,
 CONSTRAINT [PK_Account_Detail] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 11/13/2018 10:48:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Category] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 11/13/2018 10:48:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AccountID] [int] NULL,
	[Date] [date] NULL,
	[Total Price] [float] NULL,
	[StatusOrder] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 11/13/2018 10:48:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [nvarchar](100) NULL,
	[ProductQuantity] [int] NULL,
	[ProductPrice] [float] NULL,
	[ProductID] [int] NULL,
	[OrderID] [int] NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Products]    Script Date: 11/13/2018 10:48:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](200) NOT NULL,
	[Category_Id] [int] NOT NULL,
	[Price] [float] NOT NULL,
	[Description] [nvarchar](1000) NOT NULL,
	[Quantity] [int] NOT NULL,
	[Status] [int] NOT NULL,
	[Image_Link] [nvarchar](200) NOT NULL,
	[Note] [nvarchar](1000) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 11/13/2018 10:48:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Status]    Script Date: 11/13/2018 10:48:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Status](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Status] [nvarchar](50) NULL,
 CONSTRAINT [PK_Status] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Status_Product]    Script Date: 11/13/2018 10:48:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Status_Product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Status] [nvarchar](50) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([Id], [Email], [Password], [Account_Detail_Id], [Role_ID], [Status], [Create_Date], [Active_code]) VALUES (1, N'tanpvse05645@fpt.edu.vn', N'$2a$10$XNPxSKG120rEI.hkejizIupQC0hzsTKJwjjZvMtTjhjbUXFj07i1i', 1, 1, 1, CAST(N'2018-10-15' AS Date), N'VSDSDL')
INSERT [dbo].[Account] ([Id], [Email], [Password], [Account_Detail_Id], [Role_ID], [Status], [Create_Date], [Active_code]) VALUES (2, N'phihoan29@gmail.com', N'$2a$10$6G9qBn3kPVKeDLxwHxYFQuT1bbljSr7rvcmZ0RFkB8Zml/NaJ/w2C', 2, 2, 1, CAST(N'2018-11-07' AS Date), N'Z0NRMZ')
SET IDENTITY_INSERT [dbo].[Account] OFF
SET IDENTITY_INSERT [dbo].[Account_Detail] ON 

INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address], [NoteAddress]) VALUES (1, N'Phan Việt Tân', N'0969123159', 1, N'Hà Nội', N'Xa La')
INSERT [dbo].[Account_Detail] ([Id], [Name], [Phone_Number], [Gender], [Address], [NoteAddress]) VALUES (2, N'Phan Phi Hoàn', N'0123456789', 1, N'Hà Nội', N'Xa La ,Hà Đông')
SET IDENTITY_INSERT [dbo].[Account_Detail] OFF
SET IDENTITY_INSERT [dbo].[Categories] ON 

INSERT [dbo].[Categories] ([id], [Category]) VALUES (1, N'Trà Sữa')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (2, N'Fresh fruit tea')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (3, N'Handmade freeze
')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (4, N'Mango')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (5, N'Machiato Cream Cheese')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (6, N'Candy')
INSERT [dbo].[Categories] ([id], [Category]) VALUES (7, N'Chè Xueshan')
SET IDENTITY_INSERT [dbo].[Categories] OFF
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([ID], [AccountID], [Date], [Total Price], [StatusOrder]) VALUES (9, 1, CAST(N'2018-11-13' AS Date), 184000, 2)
INSERT [dbo].[Order] ([ID], [AccountID], [Date], [Total Price], [StatusOrder]) VALUES (2, 1, CAST(N'2018-11-12' AS Date), 135000, 2)
INSERT [dbo].[Order] ([ID], [AccountID], [Date], [Total Price], [StatusOrder]) VALUES (5, 1, CAST(N'2018-11-12' AS Date), 69000, 2)
INSERT [dbo].[Order] ([ID], [AccountID], [Date], [Total Price], [StatusOrder]) VALUES (6, 1, CAST(N'2018-11-12' AS Date), 79000, 1)
SET IDENTITY_INSERT [dbo].[Order] OFF
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (1, N'Trà Xanh', 1, 30000, 2, 1)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (2, N'Yakul Chanh Leo', 1, 35000, 5, 2)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (3, N'Trà Nhật Đá Xay Kem Cheese', 1, 45000, 10, 2)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (4, N'Trà Sữa Rau Câu', 1, 55000, 9, 2)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (5, N'Trà Xanh', 1, 30000, 2, 3)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (6, N'Yakul Xoài', 1, 40000, 3, 3)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (7, N'Trà Xanh Nho', 1, 39000, 1, 3)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (8, N'Trà Xanh vị Nhài', 1, 45000, 7, 4)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (9, N'Xoài Sữa Chua', 1, 38000, 6, 4)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (10, N'Trà Xanh Nho', 1, 39000, 1, 5)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (11, N'Kiwi chanhleo', 1, 30000, 13, 5)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (12, N'Yakul Xoài', 1, 40000, 3, 6)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (13, N'Trà Xanh Nho', 1, 39000, 1, 6)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (14, N'Trà Xanh', 1, 30000, 2, 7)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (15, N'Yakul Trà Xanh', 1, 40000, 4, 7)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (16, N'Trà Xanh Nho', 1, 39000, 1, 8)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (17, N'Xoài Sữa Chua', 1, 38000, 6, 8)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (18, N'Trà Xanh Nho', 1, 39000, 1, 9)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (19, N'Trà Xanh', 1, 30000, 2, 9)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (20, N'Yakul Xoài', 1, 40000, 3, 9)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (21, N'Yakul Trà Xanh', 1, 40000, 4, 9)
INSERT [dbo].[OrderDetail] ([Id], [ProductName], [ProductQuantity], [ProductPrice], [ProductID], [OrderID]) VALUES (22, N'Yakul Chanh Leo', 1, 35000, 5, 9)
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
SET IDENTITY_INSERT [dbo].[Products] ON 

INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (1, N'Trà Xanh Nho', 4, 39000, N'Trà Xanh Vị Nho', 200, 2, N'Traxanhnho.jpg', N'')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (2, N'Trà Xanh', 4, 30000, N'Trà', 200, 1, N'Traxanh.jpg', N'Vị Trà Xanh Nguyên Chất làm tăng hương vị')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (3, N'Yakul Xoài', 6, 40000, N'Yakul', 200, 1, N'yakulxoai-1.png', N'Yakul cộng với vị Xoài làm tăng hương vị')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (4, N'Yakul Trà Xanh', 6, 40000, N'Yakul', 200, 1, N'yakultraxanh.png', N'Vị Yakul hòa với lại vị Trà Xanh làm tăng hương vị')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (5, N'Yakul Chanh Leo', 6, 35000, N'Yakul', 200, 2, N'yakulchanhleo.png', N'')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (6, N'Xoài Sữa Chua', 3, 38000, N'Sữa Chua', 300, 2, N'xoài-sữa-chua-đá-xay.jpg', N'')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (7, N'Trà Xanh vị Nhài', 4, 45000, N'Trà', 100, 1, N'xanhsuavinhai.jpg', N'Trà Xanh nguyên chất cùng với vị Nhài hòa quyện hương vị')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (8, N'Trà Sữa ToCo', 1, 39000, N'Trà Sữa', 200, 1, N'trasuatoco.jpg', N'Trà Sữa nguyên chất của Toco')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (9, N'Trà Sữa Rau Câu', 1, 55000, N'Trà Sữa', 100, 1, N'trasuaraucau.jpg', N'Trà Sữa của Toco cộng với lại thạch rau câu cho người uống cảm nhận vị của thiên nhiên')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (10, N'Trà Nhật Đá Xay Kem Cheese', 3, 45000, N'Freeze', 50, 1, N'tranhatdaxay.jpg', N'Kem cheese phủ hòa quyện với matcha')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (11, N'Trà Sữa Panda', 1, 39000, N'Trà Sữa', 100, 1, N'panda-1.jpg', N'Trà Sữa mới với vị nhẹ của trà xanh và topping độc đáo')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (12, N'Mứt Việt Quất Đá Xay', 3, 39000, N'Freeze', 100, 1, N'mutvietquatdaxay.jpg', N'Freeze Lạnh với vị việt quất thanh mát')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (13, N'Kiwi chanhleo', 2, 30000, N'Hồng Trà ', 300, 1, N'kiwichanhleo.jpg', N'Vị Chanh Leo hòa quyện với vị Kiwi làm cho người thưởng thức cảm thấy dễ chịu ')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (14, N'Hồng Trà Việt Quất', 4, 39000, N'Hồng Trà ', 150, 1, N'hongtravietquat.jpg', N'Hồng Trà Việt Quất Ngon lành')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (15, N'Chanh Sữa Chua Đá Xay', 3, 45000, N'Freeze', 100, 1, N'chanhsuachuadaxay.jpg', N'Hot nhất Hiện nay với vị chanh và vị kem cheese phủ bề mặt')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (16, N'Trà Quất Mật Ong', 6, 30000, N'Hồng Trà ', 50, 1, N'chanhquatmatong.jpg', N'Giúp cho người thưởng thức cảm nhận rõ vị Chanh và Vị Mật Ông ngoài ra còn chống 1 số bệnh ')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (17, N'Trà Sữa Chân Châu Hoàng Gia', 1, 30000, N'Trà Sữa', 100, 1, N'chanchauhoanggia.jpg', N'Công thức pha chế riêng tạo ra hương vị trà ngon với nhìn chông bắt mắt')
INSERT [dbo].[Products] ([id], [Name], [Category_Id], [Price], [Description], [Quantity], [Status], [Image_Link], [Note]) VALUES (18, N'Cà phê Caramen Đá Xay', 5, 45000, N'Kem cheese', 200, 1, N'cafecaramendaxay.jpg', N'Một trong những loại kem cheese ngon nhất với vị béo và vị mặn vừa phải')
SET IDENTITY_INSERT [dbo].[Products] OFF
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([Id], [Name]) VALUES (1, N'Admin')
INSERT [dbo].[Role] ([Id], [Name]) VALUES (2, N'Customer')
INSERT [dbo].[Role] ([Id], [Name]) VALUES (3, N'Employee')
SET IDENTITY_INSERT [dbo].[Role] OFF
SET IDENTITY_INSERT [dbo].[Status] ON 

INSERT [dbo].[Status] ([Id], [Status]) VALUES (1, N'Active')
INSERT [dbo].[Status] ([Id], [Status]) VALUES (2, N'Pending')
INSERT [dbo].[Status] ([Id], [Status]) VALUES (3, N'Deactive')
SET IDENTITY_INSERT [dbo].[Status] OFF
SET IDENTITY_INSERT [dbo].[Status_Product] ON 

INSERT [dbo].[Status_Product] ([id], [Status]) VALUES (1, N'Sell')
INSERT [dbo].[Status_Product] ([id], [Status]) VALUES (2, N'Sale')
INSERT [dbo].[Status_Product] ([id], [Status]) VALUES (3, N'Sold Out')
SET IDENTITY_INSERT [dbo].[Status_Product] OFF
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [DF_Account_Creat_Date]  DEFAULT (getdate()) FOR [Create_Date]
GO
USE [master]
GO
ALTER DATABASE [Tocotoco] SET  READ_WRITE 
GO
