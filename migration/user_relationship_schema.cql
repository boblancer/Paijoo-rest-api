CREATE TABLE user_relationship (
  	user_id bigint,
	friend_id biting,
	created_at timestamp,
) WITH CLUSTERING ORDER BY (user_id DESC);