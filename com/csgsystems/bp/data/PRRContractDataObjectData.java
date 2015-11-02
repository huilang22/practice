/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRContractDataObjectData.java
 * Definition File: Customer/ProductRcRate.xml
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
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** PRRContractDataObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class PRRContractDataObjectData extends BaseObjectData implements Serializable
{

  /** CUSTOMER_CONTRACT_VIEW.tracking_id field */
  public    Integer TrackingId  = null;
  protected boolean _TrackingIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.tracking_id_serv field */
  public    Integer TrackingIdServ  = null;
  protected boolean _TrackingIdServSet = false;
  /** CUSTOMER_CONTRACT_VIEW.view_status field */
  public    Integer ViewStatus  = null;
  protected boolean _ViewStatusSet = false;
  /** CUSTOMER_CONTRACT_VIEW.parent_subscr_no field */
  public    Integer ParentServiceInternalId  = null;
  protected boolean _ParentServiceInternalIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets field */
  public    Integer ParentServiceInternalIdResets  = null;
  protected boolean _ParentServiceInternalIdResetsSet = false;
  /** CUSTOMER_CONTRACT_VIEW.parent_account_no field */
  public    Integer ParentAccountInternalId  = null;
  protected boolean _ParentAccountInternalIdSet = false;
  /** CUSTOMER_CONTRACT_VIEW.commitment_reference field */
  public    Integer CommitmentReference  = null;
  protected boolean _CommitmentReferenceSet = false;
  /** CONTRACT_TYPES.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** CUSTOMER_CONTRACT_VIEW.start_dt field */
  public    Date StartDt  = null;
  protected boolean _StartDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.end_dt field */
  public    Date EndDt  = null;
  protected boolean _EndDtSet = false;
  /** CUSTOMER_CONTRACT_VIEW.contract_level field */
  public    Integer ContractLevel  = null;
  protected boolean _ContractLevelSet = false;
  /** CUSTOMER_CONTRACT_VIEW.contract_type field */
  public    Integer ContractType  = null;
  protected boolean _ContractTypeSet = false;
  /** CONTRACT_TYPES.termination_type_id_nrc field */
  public    Integer TerminationTypeIdNrc  = null;
  protected boolean _TerminationTypeIdNrcSet = false;
  /** CONTRACT_TYPES.commitment_type_id_nrc field */
  public    Integer CommitmentTypeIdNrc  = null;
  protected boolean _CommitmentTypeIdNrcSet = false;
  /** CONTRACT_TYPES.contract_category field */
  public    Integer ContractCategory  = null;
  protected boolean _ContractCategorySet = false;
  private String _objName = "PRRContractDataObjectData";
  /** Default constructor */
  public PRRContractDataObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public PRRContractDataObjectData (PRRContractDataObjectData other)
  {

    if (other == null) return;
    this.TrackingId = other.TrackingId;
    this._TrackingIdSet = other._TrackingIdSet;
    this.TrackingIdServ = other.TrackingIdServ;
    this._TrackingIdServSet = other._TrackingIdServSet;
    this.ViewStatus = other.ViewStatus;
    this._ViewStatusSet = other._ViewStatusSet;
    this.ParentServiceInternalId = other.ParentServiceInternalId;
    this._ParentServiceInternalIdSet = other._ParentServiceInternalIdSet;
    this.ParentServiceInternalIdResets = other.ParentServiceInternalIdResets;
    this._ParentServiceInternalIdResetsSet = other._ParentServiceInternalIdResetsSet;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this._ParentAccountInternalIdSet = other._ParentAccountInternalIdSet;
    this.CommitmentReference = other.CommitmentReference;
    this._CommitmentReferenceSet = other._CommitmentReferenceSet;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.StartDt = other.StartDt;
    this._StartDtSet = other._StartDtSet;
    this.EndDt = other.EndDt;
    this._EndDtSet = other._EndDtSet;
    this.ContractLevel = other.ContractLevel;
    this._ContractLevelSet = other._ContractLevelSet;
    this.ContractType = other.ContractType;
    this._ContractTypeSet = other._ContractTypeSet;
    this.TerminationTypeIdNrc = other.TerminationTypeIdNrc;
    this._TerminationTypeIdNrcSet = other._TerminationTypeIdNrcSet;
    this.CommitmentTypeIdNrc = other.CommitmentTypeIdNrc;
    this._CommitmentTypeIdNrcSet = other._CommitmentTypeIdNrcSet;
    this.ContractCategory = other.ContractCategory;
    this._ContractCategorySet = other._ContractCategorySet;
  }

  /** set the fields value: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingId") 
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    this.TrackingId = value;
    this._TrackingIdSet = true;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** get the value of the field: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    return this.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   */
  public void unsetTrackingId () {
    this._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (CUSTOMER_CONTRACT_VIEW.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    return this._TrackingIdSet;
  }
  /** set the fields value: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TrackingIdServ") 
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    this.TrackingIdServ = value;
    this._TrackingIdServSet = true;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** get the value of the field: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    return this.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    this._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (CUSTOMER_CONTRACT_VIEW.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    return this._TrackingIdServSet;
  }
  /** set the fields value: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewStatus") 
  public void setViewStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewStatus", "setViewStatus");
    }
    this.ViewStatus = value;
    this._ViewStatusSet = true;
  }

  /** Retrieves the ViewStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewStatus field
   */
   public String getViewStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getViewStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewStatus field from a formatted string
   *
   * @param _value the ViewStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewStatus field
   */
   public void setViewStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ViewStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ViewStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatus field
   */

  public String getViewStatusDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getViewStatusEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getViewStatus()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ViewStatus field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ViewStatus field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatus field
   */
  public Enumeration getViewStatusEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ViewStatus", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ViewStatus field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setViewStatusFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getViewStatusEnumeration(_locale);
      this.setViewStatus((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatus");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFromDisplayValue");
  }

  /** get the value of the field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return Integer the value
   */
  public Integer getViewStatus () {
    return this.ViewStatus;
  }
  /** Change the field to not being actively set: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   */
  public void unsetViewStatus () {
    this._ViewStatusSet = false;
  }
  /** See if the field is actively set: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewStatus () {
    return this._ViewStatusSet;
  }
  /** set the fields value: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentServiceInternalId") 
  public void setParentServiceInternalId (Integer value) throws ServiceException
  {
    this.ParentServiceInternalId = value;
    this._ParentServiceInternalIdSet = true;
  }

  /** Retrieves the ParentServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentServiceInternalId field
   */
   public String getParentServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentServiceInternalId field from a formatted string
   *
   * @param _value the ParentServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentServiceInternalId field
   */
   public void setParentServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return Integer the value
   */
  public Integer getParentServiceInternalId () {
    return this.ParentServiceInternalId;
  }
  /** Change the field to not being actively set: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   */
  public void unsetParentServiceInternalId () {
    this._ParentServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ParentServiceInternalId (CUSTOMER_CONTRACT_VIEW.parent_subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentServiceInternalId () {
    return this._ParentServiceInternalIdSet;
  }
  /** set the fields value: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentServiceInternalIdResets") 
  public void setParentServiceInternalIdResets (Integer value) throws ServiceException
  {
    this.ParentServiceInternalIdResets = value;
    this._ParentServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ParentServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentServiceInternalIdResets field
   */
   public String getParentServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getParentServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentServiceInternalIdResets field from a formatted string
   *
   * @param _value the ParentServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentServiceInternalIdResets field
   */
   public void setParentServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return Integer the value
   */
  public Integer getParentServiceInternalIdResets () {
    return this.ParentServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   */
  public void unsetParentServiceInternalIdResets () {
    this._ParentServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ParentServiceInternalIdResets (CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentServiceInternalIdResets () {
    return this._ParentServiceInternalIdResetsSet;
  }
  /** set the fields value: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountInternalId") 
  public void setParentAccountInternalId (Integer value) throws ServiceException
  {
    this.ParentAccountInternalId = value;
    this._ParentAccountInternalIdSet = true;
  }

  /** Retrieves the ParentAccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ParentAccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentAccountInternalId field
   */
   public String getParentAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getParentAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ParentAccountInternalId field from a formatted string
   *
   * @param _value the ParentAccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ParentAccountInternalId field
   */
   public void setParentAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setParentAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ParentAccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @return Integer the value
   */
  public Integer getParentAccountInternalId () {
    return this.ParentAccountInternalId;
  }
  /** Change the field to not being actively set: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   */
  public void unsetParentAccountInternalId () {
    this._ParentAccountInternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountInternalId (CUSTOMER_CONTRACT_VIEW.parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountInternalId () {
    return this._ParentAccountInternalIdSet;
  }
  /** set the fields value: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentReference") 
  public void setCommitmentReference (Integer value) throws ServiceException
  {
    this.CommitmentReference = value;
    this._CommitmentReferenceSet = true;
  }

  /** Retrieves the CommitmentReference field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentReference field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentReference field
   */
   public String getCommitmentReferenceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceAsFormattedString");
       return fmtMgr.formatNumber(this.getCommitmentReference(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentReference");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentReference field from a formatted string
   *
   * @param _value the CommitmentReference field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentReference field
   */
   public void setCommitmentReferenceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentReference(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentReference");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CommitmentReference field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentReference field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReference field
   */

  public String getCommitmentReferenceDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentReferenceEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCommitmentReference()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CommitmentReference field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CommitmentReference field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReference field
   */
  public Enumeration getCommitmentReferenceEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProductType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CommitmentReference field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCommitmentReferenceFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCommitmentReferenceEnumeration(_locale);
      this.setCommitmentReference((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReference");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFromDisplayValue");
  }

  /** get the value of the field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return Integer the value
   */
  public Integer getCommitmentReference () {
    return this.CommitmentReference;
  }
  /** Change the field to not being actively set: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   */
  public void unsetCommitmentReference () {
    this._CommitmentReferenceSet = false;
  }
  /** See if the field is actively set: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentReference () {
    return this._CommitmentReferenceSet;
  }
  /** set the fields value: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionCode") 
  public void setDescriptionCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionCode", "setDescriptionCode");
    }
    this.DescriptionCode = value;
    this._DescriptionCodeSet = true;
  }

  /** Retrieves the DescriptionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCode field
   */
   public String getDescriptionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionCode field from a formatted string
   *
   * @param _value the DescriptionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionCode field
   */
   public void setDescriptionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFromFormattedString");
   }

  /** get the value of the field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (CONTRACT_TYPES.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
  }
  /** set the fields value: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StartDt") 
  public void setStartDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StartDt", "setStartDt");
    }
    this.StartDt = value;
    this._StartDtSet = true;
  }

  /** Retrieves the StartDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StartDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
   public String getStartDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedString");
       return fmtMgr.formatDate(this.getStartDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the StartDt field from a formatted string
   *
   * @param _value the StartDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
   public void setStartDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStartDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StartDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFromFormattedString");
   }

  /**
   * Retrieves the StartDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDt field
   */
  public String getStartDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStartDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDt field value from a formatted date/time string
   *
   * @param _value the StartDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StartDt field
   */
  public void setStartDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStartDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return Date the value
   */
  public Date getStartDt () {
    return this.StartDt;
  }
  /** Change the field to not being actively set: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   */
  public void unsetStartDt () {
    this._StartDtSet = false;
  }
  /** See if the field is actively set: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetStartDt () {
    return this._StartDtSet;
  }
  /** set the fields value: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EndDt") 
  public void setEndDt (Date value) throws ServiceException
  {
    this.EndDt = value;
    this._EndDtSet = true;
  }

  /** Retrieves the EndDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EndDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
   public String getEndDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedString");
       return fmtMgr.formatDate(this.getEndDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the EndDt field from a formatted string
   *
   * @param _value the EndDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
   public void setEndDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEndDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EndDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFromFormattedString");
   }

  /**
   * Retrieves the EndDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDt field
   */
  public String getEndDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getEndDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDt field value from a formatted date/time string
   *
   * @param _value the EndDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EndDt field
   */
  public void setEndDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setEndDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return Date the value
   */
  public Date getEndDt () {
    return this.EndDt;
  }
  /** Change the field to not being actively set: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   */
  public void unsetEndDt () {
    this._EndDtSet = false;
  }
  /** See if the field is actively set: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetEndDt () {
    return this._EndDtSet;
  }
  /** set the fields value: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractLevel") 
  public void setContractLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractLevel", "setContractLevel");
    }
    this.ContractLevel = value;
    this._ContractLevelSet = true;
  }

  /** Retrieves the ContractLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractLevel field
   */
   public String getContractLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getContractLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractLevel field from a formatted string
   *
   * @param _value the ContractLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractLevel field
   */
   public void setContractLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractLevelFromFormattedString");
   }

  /** get the value of the field: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return Integer the value
   */
  public Integer getContractLevel () {
    return this.ContractLevel;
  }
  /** Change the field to not being actively set: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   */
  public void unsetContractLevel () {
    this._ContractLevelSet = false;
  }
  /** See if the field is actively set: ContractLevel (CUSTOMER_CONTRACT_VIEW.contract_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractLevel () {
    return this._ContractLevelSet;
  }
  /** set the fields value: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractType") 
  public void setContractType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractType", "setContractType");
    }
    this.ContractType = value;
    this._ContractTypeSet = true;
  }

  /** Retrieves the ContractType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractType field
   */
   public String getContractTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getContractType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractType field from a formatted string
   *
   * @param _value the ContractType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractType field
   */
   public void setContractTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ContractType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ContractType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractType field
   */

  public String getContractTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getContractTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getContractType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ContractType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ContractType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractType field
   */
  public Enumeration getContractTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ContractType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ContractType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setContractTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getContractTypeEnumeration(_locale);
      this.setContractType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFromDisplayValue");
  }

  /** get the value of the field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return Integer the value
   */
  public Integer getContractType () {
    return this.ContractType;
  }
  /** Change the field to not being actively set: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   */
  public void unsetContractType () {
    this._ContractTypeSet = false;
  }
  /** See if the field is actively set: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractType () {
    return this._ContractTypeSet;
  }
  /** set the fields value: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TerminationTypeIdNrc") 
  public void setTerminationTypeIdNrc (Integer value) throws ServiceException
  {
    this.TerminationTypeIdNrc = value;
    this._TerminationTypeIdNrcSet = true;
  }

  /** Retrieves the TerminationTypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TerminationTypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationTypeIdNrc field
   */
   public String getTerminationTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getTerminationTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the TerminationTypeIdNrc field from a formatted string
   *
   * @param _value the TerminationTypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TerminationTypeIdNrc field
   */
   public void setTerminationTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTerminationTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TerminationTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return Integer the value
   */
  public Integer getTerminationTypeIdNrc () {
    return this.TerminationTypeIdNrc;
  }
  /** Change the field to not being actively set: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   */
  public void unsetTerminationTypeIdNrc () {
    this._TerminationTypeIdNrcSet = false;
  }
  /** See if the field is actively set: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetTerminationTypeIdNrc () {
    return this._TerminationTypeIdNrcSet;
  }
  /** set the fields value: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CommitmentTypeIdNrc") 
  public void setCommitmentTypeIdNrc (Integer value) throws ServiceException
  {
    this.CommitmentTypeIdNrc = value;
    this._CommitmentTypeIdNrcSet = true;
  }

  /** Retrieves the CommitmentTypeIdNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CommitmentTypeIdNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentTypeIdNrc field
   */
   public String getCommitmentTypeIdNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
       return fmtMgr.formatNumber(this.getCommitmentTypeIdNrc(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentTypeIdNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the CommitmentTypeIdNrc field from a formatted string
   *
   * @param _value the CommitmentTypeIdNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CommitmentTypeIdNrc field
   */
   public void setCommitmentTypeIdNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCommitmentTypeIdNrc(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CommitmentTypeIdNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentTypeIdNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentTypeIdNrcFromFormattedString");
   }

  /** get the value of the field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return Integer the value
   */
  public Integer getCommitmentTypeIdNrc () {
    return this.CommitmentTypeIdNrc;
  }
  /** Change the field to not being actively set: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   */
  public void unsetCommitmentTypeIdNrc () {
    this._CommitmentTypeIdNrcSet = false;
  }
  /** See if the field is actively set: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetCommitmentTypeIdNrc () {
    return this._CommitmentTypeIdNrcSet;
  }
  /** set the fields value: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ContractCategory") 
  public void setContractCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ContractCategory", "setContractCategory");
    }
    this.ContractCategory = value;
    this._ContractCategorySet = true;
  }

  /** Retrieves the ContractCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ContractCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractCategory field
   */
   public String getContractCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getContractCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the ContractCategory field from a formatted string
   *
   * @param _value the ContractCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ContractCategory field
   */
   public void setContractCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setContractCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ContractCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractCategoryFromFormattedString");
   }

  /** get the value of the field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return Integer the value
   */
  public Integer getContractCategory () {
    return this.ContractCategory;
  }
  /** Change the field to not being actively set: ContractCategory (CONTRACT_TYPES.contract_category)
   */
  public void unsetContractCategory () {
    this._ContractCategorySet = false;
  }
  /** See if the field is actively set: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetContractCategory () {
    return this._ContractCategorySet;
  }
  public String toString() {
    return PRRContractDataObjectHelper.toMap(this, null).toString();
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
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** CUSTOMER_CONTRACT_VIEW.tracking_id field */
    if(!nonNullOnly || (TrackingId != null))  _TrackingIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.tracking_id_serv field */
    if(!nonNullOnly || (TrackingIdServ != null))  _TrackingIdServSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.view_status field */
    if(!nonNullOnly || (ViewStatus != null))  _ViewStatusSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.parent_subscr_no field */
    if(!nonNullOnly || (ParentServiceInternalId != null))  _ParentServiceInternalIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.parent_subscr_no_resets field */
    if(!nonNullOnly || (ParentServiceInternalIdResets != null))  _ParentServiceInternalIdResetsSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.parent_account_no field */
    if(!nonNullOnly || (ParentAccountInternalId != null))  _ParentAccountInternalIdSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.commitment_reference field */
    if(!nonNullOnly || (CommitmentReference != null))  _CommitmentReferenceSet = flag;
  /** CONTRACT_TYPES.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.start_dt field */
    if(!nonNullOnly || (StartDt != null))  _StartDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.end_dt field */
    if(!nonNullOnly || (EndDt != null))  _EndDtSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.contract_level field */
    if(!nonNullOnly || (ContractLevel != null))  _ContractLevelSet = flag;
  /** CUSTOMER_CONTRACT_VIEW.contract_type field */
    if(!nonNullOnly || (ContractType != null))  _ContractTypeSet = flag;
  /** CONTRACT_TYPES.termination_type_id_nrc field */
    if(!nonNullOnly || (TerminationTypeIdNrc != null))  _TerminationTypeIdNrcSet = flag;
  /** CONTRACT_TYPES.commitment_type_id_nrc field */
    if(!nonNullOnly || (CommitmentTypeIdNrc != null))  _CommitmentTypeIdNrcSet = flag;
  /** CONTRACT_TYPES.contract_category field */
    if(!nonNullOnly || (ContractCategory != null))  _ContractCategorySet = flag;
  }
}
