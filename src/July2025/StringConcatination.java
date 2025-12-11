package July2025;

public class StringConcatination {

	public static void main(String[] args) {

		String sauceUser = "SAUCE_USERNAME";
		String sauceKey = "SAUCE_ACCESS_KEY";
		String region = System.getenv().getOrDefault("SAUCE_REGION", "ondemand.us-west-1.saucelabs.com");

		String remoteUrl = String.format("https://%s:%s@%s/wd/hub", sauceUser, sauceKey, region);
		
		System.out.println(remoteUrl);
	}
}
