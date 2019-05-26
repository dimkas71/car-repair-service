-- Table: public.clients

DROP TABLE public.clients;

CREATE TABLE public.clients
(
  id bigint NOT NULL,
  name character varying(100),
  CONSTRAINT clients_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.clients
  OWNER TO postgres;
