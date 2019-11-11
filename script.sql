create table users (id INT NOT NULL , username VARCHAR(20)
                   , password VARCHAR(30), salt varchar(30), PRIMARY KEY (id));
create table friend (user_id INT, friend_id INT, status INT, PRIMARY KEY (user_id));
create table messages (id int, author_id int, recipient_id int, content_type int
                      , content_id int, seen boolean, primary key (id));
create table text_content (id int, content varchar(300), primary key (id));