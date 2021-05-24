--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

-- Started on 2021-05-22 23:31:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 205 (class 1259 OID 24620)
-- Name: candidates; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidates (
    id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    identity_number character varying(11) NOT NULL,
    birth_date date NOT NULL
);


ALTER TABLE public.candidates OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 24623)
-- Name: candidates_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.candidates ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.candidates_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 213 (class 1259 OID 24666)
-- Name: employee_confirms; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee_confirms (
    id integer NOT NULL,
    employee_id integer NOT NULL,
    is_confirmed boolean NOT NULL,
    confirm_date date NOT NULL
);


ALTER TABLE public.employee_confirms OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 24671)
-- Name: employee_confirms_employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee_confirms_employers (
    id integer NOT NULL,
    employer_id integer NOT NULL
);


ALTER TABLE public.employee_confirms_employers OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 24606)
-- Name: employees; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employees (
    id integer NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL
);


ALTER TABLE public.employees OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 24614)
-- Name: employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employers (
    id integer NOT NULL,
    company_name character varying(255) NOT NULL,
    web_adress character varying NOT NULL,
    phone_number character varying(12) NOT NULL
);


ALTER TABLE public.employers OWNER TO postgres;

--
-- TOC entry 3075 (class 0 OID 0)
-- Dependencies: 204
-- Name: TABLE employers; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.employers IS 'iş verenler';


--
-- TOC entry 203 (class 1259 OID 24609)
-- Name: employess_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.employees ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.employess_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 207 (class 1259 OID 24636)
-- Name: job_titles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_titles (
    id integer NOT NULL,
    title character varying(255) NOT NULL
);


ALTER TABLE public.job_titles OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 24639)
-- Name: job_titles_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.job_titles ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.job_titles_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 200 (class 1259 OID 24595)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id integer NOT NULL,
    email_adress character varying(50) NOT NULL,
    password character varying(25) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 24598)
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.users ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 211 (class 1259 OID 24656)
-- Name: verification_code_candidates; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_code_candidates (
    id integer NOT NULL,
    candidate_id integer NOT NULL
);


ALTER TABLE public.verification_code_candidates OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 24661)
-- Name: verification_code_employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_code_employers (
    id integer NOT NULL,
    employer_id integer NOT NULL
);


ALTER TABLE public.verification_code_employers OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 24646)
-- Name: verification_codes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_codes (
    id integer NOT NULL,
    code character varying(50) NOT NULL,
    is_verified boolean NOT NULL,
    verified_date date NOT NULL
);


ALTER TABLE public.verification_codes OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 24649)
-- Name: verification_codes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.verification_codes ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.verification_codes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 3060 (class 0 OID 24620)
-- Dependencies: 205
-- Data for Name: candidates; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidates (id, first_name, last_name, identity_number, birth_date) FROM stdin;
\.


--
-- TOC entry 3068 (class 0 OID 24666)
-- Dependencies: 213
-- Data for Name: employee_confirms; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee_confirms (id, employee_id, is_confirmed, confirm_date) FROM stdin;
\.


--
-- TOC entry 3069 (class 0 OID 24671)
-- Dependencies: 214
-- Data for Name: employee_confirms_employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee_confirms_employers (id, employer_id) FROM stdin;
\.


--
-- TOC entry 3057 (class 0 OID 24606)
-- Dependencies: 202
-- Data for Name: employees; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employees (id, first_name, last_name) FROM stdin;
\.


--
-- TOC entry 3059 (class 0 OID 24614)
-- Dependencies: 204
-- Data for Name: employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employers (id, company_name, web_adress, phone_number) FROM stdin;
\.


--
-- TOC entry 3062 (class 0 OID 24636)
-- Dependencies: 207
-- Data for Name: job_titles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.job_titles (id, title) FROM stdin;
\.


--
-- TOC entry 3055 (class 0 OID 24595)
-- Dependencies: 200
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, email_adress, password) FROM stdin;
\.


--
-- TOC entry 3066 (class 0 OID 24656)
-- Dependencies: 211
-- Data for Name: verification_code_candidates; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_code_candidates (id, candidate_id) FROM stdin;
\.


--
-- TOC entry 3067 (class 0 OID 24661)
-- Dependencies: 212
-- Data for Name: verification_code_employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_code_employers (id, employer_id) FROM stdin;
\.


--
-- TOC entry 3064 (class 0 OID 24646)
-- Dependencies: 209
-- Data for Name: verification_codes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_codes (id, code, is_verified, verified_date) FROM stdin;
\.


--
-- TOC entry 3076 (class 0 OID 0)
-- Dependencies: 206
-- Name: candidates_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidates_id_seq', 1, false);


--
-- TOC entry 3077 (class 0 OID 0)
-- Dependencies: 203
-- Name: employess_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.employess_id_seq', 1, false);


--
-- TOC entry 3078 (class 0 OID 0)
-- Dependencies: 208
-- Name: job_titles_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.job_titles_id_seq', 1, false);


--
-- TOC entry 3079 (class 0 OID 0)
-- Dependencies: 201
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.users_id_seq', 1, false);


--
-- TOC entry 3080 (class 0 OID 0)
-- Dependencies: 210
-- Name: verification_codes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.verification_codes_id_seq', 1, false);


--
-- TOC entry 2902 (class 2606 OID 24631)
-- Name: candidates candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT candidates_pkey PRIMARY KEY (id);


--
-- TOC entry 2914 (class 2606 OID 24675)
-- Name: employee_confirms_employers employee_confirms_employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT employee_confirms_employers_pkey PRIMARY KEY (id);


--
-- TOC entry 2912 (class 2606 OID 24670)
-- Name: employee_confirms employee_confirms_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT employee_confirms_pkey PRIMARY KEY (id);


--
-- TOC entry 2900 (class 2606 OID 24629)
-- Name: employers employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (id);


--
-- TOC entry 2898 (class 2606 OID 24633)
-- Name: employees employess_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employess_pkey PRIMARY KEY (id);


--
-- TOC entry 2904 (class 2606 OID 24645)
-- Name: job_titles job_titles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_titles
    ADD CONSTRAINT job_titles_pkey PRIMARY KEY (id);


--
-- TOC entry 2896 (class 2606 OID 24635)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2908 (class 2606 OID 24660)
-- Name: verification_code_candidates verification_code_candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_candidates
    ADD CONSTRAINT verification_code_candidates_pkey PRIMARY KEY (id);


--
-- TOC entry 2910 (class 2606 OID 24665)
-- Name: verification_code_employers verification_code_employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_employers
    ADD CONSTRAINT verification_code_employers_pkey PRIMARY KEY (id);


--
-- TOC entry 2906 (class 2606 OID 24655)
-- Name: verification_codes verification_codes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT verification_codes_pkey PRIMARY KEY (id);


--
-- TOC entry 2919 (class 2606 OID 24701)
-- Name: verification_code_candidates fk_candidate_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_candidates
    ADD CONSTRAINT fk_candidate_id FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- TOC entry 2917 (class 2606 OID 24676)
-- Name: candidates fk_candidates; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT fk_candidates FOREIGN KEY (id) REFERENCES public.users(id);


--
-- TOC entry 2924 (class 2606 OID 24721)
-- Name: employee_confirms_employers fk_confirms_employers_employer_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT fk_confirms_employers_employer_id FOREIGN KEY (employer_id) REFERENCES public.employers(id);


--
-- TOC entry 2923 (class 2606 OID 24716)
-- Name: employee_confirms_employers fk_confirms_employers_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT fk_confirms_employers_id FOREIGN KEY (id) REFERENCES public.employee_confirms(id);


--
-- TOC entry 2922 (class 2606 OID 24711)
-- Name: employee_confirms fk_employee_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES public.employees(id);


--
-- TOC entry 2915 (class 2606 OID 24686)
-- Name: employees fk_employees; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fk_employees FOREIGN KEY (id) REFERENCES public.users(id);


--
-- TOC entry 2916 (class 2606 OID 24681)
-- Name: employers fk_employers; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT fk_employers FOREIGN KEY (id) REFERENCES public.users(id);


--
-- TOC entry 2921 (class 2606 OID 24706)
-- Name: verification_code_employers fk_employers_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_employers
    ADD CONSTRAINT fk_employers_id FOREIGN KEY (employer_id) REFERENCES public.employers(id);


--
-- TOC entry 2918 (class 2606 OID 24691)
-- Name: verification_code_candidates fk_verification_code_candidates; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_candidates
    ADD CONSTRAINT fk_verification_code_candidates FOREIGN KEY (id) REFERENCES public.verification_codes(id);


--
-- TOC entry 2920 (class 2606 OID 24696)
-- Name: verification_code_employers fk_verification_code_employers; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_code_employers
    ADD CONSTRAINT fk_verification_code_employers FOREIGN KEY (id) REFERENCES public.verification_codes(id);


-- Completed on 2021-05-22 23:31:58

--
-- PostgreSQL database dump complete
--

