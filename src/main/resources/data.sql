CREATE TABLE countries ( 
   id INT NOT NULL, 
   name VARCHAR(50) NOT NULL
);

INSERT INTO countries (id, name) VALUES (1, 'USA');
INSERT INTO countries (id, name) VALUES (2, 'France');
INSERT INTO countries (id, name) VALUES (3, 'Brazil');
INSERT INTO countries (id, name) VALUES (4, 'Italy');
INSERT INTO countries (id, name) VALUES (5, 'Canada');

CREATE TABLE USER_INFO (
	ID INT NOT NULL PRIMARY KEY, 
	NAME VARCHAR(255) NOT NULL,
	DEPARTMENT VARCHAR(50) NOT NULL,
	CREATED_DATE DATE NOT NULL,
	LAST_MODIFIED_DATE DATE NOT NULL
);
