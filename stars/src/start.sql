create table stars.location
(
	ID int not null
		primary key,
	name varchar(20) not null,
	level varchar(10) null,
	previousID int null
);

create table stars.prediction
(
	ID int auto_increment
		primary key,
	locationID int not null,
	weatherID int not null,
	flush_time int null,
	wind_direction int null,
	constraint prediction_location_ID_fk
		foreign key (locationID) references stars.location (ID),
	constraint prediction_weather_ID_fk
		foreign key (weatherID) references stars.weather (ID)
);

create table stars.weather
(
	ID int not null
		primary key,
	locationID int not null,
	time_slot int not null,
	temperature double null,
	humidity double null,
	wind_direction int null,
	wind_power int null,
	constraint weather_location_ID_fk
		foreign key (locationID) references stars.location (ID)
);

