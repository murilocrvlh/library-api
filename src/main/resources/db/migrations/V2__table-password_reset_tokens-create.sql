CREATE TABLE tb_password_reset_tokens (
    id UUID PRIMARY KEY,
    token TEXT NOT NULL UNIQUE,
    users UUID NOT NULL,
    expiration TIMESTAMP NOT NULL,
    creation TIMESTAMP NOT NULL,
    used BOOLEAN NOT NULL DEFAULT FALSE,
    CONSTRAINT fk_user FOREIGN KEY (users) REFERENCES tb_users(id)
);