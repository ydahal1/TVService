CREATE TABLE OPERATOR(
  userId INTEGER REFERENCES User(userId),
  firstName VARCHAR(20) NOT NULL,
  lastName VARCHAR(20) NOT NULL,
  emailId VARCHAR(20) NOT NULL,
  phoneNumber INTEGER NOT NULL,
  --Shift Time Start
  sts DATE NOT NULL,
  --Shift Time End
  ste DATE NOT NULL,
  --Max.no.of Customer to be managed
  mcm INTEGER NOT NULL
);
