#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE USER marcos WITH PASSWORD 'secretpassword';
    CREATE DATABASE sumdb;
    GRANT ALL PRIVILEGES ON DATABASE sumdb TO marcos;
EOSQL
