INSERT INTO moeiwast_eiwatest_DB01.test_table
 VALUES (200,'真上　公貴',200.001,'2087-12-31');

UPDATE moeiwast_eiwatest_DB01.test_table
 SET NAME_STR = '真上　公貴' WHERE INT_NUM = 200;

SELECT * FROM moeiwast_eiwatest_DB01.test_table
 ORDER BY CREATE_DATE desc;