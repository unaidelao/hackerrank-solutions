/*
Weather Observation Station 3.

== Task ==
Query a list of CITY names from STATION with even ID numbers only. You may print the results in any
order, but must exclude duplicates from your answer.
*/

-- MS SQL SERVER, MySQL
SELECT SELECT DISTINCT CITY FROM STATION WHERE ID % 2 = 0;

-- ORACLE
SELECT DISTINCT CITY FROM STATION WHERE WHERE MOD(ID, 2) = 0;