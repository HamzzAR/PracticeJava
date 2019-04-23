public class MyString {

	public static void main(String[] args) {

		// find("Tomtom is Tomtom but okT", "Tom");
		findAndReplace("shafeeq is here shafeeqsha", "shafeeq", "*");

	}

	public static void findAndReplace(String msg, String lookfor, String replace) {
		int i;
		i = 0;
		String newmsg = "";
		for (; i < msg.length(); i++) {
			if (msg.substring(i, i + 1).toLowerCase().equals(lookfor.substring(0, 1).toLowerCase())) {
				if ((msg.length() - i) >= lookfor.length()) {
					if (msg.substring(i, i + lookfor.length()).toLowerCase().equals(lookfor.toLowerCase())) {
						newmsg = newmsg + replace;
						i = i + lookfor.length() - 1;

					} else {
						newmsg = newmsg + msg.substring(i, i + 1);
					}
				}else{
					newmsg = newmsg + msg.substring(i, i + 1);
				}
			} else {
				newmsg = newmsg + msg.substring(i, i + 1);
			}

		}

		System.out.println(newmsg);
	}

	public static void find(String msg, String lookfor) {
		int i, found;
		i = found = 0;
		for (; i < msg.length(); i++) {
			if ((msg.length() - i) >= lookfor.length()) {
				if (msg.substring(i, i + 1).toLowerCase()
						.equals(lookfor.substring(0, 1).toLowerCase())) {
					if (msg.substring(i, i + lookfor.length()).toLowerCase()
							.equals(lookfor.toLowerCase())) {
						found++;
						// System.out.println("Found one");
						i = i + lookfor.length() - 1;

					}
				}
			}
		}

		System.out.println(found);
	}

}
