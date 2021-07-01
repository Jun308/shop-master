SELECT * FROM Products
SELECT COUNT(*) as Total FROM Products
---------------------------

DECLARE @PageSize INT = 10;
DECLARE @PageIndex INT = 2; 

select ID,Name,Category_Id,Price,Description,Quantity,Status,Image_Link,Note from (
    select ROW_NUMBER() over (order by ID asc) as rn, *
    from Products
) as x
where rn between (@PageIndex-1)*@PageSize + 1 and @PageIndex * @PageSize