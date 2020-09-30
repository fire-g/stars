
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
  PRIMARY KEY (id));


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
  PRIMARY KEY (id));


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
  PRIMARY KEY (id));


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
  PRIMARY KEY (id));