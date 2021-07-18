package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	// data , mesaj ve işlem sonucu
	public SuccessDataResult(T data, String message) {
		super(data, true, message);
	}

	// data ve işlem sonucu
	public SuccessDataResult(T data) {
		super(data, true);
	}

	// işlem sonucu ve mesaj
	public SuccessDataResult(String message) {
		super(null, true, message);
	}

	// sadece işlem sonucu
	public SuccessDataResult() {
		super(null, true);
	}

}
