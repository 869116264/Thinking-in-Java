package object2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//Arrays.asList()��������һ�����������һ���ö��ŷָ���Ԫ���б�������ת��Ϊһ��List����
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1,2,3));
		//ʹ��Arrays.asList(),���Խ�һ��Collection���ϻ������ö��ŷָ��Ķ���ת��ΪCollection����

		Collections.addAll(c,4,5,6);
		//Collections.addAll����Ҳ���Խ���һ�����ϻ����Ƕ��ŷָ��ġ�׷�ӵ������ļ�����(Ҫ�ڸ÷����Ĳ������洫��һ������)
	}
}
