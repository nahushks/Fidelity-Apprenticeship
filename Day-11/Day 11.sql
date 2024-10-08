
CREATE TABLE Customers (CustomerID SERIAL PRIMARY KEY, ContactName VARCHAR(255), Country VARCHAR(100) DEFAULT 'Canada');


CREATE TABLE Shippers (ShipperID SERIAL PRIMARY KEY, CompanyName VARCHAR(255) UNIQUE);


CREATE TABLE Products (ProductID SERIAL PRIMARY KEY, CategoryID INTEGER, ProductName VARCHAR(255), UnitPrice NUMERIC(10, 2));


CREATE TABLE Orders (
    OrderID SERIAL PRIMARY KEY, 
    CustomerID INTEGER REFERENCES Customers(CustomerID), 
    EmployeeID INTEGER, 
    ShipName VARCHAR(255), 
    ShipCountry VARCHAR(100), 
    OrderDate DATE, 
    ShippedDate DATE,
    CHECK (ShippedDate > OrderDate));

CREATE TABLE OrderDetails (
    OrderID INTEGER PRIMARY KEY, 
    ProductID INTEGER REFERENCES Products(ProductID), 
    UnitPrice NUMERIC(10, 2), 
    Quantity INTEGER CHECK (Quantity > 10));



INSERT INTO Customers (ContactName, Country)
VALUES 
    ('Nahush', 'India'),
    ('John', 'Canada'),
    ('Johnson', 'UK'),
    ('Amar', 'Australia'),
    ('JK', 'Canada');



INSERT INTO Shippers (CompanyName)
VALUES 
    ('Fidelity'),
    ('American Express'),
    ('IBM'),
    ('Microsoft'),
    ('Google');


INSERT INTO Products (CategoryID, ProductName, UnitPrice)
VALUES 
    (1, 'Laptop', 1500.00),
    (1, 'Smartphone', 800.00),
    (2, 'Headphones', 200.00),
    (3, 'Keyboard', 50.00),
    (2, 'Monitor', 300.00);


INSERT INTO Orders (CustomerID, EmployeeID, ShipName, ShipCountry, OrderDate, ShippedDate)
VALUES 
    (1, 101, 'Fidelity', 'USA', '2024-10-01', '2024-10-03'),
    (2, 102, 'American Express', 'Canada', '2024-09-25', '2024-09-27'),
    (3, 103, 'IBM', 'UK', '2024-09-15', '2024-09-18'),
    (4, 104, 'Microsoft', 'Australia', '2024-09-12', '2024-09-14'),
    (5, 105, 'Google', 'Canada', '2024-10-05', '2024-10-07');



INSERT INTO OrderDetails (OrderID, ProductID, UnitPrice, Quantity)
VALUES 
    (1, 1, 1500.00, 12),
    (2, 2, 800.00, 15),
    (3, 3, 200.00, 11),
    (4, 4, 50.00, 13),
    (5, 5, 300.00, 16);

SELECT * from Customers;

INSERT INTO OrderDetails (OrderID, ProductID, UnitPrice, Quantity)
VALUES 
    (6, 6, 1800.00, 9);