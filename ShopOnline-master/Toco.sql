select * from Account_Detail
select * from Account
select * from [Order]
-- insert Order
INSERT INTO [dbo].[Order]
           ([AccountID]
           ,[CreateDate]
           ,[Total Price])
     VALUES
           (2,'2018-10-20',0)
-- insert OrderDatail
INSERT INTO [dbo].[OrderDetail]
           ([ProductName]
           ,[ProductQuantity]
           ,[ProductPrice]
           ,[ProductID]
           ,[OrderID])
     VALUES
           (<ProductName, nvarchar(100),>
           ,<ProductQuantity, int,>
           ,<ProductPrice, int,>
           ,<ProductID, int,>
           ,<OrderID, int,>)
