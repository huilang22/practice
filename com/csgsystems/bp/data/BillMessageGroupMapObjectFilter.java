/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectFilter.java
 * Definition File: Admin/BillMessageGroupMap.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**---------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.data;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class BillMessageGroupMapObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public BillMessageGroupMapObjectKeyFilter Key = null;
  /** raw field for: BILL_MESSAGE_GROUPS.msg_trigger_id) */
  public    IntegerFilter[] MsgTriggerId  = null;
  protected boolean MsgTriggerIdFetch = false;
  protected boolean MsgTriggerIdSortAscending = true;
  protected Integer MsgTriggerIdSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.active_dt) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.inactive_dt) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: BILL_MESSAGE_GROUPS.config_tag_id) */
  public    StringFilter[] ConfigTagId  = null;
  protected boolean ConfigTagIdFetch = false;
  protected boolean ConfigTagIdSortAscending = true;
  protected boolean ConfigTagIdCaseInsensitive = false;
  protected Integer ConfigTagIdSort = null;
  private String _objName = "BillMessageGroupMapObjectFilter";
  /** default constructor */
  public BillMessageGroupMapObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public BillMessageGroupMapObjectFilter (BillMessageGroupMapObjectFilter other)
  {
    if (other == null) return;
    this.Key = new BillMessageGroupMapObjectKeyFilter (other.Key);
    this.MsgTriggerId = other.MsgTriggerId;
    this.MsgTriggerIdFetch = other.MsgTriggerIdFetch;
    this.MsgTriggerIdSort = other.MsgTriggerIdSort;
    this.MsgTriggerIdSortAscending = other.MsgTriggerIdSortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.ConfigTagId = other.ConfigTagId;
    this.ConfigTagIdFetch = other.ConfigTagIdFetch;
    this.ConfigTagIdSort = other.ConfigTagIdSort;
    this.ConfigTagIdCaseInsensitive = other.ConfigTagIdCaseInsensitive;
    this.ConfigTagIdSortAscending = other.ConfigTagIdSortAscending;  }
  /** get the filter for this object's key
   * @return BillMessageGroupMapObjectKeyFilter
   */
  public BillMessageGroupMapObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (BillMessageGroupMapObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgGrpIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgGrpIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgGrpIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgGrpIdFetch;
  }
  /** Set the SortOrder for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgGrpIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgGrpIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgGrpIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgGrpIdSort;
  }
  /** Set the sort direction for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgGrpIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgGrpIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgGrpIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgGrpIdSortAscending;
  }
  /** Set the field level filters for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgGrpIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgGrpId = value;
  }
  /** Retrieve filter for field: MsgGrpId (BILL_MESSAGE_GROUPS.msg_grp_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgGrpIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgGrpId;
  }
  /** Set the field level Fetch value for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMessageIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MessageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMessageIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MessageIdFetch;
  }
  /** Set the SortOrder for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMessageIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MessageIdSort = value;
  }
  /** Retrieve SortOrder for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMessageIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MessageIdSort;
  }
  /** Set the sort direction for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMessageIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MessageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMessageIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MessageIdSortAscending;
  }
  /** Set the field level filters for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMessageIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MessageId = value;
  }
  /** Retrieve filter for field: MessageId (BILL_MESSAGE_GROUPS.message_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMessageIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MessageId;
  }
  /** Set the field level Fetch value for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgSequenceNumFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgSequenceNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgSequenceNumFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgSequenceNumFetch;
  }
  /** Set the SortOrder for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgSequenceNumSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgSequenceNumSort = value;
  }
  /** Retrieve SortOrder for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgSequenceNumSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgSequenceNumSort;
  }
  /** Set the sort direction for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgSequenceNumSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgSequenceNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgSequenceNumSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgSequenceNumSortAscending;
  }
  /** Set the field level filters for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgSequenceNumFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgSequenceNum = value;
  }
  /** Retrieve filter for field: MsgSequenceNum (BILL_MESSAGE_GROUPS.msg_sequence_num)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgSequenceNumFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgSequenceNum;
  }
  /** Set the field level Fetch value for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param fetch whether to fetch this field or not
   */
  public void setGeoKeyFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.GeoKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeoKeyFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.GeoKeyFetch;
  }
  /** Set the SortOrder for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeoKeySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.GeoKeySort = value;
  }
  /** Retrieve SortOrder for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeoKeySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.GeoKeySort;
  }
  /** Set the sort direction for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeoKeySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.GeoKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeoKeySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.GeoKeySortAscending;
  }
  /** Set the case insensitive for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeoKeyCaseInsensitive (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.GeoKeyCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsentive for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return boolean whether the field is case insensitive
   */
  public boolean getGeoKeyCaseInsensitive ()
  {
    if (this.Key == null) return false;
    return this.Key.GeoKeyCaseInsensitive;
  }
  /** Set the field level filters for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeoKeyFilter (StringFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.GeoKey = value;
  }
  /** Retrieve filter for field: GeoKey (BILL_MESSAGE_GROUPS.geo_key)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getGeoKeyFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.GeoKey;
  }
  /** Set the field level Fetch value for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param fetch whether to fetch this field or not
   */
  public void setMktCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MktCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getMktCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeFetch;
  }
  /** Set the SortOrder for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMktCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MktCodeSort = value;
  }
  /** Retrieve SortOrder for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMktCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCodeSort;
  }
  /** Set the sort direction for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMktCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MktCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMktCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MktCodeSortAscending;
  }
  /** Set the field level filters for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMktCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MktCode = value;
  }
  /** Retrieve filter for field: MktCode (BILL_MESSAGE_GROUPS.mkt_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMktCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MktCode;
  }
  /** Set the field level Fetch value for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceCenterIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.ServiceCenterIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceCenterIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterIdFetch;
  }
  /** Set the SortOrder for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceCenterIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.ServiceCenterIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceCenterIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterIdSort;
  }
  /** Set the sort direction for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceCenterIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.ServiceCenterIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceCenterIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ServiceCenterIdSortAscending;
  }
  /** Set the field level filters for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceCenterIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.ServiceCenterId = value;
  }
  /** Retrieve filter for field: ServiceCenterId (BILL_MESSAGE_GROUPS.service_center_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getServiceCenterIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ServiceCenterId;
  }
  /** Set the field level Fetch value for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgForeignKeyFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgForeignKeyFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgForeignKeyFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgForeignKeyFetch;
  }
  /** Set the SortOrder for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgForeignKeySortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgForeignKeySort = value;
  }
  /** Retrieve SortOrder for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgForeignKeySortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgForeignKeySort;
  }
  /** Set the sort direction for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgForeignKeySortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgForeignKeySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgForeignKeySortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.MsgForeignKeySortAscending;
  }
  /** Set the field level filters for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgForeignKeyFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new BillMessageGroupMapObjectKeyFilter ();
    this.Key.MsgForeignKey = value;
  }
  /** Retrieve filter for field: MsgForeignKey (BILL_MESSAGE_GROUPS.msg_foreign_key)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgForeignKeyFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.MsgForeignKey;
  }
  /** Set the field level Fetch value for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMsgTriggerIdFetch (boolean fetch) {
    this.MsgTriggerIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMsgTriggerIdFetch () {
    return this.MsgTriggerIdFetch;
  }
  /** Set the SortOrder for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMsgTriggerIdSortOrder (Integer value) {
    this.MsgTriggerIdSort = value;
  }
  /** Retrieve SortOrder for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMsgTriggerIdSortOrder () {
    return this.MsgTriggerIdSort;
  }
  /** Set the sort direction for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMsgTriggerIdSortDirection (boolean ascending) {
    this.MsgTriggerIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMsgTriggerIdSortDirection () {
    return this.MsgTriggerIdSortAscending;
  }
  /** Set the field level filters for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMsgTriggerIdFilter (IntegerFilter[] value) throws ServiceException {
    this.MsgTriggerId = value;
  }
  /** Retrieve filter for field: MsgTriggerId (BILL_MESSAGE_GROUPS.msg_trigger_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMsgTriggerIdFilter () {
    return this.MsgTriggerId;
  }

  /**
   * Retrieves the MsgTriggerIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MsgTriggerIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgTriggerIdFilter field
   */
  public String[] getMsgTriggerIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgTriggerIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMsgTriggerIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgTriggerIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgTriggerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgTriggerIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MsgTriggerIdFilter filter value from a formatted string
   *
   * @param _value the MsgTriggerIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MsgTriggerIdFilter filter field
   */
  public void setMsgTriggerIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMsgTriggerIdFilterFromFormattedString");
    try {
      this.setMsgTriggerIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MsgTriggerIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgTriggerIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgTriggerIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (BILL_MESSAGE_GROUPS.active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getActiveDateFilter () {
    return this.ActiveDate;
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ActiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDateFilter field
   */
  public String[] getActiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDateFilter filter value from a formatted string
   *
   * @param _value the ActiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActiveDateFilter filter field
   */
  public void setActiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
    try {
      this.setActiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (BILL_MESSAGE_GROUPS.inactive_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getInactiveDateFilter () {
    return this.InactiveDate;
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedString");
  }

  /**
   * Retrieves the InactiveDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDateFilter field
   */
  public String[] getInactiveDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInactiveDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDateFilter filter value from a formatted string
   *
   * @param _value the InactiveDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InactiveDateFilter filter field
   */
  public void setInactiveDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
    try {
      this.setInactiveDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @param fetch whether to fetch this field or not
   */
  public void setConfigTagIdFetch (boolean fetch) {
    this.ConfigTagIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getConfigTagIdFetch () {
    return this.ConfigTagIdFetch;
  }
  /** Set the SortOrder for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setConfigTagIdSortOrder (Integer value) {
    this.ConfigTagIdSort = value;
  }
  /** Retrieve SortOrder for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getConfigTagIdSortOrder () {
    return this.ConfigTagIdSort;
  }
  /** Set the sort direction for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setConfigTagIdSortDirection (boolean ascending) {
    this.ConfigTagIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getConfigTagIdSortDirection () {
    return this.ConfigTagIdSortAscending;
  }
  /** Set the case insensitive for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setConfigTagIdCaseInsensitive (boolean ascending) {
    this.ConfigTagIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getConfigTagIdCaseInsensitive () {
    return this.ConfigTagIdCaseInsensitive;
  }
  /** Set the field level filters for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setConfigTagIdFilter (StringFilter[] value) throws ServiceException {
    this.ConfigTagId = value;
  }
  /** Retrieve filter for field: ConfigTagId (BILL_MESSAGE_GROUPS.config_tag_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getConfigTagIdFilter () {
    return this.ConfigTagId;
  }

  /**
   * Retrieves the ConfigTagIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ConfigTagIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagIdFilter field
   */
  public String[] getConfigTagIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getConfigTagIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ConfigTagIdFilter filter value from a formatted string
   *
   * @param _value the ConfigTagIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ConfigTagIdFilter filter field
   */
  public void setConfigTagIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setConfigTagIdFilterFromFormattedString");
    try {
      this.setConfigTagIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ConfigTagIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFilterFromFormattedString");
  }

  public String toString() {
    return BillMessageGroupMapObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return BillMessageGroupMapObjectHelper.toMap(this, null);
  }
}
