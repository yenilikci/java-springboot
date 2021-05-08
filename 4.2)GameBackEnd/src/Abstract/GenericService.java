package Abstract;

public interface GenericService<TEntity> {

	void save(TEntity entity) throws Exception;
	void update(TEntity entity);
	void delete(TEntity entity);

}
