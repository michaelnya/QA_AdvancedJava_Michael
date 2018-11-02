/*    ==Scripting Parameters==

    Source Server Version : SQL Server 2014 (12.0.2000)
    Source Database Engine Edition : Microsoft SQL Server Express Edition
    Source Database Engine Type : Standalone SQL Server

    Target Server Version : SQL Server 2014
    Target Database Engine Edition : Microsoft SQL Server Express Edition
    Target Database Engine Type : Standalone SQL Server
*/

USE [master]
GO

/****** Object:  Database [Supermarket]    Script Date: 30/10/2018 16:29:04 ******/
CREATE DATABASE [Supermarket]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Supermarket', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Supermarket.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Supermarket_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Supermarket_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [Supermarket] SET COMPATIBILITY_LEVEL = 120
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Supermarket].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [Supermarket] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [Supermarket] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [Supermarket] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [Supermarket] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [Supermarket] SET ARITHABORT OFF 
GO

ALTER DATABASE [Supermarket] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [Supermarket] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [Supermarket] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [Supermarket] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [Supermarket] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [Supermarket] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [Supermarket] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [Supermarket] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [Supermarket] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [Supermarket] SET  DISABLE_BROKER 
GO

ALTER DATABASE [Supermarket] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [Supermarket] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [Supermarket] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [Supermarket] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [Supermarket] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [Supermarket] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [Supermarket] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [Supermarket] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [Supermarket] SET  MULTI_USER 
GO

ALTER DATABASE [Supermarket] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [Supermarket] SET DB_CHAINING OFF 
GO

ALTER DATABASE [Supermarket] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [Supermarket] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO

ALTER DATABASE [Supermarket] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [Supermarket] SET  READ_WRITE 
GO

