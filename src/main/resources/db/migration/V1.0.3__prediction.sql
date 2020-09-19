CREATE TABLE PREDICTION
(
    id             BIGSERIAL PRIMARY KEY,
    timestamp      TIMESTAMPTZ,
    config         JSONB,
    stationid      VARCHAR
);
