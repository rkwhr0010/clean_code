package chap10.ex05;

abstract public class Sql {
	public Sql(String table, Column[] columns) {}
	abstract public String generate();
}

class CreateSql extends Sql {
	public CreateSql(String table, Column[] columns) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
}

class SelectSql extends Sql {
	public SelectSql(String table, Column[] columns) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
}

class InsertSql extends Sql {
	public InsertSql(String table, Column[] columns, Object[] fields) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
	private String valuesList(Object[] fields, final Column[] columns) {return "";}
}

class SelectWithCriteriaSql extends Sql {
	public SelectWithCriteriaSql(String table, Column[] columns, 
			Criteria criteria) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
}

class SelectWithMatchSql extends Sql {
	public SelectWithMatchSql(String table, Column[] columns,
			Column column, String pattern) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
}

class FindByKeySql extends Sql {
	public FindByKeySql(String table, Column[] columns,
			String keyColumn, String keyValue) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
}

class PreparedInsertSql extends Sql {
	public PreparedInsertSql(String table, Column[] columns,
			String keyColumn, String keyValue) {
		super(table, columns);
	}
	@Override public String generate() {return null;}
	private String placeholderList(Column[] columns) {return "";}
}

class Where {
	public Where(String criteria) {	}
	public String generate() {return "";}
}

class ColumnList {
	public ColumnList(Column[] columns) {	}
	public String generate() {return "";}
}