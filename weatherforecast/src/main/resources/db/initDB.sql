
-- -----------------------------------------------------
-- Table location
-- -----------------------------------------------------
CREATE TABLE location (
  id INT IDENTITY NOT NULL,
  name VARCHAR(20) NOT NULL,
  adm1 VARCHAR(20) NOT NULL,
  adm2 VARCHAR(20) NOT NULL,
  lat DOUBLE NOT NULL,
  lon DOUBLE NOT NULL,
  country VARCHAR(20) NOT NULL,
  location_id VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);


-- -----------------------------------------------------
-- Table today_weather
-- -----------------------------------------------------
CREATE TABLE today_weather (
  id INT IDENTITY NOT NULL,
  date DATETIME NOT NULL,
  temp INT NOT NULL,
  feels_like INT NOT NULL,
  text VARCHAR(20) NOT NULL,
  wind_dir VARCHAR(10) NOT NULL,
  wind_scale VARCHAR(10) NOT NULL,
  wind_speed INT NOT NULL,
  humidity INT NOT NULL,
  pressure INT NOT NULL,
  vis INT NOT NULL,
  cloud INT NOT NULL,
  location_id VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);


-- -----------------------------------------------------
-- Table forecast_weather
-- -----------------------------------------------------
CREATE TABLE forecast_weather (
  id INT IDENTITY NOT NULL,
  date DATETIME NOT NULL,
  fx_date DATETIME NOT NULL,
  sunrise VARCHAR(10) NOT NULL,
  sunset VARCHAR(10) NOT NULL,
  temp_max INT NOT NULL,
  temp_min INT NOT NULL,
  text_day VARCHAR(10) NOT NULL,
  text_night VARCHAR(10) NOT NULL,
  wind_dir_night VARCHAR(10) NOT NULL,
  wind_dir_day VARCHAR(10) NOT NULL,
  wind_scale_day VARCHAR(10) NOT NULL,
  wind_scale_night VARCHAR(10) NOT NULL,
  humidity INT NOT NULL,
  pressure INT NOT NULL,
  vis INT NOT NULL,
  cloud INT NOT NULL,
  moon_phase VARCHAR(20) NOT NULL,
  location_id VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);


-- -----------------------------------------------------
-- Table life_index
-- -----------------------------------------------------
CREATE TABLE life_index (
  id INT IDENTITY NOT NULL,
  date DATETIME NOT NULL,
  fx_date DATETIME NOT NULL,
  type INT NOT NULL,
  name VARCHAR(20) NOT NULL,
  level INT NOT NULL,
  category VARCHAR(45) NOT NULL,
  text VARCHAR(90) NOT NULL,
  location_id VARCHAR(20) NOT NULL,
  PRIMARY KEY (id));
  
CREATE TABLE hourly_weather (
  id INT IDENTITY NOT NULL,
  date DATETIME NOT NULL,
  fx_date DATETIME NOT NULL,
  temp INT NOT NULL,
  text VARCHAR(20) NOT NULL,
  wind_dir VARCHAR(10) NOT NULL,
  wind_scale VARCHAR(10) NOT NULL,
  wind_speed INT NOT NULL,
  humidity INT NOT NULL,
  pressure INT NOT NULL,
  pop INT NOT NULL,
  precip DOUBLE NOT NULL,
  cloud INT NOT NULL,
  dew INT NOT NULL,
  location_id VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE user (
    id INT IDENTITY NOT NULL,
    username VARCHAR(64) NOT NULL,
    email VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    salt VARCHAR(64) NOT NULL,
    PRIMARY KEY (id)
);

//邮箱:18296517259@163.com
//密码:123456
INSERT INTO user (id, username, email, password, salt)
values (1,'测试','18296517259@163.com','b06cff8cdc8df9f59722c784b6a215b0','4ef80102-50a6-4908-9969-109bab2d1546')