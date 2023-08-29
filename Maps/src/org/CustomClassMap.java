package org;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code> {
	private String session;
	private String lession;

	public Code(String session, String lession) {
		this.session = session;
		this.lession = lession;
	}

	public String getSession() {
		return session;
	}

	public String getLession() {
		return lession;
	}

	@Override
	public String toString() {
		return "code [session=" + session + ", lession=" + lession + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1 = session.concat(lession);
		String code2 = o.getSession() + o.getLession();
		return code1.compareTo(code2);

	}

	@Override
	public int hashCode() {
		return Objects.hash(lession, session);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lession, other.lession) && Objects.equals(session, other.session);
	}
	
	

}

public class CustomClassMap {

	public static void main(String[] args) {
		Map<Code, String> lectures = new TreeMap<>();

		lectures.put(new Code("S01", "L01"), "Generics");
		lectures.put(new Code("S01", "L02"), "Networking");
		lectures.put(new Code("S01", "L03"), "Files");
		lectures.put(new Code("S02", "L01"), "BufferedImage");
		lectures.put(new Code("S03", "L01"), "Methods");
		lectures.put(new Code("S01", "L01"), "Lamda");

//		for (Map.Entry<Code, String> entry : lectures.entrySet()) {
//			System.out.println(entry);
//		}

//		Code code1 = new Code("S01", "L01");
//		Code code2 = new Code("S01", "L01");
//		
//		System.out.println(code1.hashCode());
//		System.out.println(code2.hashCode());
//		
//		System.out.println(code1.equals(code2));
		Code code = null;
		for(Map.Entry<Code, String> entry: lectures.entrySet()) {
			if(entry.getValue().equals("Networking")) {
				code = entry.getKey();
			} 
			
		}
		System.out.println(code);

	}

}
