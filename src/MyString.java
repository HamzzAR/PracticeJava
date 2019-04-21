public class MyString {

	public static void main(String[] args) {

		find("Tomtom is Tomtom but okT", "Tom");

	}

	public static void find(String msg, String lookfor) {
		int i, found;
		i = found = 0;
		for (; i < msg.length(); i++) {
			if ((msg.length()-i)>=lookfor.length()) {
				if (msg.substring(i, i + 1).toLowerCase().equals(lookfor.substring(0, 1).toLowerCase())) {
					if (msg.substring(i, i + lookfor.length()).toLowerCase().equals(lookfor.toLowerCase())) {
						found++;
					//	System.out.println("Found one");
						i = i + lookfor.length() - 1;

					}
				}
			}
		}

		System.out.println(found);
	}

}
