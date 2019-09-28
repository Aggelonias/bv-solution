package solution;

public class Test {

	public static void main(String[] args) {
		
		// Usage example
		
		PositionManager pm = new PositionManager();
		
		Unit dioikisi = new Unit(pm, "���������� ���������");
		
		Unit dAnaptixis = new Unit(pm, "��������� ���������", dioikisi);
		
		Unit dOikonomikwn = new Unit(pm, "��������� �����������", dioikisi);
		
		Unit tdap = new Unit(pm, "����� ��������� ���������� �����", dAnaptixis);
		
		pm.addNewTypeOfPosition("CEO", "� ���������� ��� ���������.");
		pm.addNewTypeOfPosition("����������", "�� ���������.");
		pm.addNewTypeOfPosition("������������", "�� ����� ���� ������ ������������.");
		pm.addNewTypeOfPosition("���������", "�� �������.");
		
		dioikisi.addPositions("CEO", 1);
		dAnaptixis.addPositions("����������", 1);
		dOikonomikwn.addPositions("����������", 1);
		tdap.addPositions("������������", 1);
		tdap.addPositions("���������", 8);
	}

}
