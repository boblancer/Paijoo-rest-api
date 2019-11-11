CREATE TABLE text_messages (
  author_id bigint,
  recipient bigint,
  message_id bigint,
  content text,
  seen Boolean,
  PRIMARY KEY (author_id, message_id)
) WITH CLUSTERING ORDER BY (message_id DESC);