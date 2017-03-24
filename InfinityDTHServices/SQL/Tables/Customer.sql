CREATE TABLE Customer (
  userId INTEGER REFERENCES User(userId),
  firstName VARCHAR(20) NOT NULL,
  lastName VARCHAR(20) NOT NULL,
  emailId VARCHAR(20) NOT NULL,
  phoneNumber INTEGER NOT NULL,
  addressId INTEGER REFERENCES Address(addressId)
);