CREATE TABLE Retailer(
  userId INTEGER REFERENCES User(userId),
  name VARCHAR(30) NOT NULL,
  contactNo1 VARCHAR(30) NOT NULL,
  contactNo2 VARCHAR(30),
  addressId INTEGER REFERENCES Address(addressId),
  --Set Top Box Limit
  STBL VARCHAR(30) NOT NULL,
  creditLimit VARCHAR(30) NOT NULL,
  --Commission percentage on sale of goods
  CPSG VARCHAR(30) NOT NULL,
  serviceCharge VARCHAR(30) NOT NULL,
  inventoryList VARCHAR(30) NOT NULL,
  --Retailer Creation Date
  RCD date NOT NULL,
  --Total Cost of Inventory
  TCI INTEGER NOT NULL
);