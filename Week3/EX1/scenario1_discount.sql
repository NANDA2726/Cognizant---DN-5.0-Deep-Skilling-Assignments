DECLARE
BEGIN
    FOR c IN (
        SELECT c.CustomerID, l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE MONTHS_BETWEEN(SYSDATE, c.DOB)/12 > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = c.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Discount applied to Customer ID: ' || c.CustomerID
        );
    END LOOP;

    COMMIT;
END;
/