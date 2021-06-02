package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {

	// işlem sonucu başarısız ama mesaj vermek istemiyor
	public ErrorResult() {
		super(false);
	}

	// ekstradan mesaj da döndürebilir
	public ErrorResult(String message) {
		super(false, message);
	}

}
