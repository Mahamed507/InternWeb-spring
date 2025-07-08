use job;

create table user_table(
id int primary key auto_increment,
name varchar(100),
skills text,
location text);

create table internship(
id int primary key auto_increment,
title varchar(100),
company varchar(100),
required_skills text,
location varchar(100)

);

INSERT INTO user_table (name, skills, location)
VALUES ('Ali Mohamed', 'Java, SQL', 'Minneapolis');

INSERT INTO user_table (name, skills, location)
VALUES ('Sara Ahmed', 'HTML, CSS, JavaScript', 'Chicago');

INSERT INTO user_table (name, skills, location)
VALUES ('Khalid Noor', 'Python, Excel', 'Remote');

INSERT INTO user_table (name, skills, location)
VALUES ('Layla Yusuf', 'Android, Kotlin', 'San Francisco');

INSERT INTO user_table (name, skills, location)
VALUES ('Abdi Hassan', 'Machine Learning, PyTorch', 'Remote');


INSERT INTO internship (title, company, required_skills, location)
VALUES ('Backend Developer Intern', 'Techify Inc', 'Java, Spring Boot, SQL', 'Minneapolis');

INSERT INTO internship (title, company, required_skills, location)
VALUES ('Frontend Web Intern', 'Pixel Studios', 'HTML, CSS, JavaScript', 'Chicago');

INSERT INTO internship (title, company, required_skills, location)
VALUES ('Data Analyst Intern', 'DataDive', 'Python, SQL, Excel', 'Remote');

INSERT INTO internship (title, company, required_skills, location)
VALUES ('Mobile App Developer Intern', 'AppNest', 'Kotlin, Android, Firebase', 'San Francisco');

INSERT INTO internship (title, company, required_skills, location)
VALUES ('AI Research Intern', 'NeuralCore', 'Python, Machine Learning, PyTorch', 'Remote');
