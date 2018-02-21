public abstract class AbstractDocument {
	protected String docName = "";

	protected int docNum = 0;

	public String getDocName() {
		return this.docName;
	}

	public int getDocNum() {
		return this.docNum;
	}

	public void setDocNum(int num) {
		this.docNum = num;
	}

}
