CREATE SCHEMA colibri;

CREATE TABLE colibri.cars (
  make        TEXT,
  model       TEXT,
  colour      TEXT,
  engine_size DOUBLE PRECISION,
  PRIMARY KEY (make, model)
);