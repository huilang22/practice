/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectKeyData.java
 * Definition File: Customer/AbiBillingStatistics.xml
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** AbiBillingStatisticsObject's Key Data class. */
public class AbiBillingStatisticsObjectKeyData  extends BaseObjectData
{
  /** ABI_BILLING_STATISTICS.statistic_id field */
  public    BigInteger StatisticId  = null;
  protected boolean _StatisticIdSet = false;
  private String _objName = "AbiBillingStatisticsObjectKeyData";
  /** default constructor */
  public AbiBillingStatisticsObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AbiBillingStatisticsObjectKeyData (AbiBillingStatisticsObjectKeyData other)
  {
    if (other == null) return;
    this.StatisticId = other.StatisticId;
    this._StatisticIdSet = other._StatisticIdSet;
  }
  /** set the fields value: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatisticId") 
  public void setStatisticId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatisticId", "setStatisticId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StatisticId", "setStatisticId");
    }
    this.StatisticId = value;
    this._StatisticIdSet = true;
  }

  /** Retrieves the StatisticId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatisticId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatisticId field
   */
   public String getStatisticIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatisticIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStatisticId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatisticIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatisticId field from a formatted string
   *
   * @param _value the StatisticId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatisticId field
   */
   public void setStatisticIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatisticIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatisticId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatisticId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatisticIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatisticIdFromFormattedString");
   }

  /** get the value of the field: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return BigInteger the value
   */
  public BigInteger getStatisticId () {
    return this.StatisticId;
  }
  /** Change the field to not being actively set: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   */
  public void unsetStatisticId () {
    this._StatisticIdSet = false;
  }
  /** See if the field is actively set: StatisticId (ABI_BILLING_STATISTICS.statistic_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatisticId () {
    return this._StatisticIdSet;
  }
  public String toString() {
    return AbiBillingStatisticsObjectKeyHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ObjectHelper.objectToMap(this);
  }
  public void loadDefaults(String action) {
    if (action != null) DefaultManager.getInstance().setObjectDefaults(this, action);
  }
  public void checkConstraints(String action) throws ConstraintException {
    if (action != null) ConstraintManager.getInstance().checkConstraints(this, action);
  }
  /*
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** ABI_BILLING_STATISTICS.statistic_id field */
    if(!nonNullOnly || (StatisticId != null))  _StatisticIdSet = flag;
  }
}
