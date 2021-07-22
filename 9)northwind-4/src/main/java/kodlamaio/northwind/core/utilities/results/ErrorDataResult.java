package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult {
	
	// data , mesaj ve işlem sonucu
	public ErrorDataResult(T data, String message) {
		super(data, false, message);
	}

	// data ve işlem sonucu
	public ErrorDataResult(T data) {
		super(data, false);
	}

	// işlem sonucu ve mesaj
	public ErrorDataResult(String message) {
		super(null, false, message);
	}

	// sadece işlem sonucu
	public ErrorDataResult() {
		super(null, false);
	}

}
