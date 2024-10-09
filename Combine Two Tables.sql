SQL
//https://leetcode.com/problems/combine-two-tables/submissions/1411646390/

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;


