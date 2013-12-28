/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord> {

	private static final long serialVersionUID = -1942569362;

	/**
	 * The singleton instance of <code>dstack.data</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.DataTable DATA = new io.github.ibuildthecloud.dstack.core.model.tables.DataTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord.class;
	}

	/**
	 * The column <code>dstack.data.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.data.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.data.value</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this);

	/**
	 * Create a <code>dstack.data</code> table reference
	 */
	public DataTable() {
		super("data", io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.data</code> table reference
	 */
	public DataTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.model.tables.DataTable.DATA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_DATA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.DataRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_DATA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.DataTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.DataTable(alias);
	}
}
