DROP TABLE IF EXISTS word_categories;
CREATE TABLE IF NOT EXISTS word_categories
(
    id BIGSERIAL,
    category_name character varying(100) NOT NULL,
    CONSTRAINT word_categories_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS word_types;
CREATE TABLE IF NOT EXISTS word_types
(
    id BIGSERIAL,
    type_name character varying(50) NOT NULL,
    CONSTRAINT word_types_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS profiles;
CREATE TABLE IF NOT EXISTS profiles
(
    id BIGSERIAL,
    bio character varying(255),
    full_name character varying(255),
    picture character varying(255),
    CONSTRAINT profiles_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
    id BIGSERIAL,
    name character varying(100) NOT NULL,
    password character varying(25) NOT NULL,
    profile_id bigint,
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT unique_name UNIQUE (name),
    CONSTRAINT profiles_profile_id FOREIGN KEY (profile_id)
        REFERENCES profiles (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

DROP TABLE IF EXISTS words;
CREATE TABLE IF NOT EXISTS words
(
    id BIGSERIAL,
    definition character varying(255) NOT NULL,
    example character varying(255) NOT NULL,
    word character varying(255) NOT NULL,
    category_id bigint,
    type_id bigint,
    CONSTRAINT words_pkey PRIMARY KEY (id),
    CONSTRAINT word_types_type_id FOREIGN KEY (type_id)
        REFERENCES word_types (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT word_categories_category_id FOREIGN KEY (category_id)
        REFERENCES word_categories (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

DROP TABLE IF EXISTS user_word;
CREATE TABLE IF NOT EXISTS user_word
(
    user_id bigint NOT NULL,
    word_id bigint NOT NULL,
    CONSTRAINT user_word_pkey PRIMARY KEY (user_id, word_id),
    CONSTRAINT words_word_id FOREIGN KEY (word_id)
        REFERENCES words (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT users_user_id FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
