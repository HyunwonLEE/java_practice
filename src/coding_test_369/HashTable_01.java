package coding_test_369;


class MyHash{
	public Slot[] hashTable;
	
	public MyHash(Integer size) {
		this.hashTable = new Slot[size];
	}
	
	public class Slot{
		String value;
		Slot(String value) {
			this.value = value;
		}
	}
	public int hashFunc(String key) {
		return (int)key.charAt(0) % this.hashTable.length;
	}
	
	public boolean saveData(String key, String value) {
		Integer address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			this.hashTable[address].value = value;
		}else {
			this.hashTable[address] = new Slot(value);
		}
		return true;
	}
	
	public String getData(String key) {
		Integer address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			return this.hashTable[address].value;
		}else {
			return null;
		}
	}
}



public class HashTable_01 {

	public static void main(String[] args) {
		MyHash hash = new MyHash(20);
		hash.saveData("DaveLee", "01000000000");
		hash.saveData("Fun-coding", "01000000044");
		System.out.println(hash.getData("Fun-coding"));

	}

}
