package chap10.ex05;

public class Sql {
	public Sql(String table, Column[] columns) {}
	public String create() {return "";}
	public String insert(Object[] fields) {return "";}
	public String selectAll() {return "";}
	public String findByKey(String keyColumn, String keyValue) {return "";}
	public String select(Column column, String pattern) {return "";}
	public String select(Criteria criteria) {return "";}
	private String columnList(Column[] columns) {return "";}
	private String valuesList(Object[] fields, final Column[] columns) {return "";}
	private String selectWithCriteria(String criteria) {return "";}
	private String placeholderList(Column[] columns) {return "";}
}
