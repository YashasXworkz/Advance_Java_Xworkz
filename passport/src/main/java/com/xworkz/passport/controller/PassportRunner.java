/*
 * package com.xworkz.passport.controller;
 * import java.util.Date;
 * import java.util.List;
 * import java.util.Scanner;
 * import com.xworkz.passport.dto.PassportDTO;
 * import com.xworkz.passport.entity.PassportEntity;
 * import com.xworkz.passport.service.PassportService;
 * import com.xworkz.passport.service.PassportServiceImpl;
 * public class PassportRunner {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * PassportDTO dto = new PassportDTO("Yashas", new Date(), "yashas@gmail.com",
 * 9972902388L, "yashas@12", "yashas@12",
 * "bengaluru", 553723764965L);
 * System.out.println(dto);
 * String text;
 * PassportService service = new PassportServiceImpl();
 * do {
 * System.out.println("""
 * Choose an option:
 * 1. Save passport details
 * 2. Update passport office by existing email
 * 3. Search by ID
 * 4. Get all passport details
 * 5. Get details by email
 * 6. Get details by phone number
 * 7. Get total count of details""");
 * int choice = sc.nextInt();
 * switch (choice) {
 * case 1: {
 * service.validateAndSave(dto);
 * break;
 * }
 * case 2: {
 * System.out.println("Enter existing email to update: ");
 * String mail = sc.next();
 * System.out.println("Enter new passport office: ");
 * String newPassportOffice = sc.next();
 * service.validateAndUpdate(mail, newPassportOffice);
 * break;
 * }
 * case 3: {
 * System.out.println("Enter ID to search: ");
 * service.validateAndSearch(sc.nextInt());
 * break;
 * }
 * case 4: {
 * List<PassportEntity> list = service.getAll();
 * System.out.println(list);
 * break;
 * }
 * case 5: {
 * System.out.println("Enter existing email to search: ");
 * String mail = sc.next();
 * List<PassportEntity> result = service.searchByEmail(mail);
 * System.out.println(result);
 * break;
 * }
 * case 6: {
 * System.out.println("Enter existing phone number to search: ");
 * Long phone = sc.nextLong();
 * PassportEntity result = service.searchByPhone(phone);
 * System.out.println(result);
 * break;
 * }
 * case 7: {
 * Long result = service.getCount();
 * System.out.println(result);
 * break;
 * }
 * default:
 * System.out.println("Invalid choice");
 * }
 * System.out.println("Do you want to continue (y/n): ");
 * text = sc.next();
 * } while (text.equalsIgnoreCase("y"));
 * System.out.println("Existing program...");
 * sc.close();
 * }
 * }
 */
