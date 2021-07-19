package coding_test_369;

class LinearProbing {
	public Slot[] hashTable;

	public LinearProbing(Integer size) {
		this.hashTable = new Slot[size];
	}

	public class Slot {
		String key;
		String value;

		Slot(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	public int hashFunc(String key) {
		return (int) (key.charAt(0)) % this.hashTable.length;
	}

	public boolean saveData(String key, String value) {
		Integer address = this.hashFunc(key);
		if (this.hashTable[address] != null) {
			if (this.hashTable[address].key == key) {
				this.hashTable[address].value = value;
				return true;
			} else {
				Integer currAddress = address + 1;
				while (this.hashTable[currAddress] != null) {
					if (this.hashTable[currAddress].key == key) {
						this.hashTable[currAddress].value = value;
						return true;
					} else {
						currAddress++;
						if (currAddress >= this.hashTable.length) {
							return false;
						}
					}
				}
				this.hashTable[currAddress] = new Slot(key, value);
				return true;
			}

		} else {
			this.hashTable[address] = new Slot(key, value);
		}
		return true;
	}

	public String getData(String key) {
		Integer address = this.hashFunc(key);
		if (this.hashTable[address] != null) {
			if (this.hashTable[address].key == key) {
				return this.hashTable[address].value;
			} else {
				Integer currAddress = address;
				while (this.hashTable[currAddress] != null) {
					if (this.hashTable[currAddress] != null) {
						return this.hashTable[currAddress].key = key;
					} else {
						currAddress++;
						if (currAddress >= this.hashTable.length) {
							return null;
						}
					}
				}
				return null;

			}
		} else {
			return null;
		}
	}
}

class Chaining {
	public Slot[] hashTable;

	public Chaining(Integer size) {
		this.hashTable = new Slot[size];
	}

	public class Slot {
		String key;
		String value;
		Slot next;

		Slot(String key, String value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	public int HashFunc(String key) {
		return (int)(key.charAt(0)) & this.hashTable.length;
	}
	
	public boolean saveData(String key, String value) {
        Integer address = this.HashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }
    
    public String getData(String key) {
        Integer address = this.HashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
public class HashTable_02 {

	public static void main(String[] args) {
		
		
		Chaining c = new Chaining(20);
		c.saveData("DaveLee", "01022223333");
		c.saveData("fun-coding", "01033334444");
		c.saveData("David", "01044445555");
		c.saveData("Dave", "01055556666");
		System.out.println(c.getData("Dave"));

		LinearProbing LP = new LinearProbing(20);
		LP.saveData("DaveLee", "01022223333");
		LP.saveData("fun-coding", "01033334444");
		LP.saveData("David", "01044445555");
		LP.saveData("Dave", "01055556666");
		System.out.println(LP.getData("fun-coding"));

	}

}
