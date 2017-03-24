CREATE TABLE User_Role (
  userId INTEGER REFERENCES User(userId),
  roleId INTEGER REFERENCES Role(roleId)
);