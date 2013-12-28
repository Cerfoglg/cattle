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
public class NetworkTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord> {

	private static final long serialVersionUID = 1653804915;

	/**
	 * The singleton instance of <code>dstack.network</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.NetworkTable NETWORK = new io.github.ibuildthecloud.dstack.core.model.tables.NetworkTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord.class;
	}

	/**
	 * The column <code>dstack.network.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.network.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.network.uuid</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.network.account_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.network.is_public</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Boolean> IS_PUBLIC = createField("is_public", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>dstack.network.description</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>dstack.network.vnet_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Long> VNET_ID = createField("vnet_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.network.offering_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Long> OFFERING_ID = createField("offering_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.network.state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.network.is_default</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Boolean> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>dstack.network.created</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.network.removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.network.remove_time</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.sql.Timestamp> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.network.kind</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this);

	/**
	 * The column <code>dstack.network.data</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this);

	/**
	 * Create a <code>dstack.network</code> table reference
	 */
	public NetworkTable() {
		super("network", io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.network</code> table reference
	 */
	public NetworkTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.model.tables.NetworkTable.NETWORK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_NETWORK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_NETWORK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_NETWORK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.NetworkRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.FK_NETWORK_ACCOUNT_ID, io.github.ibuildthecloud.dstack.core.model.Keys.NETWORK_IBFK_1, io.github.ibuildthecloud.dstack.core.model.Keys.FK_NETWORK_OFFERING_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.NetworkTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.NetworkTable(alias);
	}
}
