-- USER SQL
CREATE USER "DB_TIENDAANGELITO" IDENTIFIED BY "1234" 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP"
ACCOUNT UNLOCK ;

-- QUOTAS

-- ROLES
ALTER USER "DB_TIENDAANGELITO" DEFAULT ROLE "CONNECT";

-- SYSTEM PRIVILEGES
GRANT CREATE JOB TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT UPDATE ANY CUBE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY TRIGGER TO "DB_TIENDAANGELITO" ;
GRANT MANAGE ANY FILE GROUP TO "DB_TIENDAANGELITO" ;
GRANT ALTER PUBLIC DATABASE LINK TO "DB_TIENDAANGELITO" ;
GRANT MANAGE FILE GROUP TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY INDEX TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY SEQUENCE TO "DB_TIENDAANGELITO" ;
GRANT ALTER PROFILE TO "DB_TIENDAANGELITO" ;
GRANT UNDER ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY LIBRARY TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY EDITION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ROLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE LIBRARY TO "DB_TIENDAANGELITO" ;
GRANT DROP ROLLBACK SEGMENT TO "DB_TIENDAANGELITO" ;
GRANT CREATE TRIGGER TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT ADMINISTER DATABASE TRIGGER TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY MEASURE FOLDER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY OUTLINE TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY INDEXTYPE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY DIRECTORY TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY RULE SET TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT DEBUG CONNECT SESSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT ALTER SESSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE MATERIALIZED VIEW TO "DB_TIENDAANGELITO" ;
GRANT MERGE ANY VIEW TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY INDEX TO "DB_TIENDAANGELITO" ;
GRANT CREATE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY RULE SET TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY MATERIALIZED VIEW TO "DB_TIENDAANGELITO" ;
GRANT AUDIT SYSTEM TO "DB_TIENDAANGELITO" ;
GRANT CREATE OPERATOR TO "DB_TIENDAANGELITO" ;
GRANT MANAGE ANY QUEUE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY SQL PROFILE TO "DB_TIENDAANGELITO" ;
GRANT GRANT ANY OBJECT PRIVILEGE TO "DB_TIENDAANGELITO" ;
GRANT CREATE INDEXTYPE TO "DB_TIENDAANGELITO" ;
GRANT AUDIT ANY TO "DB_TIENDAANGELITO" ;
GRANT DEBUG ANY PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY MEASURE FOLDER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY SEQUENCE TO "DB_TIENDAANGELITO" ;
GRANT CREATE MEASURE FOLDER TO "DB_TIENDAANGELITO" ;
GRANT UPDATE ANY CUBE BUILD PROCESS TO "DB_TIENDAANGELITO" ;
GRANT CREATE VIEW TO "DB_TIENDAANGELITO" ;
GRANT ALTER DATABASE LINK TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY EVALUATION CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT DELETE ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE SESSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE RULE TO "DB_TIENDAANGELITO" ;
GRANT BECOME USER TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT INSERT ANY MEASURE FOLDER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY SQL PROFILE TO "DB_TIENDAANGELITO" ;
GRANT FORCE ANY TRANSACTION TO "DB_TIENDAANGELITO" ;
GRANT DELETE ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY SEQUENCE TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY EDITION TO "DB_TIENDAANGELITO" ;
GRANT CREATE EXTERNAL JOB TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY MATERIALIZED VIEW TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY CUBE BUILD PROCESS TO "DB_TIENDAANGELITO" ;
GRANT FLASHBACK ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY RULE SET TO "DB_TIENDAANGELITO" ;
GRANT BACKUP ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY CUBE TO "DB_TIENDAANGELITO" ;
GRANT CREATE TABLE TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY LIBRARY TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY OUTLINE TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY CLUSTER TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY CLASS TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY RULE SET TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY SEQUENCE TO "DB_TIENDAANGELITO" ;
GRANT UNDER ANY TYPE TO "DB_TIENDAANGELITO" ;
GRANT MANAGE TABLESPACE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY OPERATOR TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY OPERATOR TO "DB_TIENDAANGELITO" ;
GRANT EXEMPT IDENTITY POLICY TO "DB_TIENDAANGELITO" ;
GRANT CREATE TYPE TO "DB_TIENDAANGELITO" ;
GRANT CREATE TABLESPACE TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY TRANSACTION TO "DB_TIENDAANGELITO" ;
GRANT DELETE ANY MEASURE FOLDER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY CUBE TO "DB_TIENDAANGELITO" ;
GRANT LOCK ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE EVALUATION CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY TYPE TO "DB_TIENDAANGELITO" ;
GRANT ADVISOR TO "DB_TIENDAANGELITO" ;
GRANT CREATE PUBLIC DATABASE LINK TO "DB_TIENDAANGELITO" ;
GRANT ANALYZE ANY TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY RULE TO "DB_TIENDAANGELITO" ;
GRANT INSERT ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ROLLBACK SEGMENT TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY JOB TO "DB_TIENDAANGELITO" ;
GRANT ALTER USER TO "DB_TIENDAANGELITO" ;
GRANT QUERY REWRITE TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY DICTIONARY TO "DB_TIENDAANGELITO" ;
GRANT CREATE PUBLIC SYNONYM TO "DB_TIENDAANGELITO" ;
GRANT GLOBAL QUERY REWRITE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY CLUSTER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY RULE TO "DB_TIENDAANGELITO" ;
GRANT UPDATE ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY SYNONYM TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY SYNONYM TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT CREATE SYNONYM TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY PROGRAM TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY TYPE TO "DB_TIENDAANGELITO" ;
GRANT ON COMMIT REFRESH TO "DB_TIENDAANGELITO" ;
GRANT CREATE SEQUENCE TO "DB_TIENDAANGELITO" ;
GRANT COMMENT ANY MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT ADMINISTER SQL TUNING SET TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY INDEXTYPE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY INDEX TO "DB_TIENDAANGELITO" ;
GRANT RESTRICTED SESSION TO "DB_TIENDAANGELITO" ;
GRANT DEQUEUE ANY QUEUE TO "DB_TIENDAANGELITO" ;
GRANT ANALYZE ANY DICTIONARY TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY INDEXTYPE TO "DB_TIENDAANGELITO" ;
GRANT ADMINISTER ANY SQL TUNING SET TO "DB_TIENDAANGELITO" ;
GRANT CREATE USER TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY OPERATOR TO "DB_TIENDAANGELITO" ;
GRANT CREATE CUBE BUILD PROCESS TO "DB_TIENDAANGELITO" ;
GRANT CREATE PROFILE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY ROLE TO "DB_TIENDAANGELITO" ;
GRANT UPDATE ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY LIBRARY TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY VIEW TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY CLUSTER TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY RULE TO "DB_TIENDAANGELITO" ;
GRANT ALTER TABLESPACE TO "DB_TIENDAANGELITO" ;
GRANT UNDER ANY VIEW TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT GRANT ANY PRIVILEGE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY TRIGGER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY VIEW TO "DB_TIENDAANGELITO" ;
GRANT EXPORT FULL DATABASE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY EVALUATION CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT FLASHBACK ARCHIVE ADMINISTER TO "DB_TIENDAANGELITO" ;
GRANT IMPORT FULL DATABASE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY OUTLINE TO "DB_TIENDAANGELITO" ;
GRANT COMMENT ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE DATABASE LINK TO "DB_TIENDAANGELITO" ;
GRANT DROP PUBLIC SYNONYM TO "DB_TIENDAANGELITO" ;
GRANT DROP USER TO "DB_TIENDAANGELITO" ;
GRANT CHANGE NOTIFICATION TO "DB_TIENDAANGELITO" ;
GRANT CREATE MINING MODEL TO "DB_TIENDAANGELITO" ;
GRANT INSERT ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT DROP PROFILE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY MATERIALIZED VIEW TO "DB_TIENDAANGELITO" ;
GRANT CREATE RULE SET TO "DB_TIENDAANGELITO" ;
GRANT EXEMPT ACCESS POLICY TO "DB_TIENDAANGELITO" ;
GRANT MANAGE SCHEDULER TO "DB_TIENDAANGELITO" ;
GRANT READ ANY FILE GROUP TO "DB_TIENDAANGELITO" ;
GRANT FORCE TRANSACTION TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY CUBE BUILD PROCESS TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY TYPE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT DROP PUBLIC DATABASE LINK TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY INDEXTYPE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY SQL PROFILE TO "DB_TIENDAANGELITO" ;
GRANT ALTER SYSTEM TO "DB_TIENDAANGELITO" ;
GRANT UNLIMITED TABLESPACE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY ROLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY CUBE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY TRIGGER TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY TABLE TO "DB_TIENDAANGELITO" ;
GRANT ADMINISTER SQL MANAGEMENT OBJECT TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY DIRECTORY TO "DB_TIENDAANGELITO" ;
GRANT ENQUEUE ANY QUEUE TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY EVALUATION CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY ASSEMBLY TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY TYPE TO "DB_TIENDAANGELITO" ;
GRANT CREATE CLUSTER TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT EXECUTE ANY EVALUATION CONTEXT TO "DB_TIENDAANGELITO" ;
GRANT RESUMABLE TO "DB_TIENDAANGELITO" ;
GRANT CREATE ANY LIBRARY TO "DB_TIENDAANGELITO" ;
GRANT DROP ANY EDITION TO "DB_TIENDAANGELITO" ;
GRANT CREATE PROCEDURE TO "DB_TIENDAANGELITO" ;
GRANT ALTER DATABASE TO "DB_TIENDAANGELITO" ;
GRANT SELECT ANY CUBE TO "DB_TIENDAANGELITO" ;
GRANT GRANT ANY ROLE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY RULE TO "DB_TIENDAANGELITO" ;
GRANT CREATE CUBE DIMENSION TO "DB_TIENDAANGELITO" ;
GRANT ALTER ANY OPERATOR TO "DB_TIENDAANGELITO" ;
GRANT CREATE CUBE TO "DB_TIENDAANGELITO" ;
GRANT ALTER RESOURCE COST TO "DB_TIENDAANGELITO" ;
GRANT DROP TABLESPACE TO "DB_TIENDAANGELITO" ;
GRANT ALTER ROLLBACK SEGMENT TO "DB_TIENDAANGELITO" ;
