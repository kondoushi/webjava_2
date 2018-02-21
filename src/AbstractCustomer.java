public abstract class AbstractCustomer {

	protected abstract Contract makeContract(Contract contract);

	public void sign(Contract contract) {
		makeContract(contract);
	}

}
