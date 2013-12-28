/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "storage_pool_host_map", schema = "dstack")
public class StoragePoolHostMapRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String>, io.github.ibuildthecloud.dstack.core.model.StoragePoolHostMap {

	private static final long serialVersionUID = 1655898522;

	/**
	 * Setter for <code>dstack.storage_pool_host_map.id</code>. 
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool_host_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.storage_pool_host_map.host_id</code>. 
	 */
	@Override
	public void setHostId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool_host_map.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>dstack.storage_pool_host_map.storage_pool_id</code>. 
	 */
	@Override
	public void setStoragePoolId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool_host_map.storage_pool_id</code>. 
	 */
	@javax.persistence.Column(name = "storage_pool_id", nullable = false, precision = 19)
	@Override
	public java.lang.Long getStoragePoolId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>dstack.storage_pool_host_map.state</code>. 
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.storage_pool_host_map.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP.STORAGE_POOL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getHostId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getStoragePoolId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getState();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.github.ibuildthecloud.dstack.core.model.StoragePoolHostMap from) {
		setId(from.getId());
		setHostId(from.getHostId());
		setStoragePoolId(from.getStoragePoolId());
		setState(from.getState());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.github.ibuildthecloud.dstack.core.model.StoragePoolHostMap> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StoragePoolHostMapRecord
	 */
	public StoragePoolHostMapRecord() {
		super(io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP);
	}

	/**
	 * Create a detached, initialised StoragePoolHostMapRecord
	 */
	public StoragePoolHostMapRecord(java.lang.Long id, java.lang.Long hostId, java.lang.Long storagePoolId, java.lang.String state) {
		super(io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP);

		setValue(0, id);
		setValue(1, hostId);
		setValue(2, storagePoolId);
		setValue(3, state);
	}
}
