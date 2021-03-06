USE [master]
GO
/****** Object:  Database [DBRent]    Script Date: 3/20/2019 11:31:16 PM ******/
CREATE DATABASE [DBRent]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DBRent', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\DBRent.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DBRent_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\DBRent_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DBRent] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DBRent].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DBRent] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DBRent] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DBRent] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DBRent] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DBRent] SET ARITHABORT OFF 
GO
ALTER DATABASE [DBRent] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [DBRent] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DBRent] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DBRent] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DBRent] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DBRent] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DBRent] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DBRent] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DBRent] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DBRent] SET  DISABLE_BROKER 
GO
ALTER DATABASE [DBRent] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DBRent] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DBRent] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DBRent] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DBRent] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DBRent] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DBRent] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DBRent] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [DBRent] SET  MULTI_USER 
GO
ALTER DATABASE [DBRent] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DBRent] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DBRent] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DBRent] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [DBRent] SET DELAYED_DURABILITY = DISABLED 
GO
USE [DBRent]
GO
/****** Object:  Table [dbo].[Cars]    Script Date: 3/20/2019 11:31:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cars](
	[cid] [varchar](250) NOT NULL,
	[cname] [varchar](250) NOT NULL,
	[license] [varchar](250) NOT NULL,
	[comment] [varchar](250) NOT NULL,
	[price] [float] NOT NULL,
	[status] [varchar](250) NOT NULL,
 CONSTRAINT [PK_Cars] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Owners]    Script Date: 3/20/2019 11:31:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Owners](
	[oid] [varchar](250) NOT NULL,
	[opassword] [varchar](250) NOT NULL,
	[ophone] [varchar](250) NULL,
	[oemail] [varchar](250) NOT NULL,
 CONSTRAINT [PK_Owners] PRIMARY KEY CLUSTERED 
(
	[oid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Renting]    Script Date: 3/20/2019 11:31:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Renting](
	[rid] [varchar](250) NOT NULL,
	[cid] [varchar](250) NOT NULL,
	[uid] [varchar](250) NOT NULL,
	[startDay] [varchar](250) NOT NULL,
	[returnDay] [varchar](250) NOT NULL,
	[totalPrice] [varchar](250) NOT NULL,
 CONSTRAINT [PK_Renting] PRIMARY KEY CLUSTERED 
(
	[rid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 3/20/2019 11:31:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[uid] [varchar](250) NOT NULL,
	[upassword] [varchar](250) NULL,
	[uphone] [varchar](250) NULL,
	[uemail] [varchar](250) NOT NULL,
	[dob] [varchar](250) NOT NULL,
	[cmnd] [int] NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Cars] ([cid], [cname], [license], [comment], [price], [status]) VALUES (N'l1', N'lamborghini', N'30a1-8888', N'moi', 1500, N'0')
INSERT [dbo].[Cars] ([cid], [cname], [license], [comment], [price], [status]) VALUES (N'lux1', N'audi R8', N'29f1-1231', N'mat guong', 500.5, N'1')
INSERT [dbo].[Cars] ([cid], [cname], [license], [comment], [price], [status]) VALUES (N'lux2', N'lexus 520', N'30a1-5555', N'xuoc mui', 300.4, N'1')
INSERT [dbo].[Cars] ([cid], [cname], [license], [comment], [price], [status]) VALUES (N'suv1', N'range rover', N'14a1-8888', N'moi', 400, N'0')
INSERT [dbo].[Cars] ([cid], [cname], [license], [comment], [price], [status]) VALUES (N'suv2', N'innova', N'34n1-55661', N'deno', 100, N'1')
INSERT [dbo].[Owners] ([oid], [opassword], [ophone], [oemail]) VALUES (N'ad1', N'ad1', N'111111111', N'ad1@gmail.com')
INSERT [dbo].[Owners] ([oid], [opassword], [ophone], [oemail]) VALUES (N'ad2', N'ad2', N'02222222222', N'ad2@gmail.com')
INSERT [dbo].[Owners] ([oid], [opassword], [ophone], [oemail]) VALUES (N'ad3', N'ad3', N'033333333333', N'ad3@gmail.com')
INSERT [dbo].[Owners] ([oid], [opassword], [ophone], [oemail]) VALUES (N'ad4', N'ad4', N'04444444444', N'ad4@gmail.com')
INSERT [dbo].[Owners] ([oid], [opassword], [ophone], [oemail]) VALUES (N'ad5', N'ad5', N'0123456789', N'ad5@gmail.com')
INSERT [dbo].[Renting] ([rid], [cid], [uid], [startDay], [returnDay], [totalPrice]) VALUES (N'r01', N'lux1', N'u4', N'20/1/2017', N'22/1/2017', N'1001')
INSERT [dbo].[Renting] ([rid], [cid], [uid], [startDay], [returnDay], [totalPrice]) VALUES (N'r02', N'lux2', N'u1', N'30/5/2017', N'4/6/2017', N'1502')
INSERT [dbo].[Renting] ([rid], [cid], [uid], [startDay], [returnDay], [totalPrice]) VALUES (N'r03', N'lux2', N'u2', N'1/1/2018', N'2/1/2018', N'300.4')
INSERT [dbo].[Renting] ([rid], [cid], [uid], [startDay], [returnDay], [totalPrice]) VALUES (N'r04', N'l1', N'u5', N'1/1/2019', N'5/1/2019', N'6000')
INSERT [dbo].[Users] ([uid], [upassword], [uphone], [uemail], [dob], [cmnd]) VALUES (N'u1', N'u1', N'0123567894', N'u1@gmail.com', N'11/11/1966', 123456789)
INSERT [dbo].[Users] ([uid], [upassword], [uphone], [uemail], [dob], [cmnd]) VALUES (N'u2', N'u2', N'0551122668', N'u2@gmail.com', N'22/1/1980', 123789456)
INSERT [dbo].[Users] ([uid], [upassword], [uphone], [uemail], [dob], [cmnd]) VALUES (N'u3', N'u3', N'0421587951', N'u3@gmail.com', N'30/9/1970', 254639871)
INSERT [dbo].[Users] ([uid], [upassword], [uphone], [uemail], [dob], [cmnd]) VALUES (N'u4', N'u4', N'0512369852', N'u4@gmail.com', N'23/12/1998', 123456789)
INSERT [dbo].[Users] ([uid], [upassword], [uphone], [uemail], [dob], [cmnd]) VALUES (N'u5', N'u5', N'0123456258', N'u5@gmail.com', N'25/12/1998', 256314789)
ALTER TABLE [dbo].[Renting]  WITH CHECK ADD  CONSTRAINT [FK_Renting_Cars] FOREIGN KEY([cid])
REFERENCES [dbo].[Cars] ([cid])
GO
ALTER TABLE [dbo].[Renting] CHECK CONSTRAINT [FK_Renting_Cars]
GO
ALTER TABLE [dbo].[Renting]  WITH CHECK ADD  CONSTRAINT [FK_Renting_Users] FOREIGN KEY([uid])
REFERENCES [dbo].[Users] ([uid])
GO
ALTER TABLE [dbo].[Renting] CHECK CONSTRAINT [FK_Renting_Users]
GO
USE [master]
GO
ALTER DATABASE [DBRent] SET  READ_WRITE 
GO
