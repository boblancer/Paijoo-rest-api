CREATE TABLE text_messages (
  	user_id bigint,
	username text,
	password text,
	salt	 text,
  	PRIMARY KEY (user_id)
) WITH CLUSTERING ORDER BY (message_id DESC);