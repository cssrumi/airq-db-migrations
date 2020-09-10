CREATE TABLE AIRQ_PHENOTYPE
(
    id             BIGSERIAL PRIMARY KEY,
    timestamp      TIMESTAMPTZ,
    stationid      VARCHAR,
    fields         JSONB,
    values         JSONB,
    prediction     JSONB,
    fitness        DOUBLE PRECISION
);
