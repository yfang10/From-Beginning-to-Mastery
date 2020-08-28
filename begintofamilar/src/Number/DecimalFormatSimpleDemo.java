package Number;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	
//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
static public void SimpleFormat(String pattern, double value) {
	//ʵ����DecimalFormat����
	DecimalFormat myFormat = new DecimalFormat(pattern);
	String output = myFormat.format(value);			//�����ֽ��и�ʽ��
	System.out.println(value + "" + pattern + "" + output);
}

//ʹ��applyPattern()���������ֽ��и�ʽ��
static public void UseApplyPatternMethodFormat(String pattern, double value) {
	DecimalFormat myFormat = new DecimalFormat();
	myFormat.applyPattern(pattern); 				//����applyPattern()�������ø�ʽ��ģ��
	System.out.println(value + " " + pattern + " " + myFormat.format(value));
}

public static void main(String args[]) {
	SimpleFormat("###, ###, ###", 123456.789);				//���þ�̬SimpleFormat()����
	
	SimpleFormat("00000000.###kg", 123456.789);				//�����ֺ���ϵ�λ
	//���ո�ʽģ���ʽ�����֣� �����ڵ�λ��0��ʾ
	
	SimpleFormat("000000.000", 123.78);
	//���þ�̬UɫApplyPatternMethodFormat()����
	UseApplyPatternMethodFormat("#.###%", 0.789);			//������ת��Ϊ�ٷ�����ʽ
	//��С������ʽ��Ϊ��λ
	UseApplyPatternMethodFormat("###.##", 123456.789);
	//������ת��Ϊǧ������ʽ
	UseApplyPatternMethodFormat("0.00\u2030", 0.789);
}




}
