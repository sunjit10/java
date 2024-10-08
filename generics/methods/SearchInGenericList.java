package generics.methods;

import java.util.List;
import java.util.ArrayList;

public class SearchInGenericList {
    
    public static <T> T getElementAtIndex(List<T> list, int index) {
	return list.get(index);
    }
    
    public static void main(String[] args) {
	List<Long> longList = new ArrayList<>();
	longList.add(39393L);
	longList.add(9222L);
	longList.add(292L);
	longList.add(1110L);
	
	Long num = getElementAtIndex(longList, 2);
	System.out.println(num);
	
    }

}
