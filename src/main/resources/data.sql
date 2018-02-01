INSERT INTO ESTATE_OFFER (ID, STATUS, LONGITUDE, LATITUDE, COUNTRY, PROVINCE, LOCALITY, STREET, NUMBER, NAME, SURNAME, PHONE, MAIL, CREATED_AT, CURRENCY_TYPE, PRICE_PER_METER, PRICE_VALUE, AREA_SIZE, LOT_SIZE, FLOOR, FLOOR_TOTAL, NUMBER_OF_BATHROOMS, YEAR_BUILT, DESCRIPTION)
VALUES
  (1, 'ACTIVE', 54.21, 18.39, 'POLSKA', 'POMORSKIE', 'GDAŃSK', 'SZEROKA', 100, 'JAN', 'HEWELIUSZ', '+48 123-456-789', 'zuraw-gdanski@gmail.com', '1441-01-01 12:00:00', 'PLN', 100000, 100000000, 1000, 10, 8, 0, 2, 1442, 'ŻURAW GDAŃSKI'),
  (2, 'NON_ACTIVE', 52.13, 21.00, 'POLSKA', 'MAZOWIECKIE', 'WARSZAWA', 'PLAC DEFILAD', 1, 'Zygmunt III', 'WAZA', '+48 123-456-789', 'pkin@gmail.com', '1952-01-01 12:00:00', 'PLN', 900000, 110775600000, 123084, 1000, 42, 0, 500, 1952, 'PAŁAC KULTURY I NAUKI');


INSERT INTO ESTATE_OFFER_KEYWORDS (ESTATE_OFFER_ID, KEYWORDS)
VALUES
  (1, 'ZABYTEK'),
  (1, 'GDAŃSK'),
  (2, 'WIEŻOWIEC'),
  (2, 'WARSZAWA');
