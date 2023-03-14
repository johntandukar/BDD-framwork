package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	public static String data(String input) {
		Faker faker = new Faker();
		String output = "";
		if (input.equals("firstName")) {
			output = faker.name().firstName();

		} else if (input.equals("lastName")) {
			output = faker.name().lastName();
		} else if (input.equals("email")) {
			output = faker.name().firstName() + "." + faker.name().lastName() + "@tekschool.us";
		} else if (input.equals("phoneNumber")) {
			output = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) {
			output = faker.name().fullName();
		} else if (input.equals("address")) {
			output = faker.address().streetName();
		} else if (input.equals("city")) {
			output = faker.address().city();
		} else if (input.equals("state")) {
			output = faker.address().state();
		} else if (input.equals("zipCode")) {
			output = faker.address().zipCode();

		} else if (input.equals("United States")) {
			output = faker.address().country();
		}else if (input.equals("apt")) {
			output = faker.address().secondaryAddress();
		}else
			output = faker.expression("");
		return output;
	}

}
