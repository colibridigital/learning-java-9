CREATE SCHEMA colibri;

CREATE TABLE colibri.cars (
  id          SERIAL,
  make        TEXT,
  model       TEXT,
  colour      TEXT,
  engine_size DOUBLE PRECISION,
  PRIMARY KEY (id)
);