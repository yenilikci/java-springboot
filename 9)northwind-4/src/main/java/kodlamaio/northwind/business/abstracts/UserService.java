package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {

    // User Ekleme
    Result add(User user);

    // Email'e göre kullanıcı bul
    DataResult<User> findByEmail(String email);

}
