FROM postgres:10-alpine

ADD sql/setup.sql /docker-entrypoint-initdb.d/