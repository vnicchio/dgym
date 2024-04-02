package com.vnicchio.dgym.utils;

import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
  
  private LocalDateUtil() {}

  public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

}
