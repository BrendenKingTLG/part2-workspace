package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("Steve Jobs", new Date(120, 2, 15), 25d, 40d);
    }

    @Test
    public void testPay() {
        fail("test not yet imp"); //TODO: 2020-09-21 Imp test of hourlyemp.pay().
    }

    @Test
    public void testPayTaxes() {
//        double expected = 250;
//        double actual = emp.payTaxes();
//        assertEquals(expected, actual, 0.001);
        assertEquals(250, emp.payTaxes(), 0.001);
    }
}