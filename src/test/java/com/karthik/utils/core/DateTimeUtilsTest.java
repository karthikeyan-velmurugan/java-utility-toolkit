package com.karthik.utils.core;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

/**
 * -------------------------------------------------------
 * Author  : karthik
 * Created : 7 May 2025
 * Project : java-utility-toolkit
 * Class   : DateTimeUtilsTest
 * -------------------------------------------------------
 */

class DateTimeUtilsTest {

	private final DateTimeUtils dateTimeUtils = new DateTimeUtils();

    @Test
    public void testGetCurrentDateTime() {
        String dateTime = dateTimeUtils.getCurrentDateTime();
        assertNotNull(dateTime);
        assertTrue(dateTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
    }

    @Test
    public void testParseDateTime() {
        LocalDateTime dateTime = dateTimeUtils.parseDateTime("2025-05-07 15:30:00");
        assertNotNull(dateTime);
        assertEquals(2025, dateTime.getYear());
        assertEquals(5, dateTime.getMonthValue());
    }

}
