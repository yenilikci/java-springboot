package kodlamaio.northwind.core.utilities.results;

public class Result {

	// bu işlem başarılı mı bilgisi
	private boolean success;
	// bu işlem ili ilgili mesaj içeriği
	private String message;

	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String message) {
		this(success); // tek parametreli yukarıdaki kurucuyu çağırdım
		this.message = message;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public String getMessage() {
		return this.message;
	}

}
