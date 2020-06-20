DROP TABLE IF EXISTS CATALOG;

CREATE TABLE CATALOG (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  shortid VARCHAR(10) NOT NULL,
  category VARCHAR(10) NOT NULL,
  description VARCHAR(50) NOT NULL,
  price INT
);

INSERT INTO CATALOG
    (shortid, category, description, price) VALUES
    ('Desk001' , 'Desk', 'Costa Coffee Oak Desk', 400),
    ('Desk002' , 'Desk', 'Rectangular Chestnut Computer Desk', 330),
    ('Desk003' , 'Desk', 'Rectangular Black Standing Desk', 80),
    ('Chair001' , 'Chair', 'Brighton Black Drafting Chair', 110),
    ('Chair002' , 'Chair', 'Black Leather Executive Office Chair', 140),
    ('Chair003' , 'Chair', 'White Task Chair', 60),
    ('Sofa001' , 'Sofa', 'Caramel Leather Sofa', 1200),
    ('Sofa002' , 'Sofa', 'Brown Leather Sofa', 140);