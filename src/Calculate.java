//In the name of Allah
public class Calculate {

	private Integer eNum;
	private Integer eNum2;

	// private Integer eNum3;// Not necessary!!!!

	public Calculate() {
	}

	public Integer geteNum() {
		return eNum;
	}

	public void seteNum(Integer eNum) {
		this.eNum = eNum;
	}

	public Integer geteNum2() {
		return eNum2;
	}

	public void seteNum2(Integer eNum2) {
		this.eNum2 = eNum2;
	}

	public Integer sumation() {
		return eNum + eNum2;
	}

	public Integer subtraction() {
		return eNum - eNum2;
	}

	public Integer multiplication() {
		return eNum * eNum2;
	}

	public Integer division() {
		Integer eNum3 = 0;
		if (eNum2 == 0) {
			System.out.println("Division is infinity");
			eNum3 = 0.0;
		} else {
			eNum3 = eNum / eNum2;
		}
		return eNum3;
	}

	public Integer remaining() {
		return eNum % eNum2;
	}

	public Integer area() {

		Integer eNum3 = 2 * (eNum + eNum2);
		if (eNum <= 0 || eNum2 <= 0) {
			System.out.println("area Unknwon");
		}
		return eNum3;
	}

	public Integer power() {
		Integer eNum3 = 0;
		if (eNum2 == 0) {
			eNum3 = 1;
		} else if (eNum2 > 0) {
			eNum3 = 1;
			while (eNum2 != 0) {
				eNum3 = eNum3 * eNum;
				eNum2--;
			}
		} else if (eNum2 < 0) {
			eNum3 = 1;
			while (eNum2 != 0) {
				if (eNum == 0) {
					System.out.println("Power is infinity.");
					eNum3 = 0.0;
					break;
				}

				eNum3 = eNum3 * (1 / eNum);
				eNum2++;
			}
		}

		return eNum3;

	}
}
