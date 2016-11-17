/**
 * 
 */
package src.com.mycompany.expgenerics.generics.staticmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



/**
 * @author ken
 *
 */
public class MyCollectionUtility {
	public static<T> T add2collection(T _e, Collection<T> _collection) {
		_collection.add(_e);
		return _e;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		String s1 = "Hi!";
		String s2 = new String("kifano");
		List<String> lists = new ArrayList<String>();
		lists.add(s1);
		lists.add(s2);

		String s3 = new String("thomas");
		String returnedStr = MyCollectionUtility.add2collection(s3, lists);
		System.out.println("returnedStr:" + returnedStr);
	}

}
