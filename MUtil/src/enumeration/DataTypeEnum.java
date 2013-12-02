package enumeration;

public enum DataTypeEnum {
	FLOAT(4);

	private int size;// size of byte

	DataTypeEnum(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
