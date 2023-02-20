package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataEHora {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2022-06-20");
		LocalDateTime d5 = LocalDateTime.parse("2022-06-20T11:20:37");
		Instant d6 = Instant.parse("2022-06-20T11:20:37.1231234Z");
		Instant d7 = Instant.parse("2022-06-20T11:20:37-03:00");
		
//		LocalDate d8 = LocalDate.parse("23/08/2023");
		LocalDate d8 = LocalDate.parse("23/08/2023", fmt1);
		LocalDateTime d9 = LocalDateTime.parse("23/08/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 12, 16);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println(d1.toString());
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		
		System.out.println();
		
		//Convertendo data e hora para texto
		System.out.println(d8.format(fmt1));
		System.out.println(d8.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(fmt1.format(d8));
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d8));
		
		System.out.println();
		
		System.out.println(d9.format(fmt1));
		System.out.println(d9.format(fmt2));
		System.out.println(d9.format(fmt4));
		
		System.out.println();
		
		System.out.println(fmt3.format(d6));
		System.out.println(fmt5.format(d6));
		
		System.out.println();
		
		//Convertendo data e hora local para global
		LocalDate r1 = LocalDate.ofInstant(d7, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d7, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println();
		
		System.out.println("Day of month: " + d1.getDayOfMonth());
		System.out.println("Month: " + d1.getMonth());
		System.out.println("Year: " + d1.getYear());
		
		System.out.println();
		
		//calculos com data e hora
		LocalDate pastWeekLocalDate = d4.minusDays(7);
		LocalDate nextWeekLocalDate = d4.plusDays(7);
		System.out.println("Past week(d4 - 7days): " + pastWeekLocalDate);
		System.out.println("This week(d4): " + d4);
		System.out.println("Next week(d4 + 7days): " + nextWeekLocalDate);
		
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d5.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d5.plusDays(7);
		System.out.println("Past week(d5 - 7days): " + pastWeekLocalDateTime);
		System.out.println("This week(d5): " + d5);
		System.out.println("Next week(d5 + 7days): " + nextWeekLocalDateTime);
		
		System.out.println();
		
		Instant pastWeekInstant = d6.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d6.plus(7, ChronoUnit.DAYS);
		System.out.println("Past week(d6 - 7days): " + pastWeekInstant);
		System.out.println("This week(d6): " + d6);
		System.out.println("Next week(d6 + 7days): " + nextWeekInstant);
		
		System.out.println();
		
//		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d4.atTime(0, 0));
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d4.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d5);		
		Duration t3 = Duration.between(pastWeekInstant, d6);
		Duration t4 = Duration.between(d6, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}
