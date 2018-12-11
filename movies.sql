CREATE TABLE IF NOT EXISTS movies (
 name varchar(32) NOT NULL,
  director varchar(16) NOT NULL,
  genre varchar(16) NOT NULL,
  year int(11) NOT NULL,
  movieid int(11) NOT NULL,	
  PRIMARY KEY (name)
);

INSERT INTO movies (name, director, genre, year, movieid) VALUES
('The Great Gatsby', 'Baz Luhrmann', 'Drama', 2013, 123),
('A Star is Born', 'Bradley Cooper', 'Drama', 2018, 124);