/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "task_instance", schema = "cattle")
public interface TaskInstance extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.task_instance.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.task_instance.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.task_instance.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.task_instance.name</code>.
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 128)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.task_instance.task_id</code>.
	 */
	public void setTaskId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.task_instance.task_id</code>.
	 */
	@javax.persistence.Column(name = "task_id", nullable = false, precision = 19)
	public java.lang.Long getTaskId();

	/**
	 * Setter for <code>cattle.task_instance.start_time</code>.
	 */
	public void setStartTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.task_instance.start_time</code>.
	 */
	@javax.persistence.Column(name = "start_time", nullable = false)
	public java.util.Date getStartTime();

	/**
	 * Setter for <code>cattle.task_instance.end_time</code>.
	 */
	public void setEndTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.task_instance.end_time</code>.
	 */
	@javax.persistence.Column(name = "end_time")
	public java.util.Date getEndTime();

	/**
	 * Setter for <code>cattle.task_instance.exception</code>.
	 */
	public void setException(java.lang.String value);

	/**
	 * Getter for <code>cattle.task_instance.exception</code>.
	 */
	@javax.persistence.Column(name = "exception", length = 255)
	public java.lang.String getException();

	/**
	 * Setter for <code>cattle.task_instance.server_id</code>.
	 */
	public void setServerId(java.lang.String value);

	/**
	 * Getter for <code>cattle.task_instance.server_id</code>.
	 */
	@javax.persistence.Column(name = "server_id", nullable = false, length = 128)
	public java.lang.String getServerId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface TaskInstance
	 */
	public void from(io.cattle.platform.core.model.TaskInstance from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface TaskInstance
	 */
	public <E extends io.cattle.platform.core.model.TaskInstance> E into(E into);
}
