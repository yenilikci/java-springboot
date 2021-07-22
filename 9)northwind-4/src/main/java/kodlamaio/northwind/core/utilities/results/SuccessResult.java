package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result {

	// işlem sonucu başarılı ama mesaj vermek istemiyor
	public SuccessResult() {
		super(true);
	}

	// ekstradan mesaj da döndürebilir
	public SuccessResult(String message) {
		super(true, message);
	}

}
