package builder;
import document.AbstractDocument;

public interface Builder {

	void setDoc(AbstractDocument doc);

	AbstractDocument create();
}
