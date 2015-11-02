/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageServiceObjectData.java
 * Definition File: Customer/UnbilledUsage.xml
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

import com.csgsystems.bp.data.*;

import com.csgsystems.api.base.BaseObjectData;
  
/** UnbilledUsageServiceObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class UnbilledUsageServiceObjectData extends UnbilledUsageObjectData  implements Serializable
{

  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String ServiceParentAccountExternalId  = null;
  protected boolean _ServiceParentAccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer ServiceParentAccountExternalIdType  = null;
  protected boolean _ServiceParentAccountExternalIdTypeSet = false;
  /** SERVICE.b_rev_rcv_cost_ctr field */
  public    Integer BRevRcvCostCtr  = null;
  protected boolean _BRevRcvCostCtrSet = false;
  /** SERVICE.b_service_fname field */
  public    String BServiceFname  = null;
  protected boolean _BServiceFnameSet = false;
  /** SERVICE.b_service_minit field */
  public    String BServiceMinit  = null;
  protected boolean _BServiceMinitSet = false;
  /** SERVICE.b_service_lname field */
  public    String BServiceLname  = null;
  protected boolean _BServiceLnameSet = false;
  /** SERVICE.b_service_company field */
  public    String BServiceCompany  = null;
  protected boolean _BServiceCompanySet = false;
  /** SERVICE.b_service_phone field */
  public    String BServicePhone  = null;
  protected boolean _BServicePhoneSet = false;
  /** SERVICE.b_service_phone2 field */
  public    String BServicePhone2  = null;
  protected boolean _BServicePhone2Set = false;
  /** SERVICE.chg_dt field */
  public    Date ChgDt  = null;
  protected boolean _ChgDtSet = false;
  /** SERVICE.chg_who field */
  public    String ChgWho  = null;
  protected boolean _ChgWhoSet = false;
  /** SERVICE.codeword field */
  public    String Codeword  = null;
  protected boolean _CodewordSet = false;
  /** SERVICE.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** SERVICE.display_external_id_type field */
  public    Integer DisplayExternalIdType  = null;
  protected boolean _DisplayExternalIdTypeSet = false;
  /** SERVICE.elig_key1 field */
  public    Integer EligKey1  = null;
  protected boolean _EligKey1Set = false;
  /** SERVICE.elig_key2 field */
  public    Integer EligKey2  = null;
  protected boolean _EligKey2Set = false;
  /** SERVICE.elig_key3 field */
  public    Integer EligKey3  = null;
  protected boolean _EligKey3Set = false;
  /** SERVICE.emf_config_id field */
  public    Integer EmfConfigId  = null;
  protected boolean _EmfConfigIdSet = false;
  /** SERVICE.exrate_class field */
  public    Integer ExrateClass  = null;
  protected boolean _ExrateClassSet = false;
  /** SERVICE.ixc_provider_id field */
  public    Integer IxcProviderId  = null;
  protected boolean _IxcProviderIdSet = false;
  /** SERVICE.lec_provider_id field */
  public    Integer LecProviderId  = null;
  protected boolean _LecProviderIdSet = false;
  /** SERVICE.nonpub_nonlist field */
  public    Integer NonpubNonlist  = null;
  protected boolean _NonpubNonlistSet = false;
  /** SERVICE.pic_date_active field */
  public    Date PicDateActive  = null;
  protected boolean _PicDateActiveSet = false;
  /** SERVICE.parent_account_no field */
  public    Integer ParentAccountInternalId  = null;
  protected boolean _ParentAccountInternalIdSet = false;
  /** SERVICE.pop_units field */
  public    Integer PopUnits  = null;
  protected boolean _PopUnitsSet = false;
  /** SERVICE.privacy_level field */
  public    Integer PrivacyLevel  = null;
  protected boolean _PrivacyLevelSet = false;
  /** SERVICE.restricted_pic field */
  public    Integer RestrictedPic  = null;
  protected boolean _RestrictedPicSet = false;
  /** SERVICE.service_name_pre field */
  public    String ServiceNamePre  = null;
  protected boolean _ServiceNamePreSet = false;
  /** SERVICE.service_fname field */
  public    String ServiceFname  = null;
  protected boolean _ServiceFnameSet = false;
  /** SERVICE.service_minit field */
  public    String ServiceMinit  = null;
  protected boolean _ServiceMinitSet = false;
  /** SERVICE.service_lname field */
  public    String ServiceLname  = null;
  protected boolean _ServiceLnameSet = false;
  /** SERVICE.service_name_generation field */
  public    String ServiceNameGeneration  = null;
  protected boolean _ServiceNameGenerationSet = false;
  /** SERVICE.service_company field */
  public    String ServiceCompany  = null;
  protected boolean _ServiceCompanySet = false;
  /** SERVICE.service_phone field */
  public    String ServicePhone  = null;
  protected boolean _ServicePhoneSet = false;
  /** SERVICE.service_phone2 field */
  public    String ServicePhone2  = null;
  protected boolean _ServicePhone2Set = false;
  /** SERVICE.sales_channel_id field */
  public    Integer SalesChannelId  = null;
  protected boolean _SalesChannelIdSet = false;
  /** SERVICE.sim_serial_number field */
  public    String SimSerialNumber  = null;
  protected boolean _SimSerialNumberSet = false;
  /** SERVICE.switch_id field */
  public    String SwitchId  = null;
  protected boolean _SwitchIdSet = false;
  /** SERVICE.is_prepaid field */
  public    Boolean IsPrepaid  = null;
  protected boolean _IsPrepaidSet = false;
  /** SERVICE.service_active_dt field */
  public    Date ServiceActiveDt  = null;
  protected boolean _ServiceActiveDtSet = false;
  /** SERVICE.service_inactive_dt field */
  public    Date ServiceInactiveDt  = null;
  protected boolean _ServiceInactiveDtSet = false;
  /** SERVICE.view_id field */
  public    BigInteger ViewId  = null;
  protected boolean _ViewIdSet = false;
  private String _objName = "UnbilledUsageServiceObjectData";
  /** Default constructor */
  public UnbilledUsageServiceObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public UnbilledUsageServiceObjectData (UnbilledUsageServiceObjectData other)
  {

    super (other);

    if (other == null) return;
    this.ServiceParentAccountExternalId = other.ServiceParentAccountExternalId;
    this._ServiceParentAccountExternalIdSet = other._ServiceParentAccountExternalIdSet;
    this.ServiceParentAccountExternalIdType = other.ServiceParentAccountExternalIdType;
    this._ServiceParentAccountExternalIdTypeSet = other._ServiceParentAccountExternalIdTypeSet;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this._BRevRcvCostCtrSet = other._BRevRcvCostCtrSet;
    this.BServiceFname = other.BServiceFname;
    this._BServiceFnameSet = other._BServiceFnameSet;
    this.BServiceMinit = other.BServiceMinit;
    this._BServiceMinitSet = other._BServiceMinitSet;
    this.BServiceLname = other.BServiceLname;
    this._BServiceLnameSet = other._BServiceLnameSet;
    this.BServiceCompany = other.BServiceCompany;
    this._BServiceCompanySet = other._BServiceCompanySet;
    this.BServicePhone = other.BServicePhone;
    this._BServicePhoneSet = other._BServicePhoneSet;
    this.BServicePhone2 = other.BServicePhone2;
    this._BServicePhone2Set = other._BServicePhone2Set;
    this.ChgDt = other.ChgDt;
    this._ChgDtSet = other._ChgDtSet;
    this.ChgWho = other.ChgWho;
    this._ChgWhoSet = other._ChgWhoSet;
    this.Codeword = other.Codeword;
    this._CodewordSet = other._CodewordSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.DisplayExternalIdType = other.DisplayExternalIdType;
    this._DisplayExternalIdTypeSet = other._DisplayExternalIdTypeSet;
    this.EligKey1 = other.EligKey1;
    this._EligKey1Set = other._EligKey1Set;
    this.EligKey2 = other.EligKey2;
    this._EligKey2Set = other._EligKey2Set;
    this.EligKey3 = other.EligKey3;
    this._EligKey3Set = other._EligKey3Set;
    this.EmfConfigId = other.EmfConfigId;
    this._EmfConfigIdSet = other._EmfConfigIdSet;
    this.ExrateClass = other.ExrateClass;
    this._ExrateClassSet = other._ExrateClassSet;
    this.IxcProviderId = other.IxcProviderId;
    this._IxcProviderIdSet = other._IxcProviderIdSet;
    this.LecProviderId = other.LecProviderId;
    this._LecProviderIdSet = other._LecProviderIdSet;
    this.NonpubNonlist = other.NonpubNonlist;
    this._NonpubNonlistSet = other._NonpubNonlistSet;
    this.PicDateActive = other.PicDateActive;
    this._PicDateActiveSet = other._PicDateActiveSet;
    this.ParentAccountInternalId = other.ParentAccountInternalId;
    this._ParentAccountInternalIdSet = other._ParentAccountInternalIdSet;
    this.PopUnits = other.PopUnits;
    this._PopUnitsSet = other._PopUnitsSet;
    this.PrivacyLevel = other.PrivacyLevel;
    this._PrivacyLevelSet = other._PrivacyLevelSet;
    this.RestrictedPic = other.RestrictedPic;
    this._RestrictedPicSet = other._RestrictedPicSet;
    this.ServiceNamePre = other.ServiceNamePre;
    this._ServiceNamePreSet = other._ServiceNamePreSet;
    this.ServiceFname = other.ServiceFname;
    this._ServiceFnameSet = other._ServiceFnameSet;
    this.ServiceMinit = other.ServiceMinit;
    this._ServiceMinitSet = other._ServiceMinitSet;
    this.ServiceLname = other.ServiceLname;
    this._ServiceLnameSet = other._ServiceLnameSet;
    this.ServiceNameGeneration = other.ServiceNameGeneration;
    this._ServiceNameGenerationSet = other._ServiceNameGenerationSet;
    this.ServiceCompany = other.ServiceCompany;
    this._ServiceCompanySet = other._ServiceCompanySet;
    this.ServicePhone = other.ServicePhone;
    this._ServicePhoneSet = other._ServicePhoneSet;
    this.ServicePhone2 = other.ServicePhone2;
    this._ServicePhone2Set = other._ServicePhone2Set;
    this.SalesChannelId = other.SalesChannelId;
    this._SalesChannelIdSet = other._SalesChannelIdSet;
    this.SimSerialNumber = other.SimSerialNumber;
    this._SimSerialNumberSet = other._SimSerialNumberSet;
    this.SwitchId = other.SwitchId;
    this._SwitchIdSet = other._SwitchIdSet;
    this.IsPrepaid = other.IsPrepaid;
    this._IsPrepaidSet = other._IsPrepaidSet;
    this.ServiceActiveDt = other.ServiceActiveDt;
    this._ServiceActiveDtSet = other._ServiceActiveDtSet;
    this.ServiceInactiveDt = other.ServiceInactiveDt;
    this._ServiceInactiveDtSet = other._ServiceInactiveDtSet;
    this.ViewId = other.ViewId;
    this._ViewIdSet = other._ViewIdSet;
  }

  /** Constructor to copy base class fields. 
   * @param other the object to copy
   */
  public UnbilledUsageServiceObjectData (UnbilledUsageObjectData other)
  {
    super (other);

  }

  /** set the fields value: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceParentAccountExternalId") 
  public void setServiceParentAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceParentAccountExternalId", "setServiceParentAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceParentAccountExternalId", "setServiceParentAccountExternalId");
    }
    this.ServiceParentAccountExternalId = value;
    this._ServiceParentAccountExternalIdSet = true;
  }

  /** Retrieves the ServiceParentAccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceParentAccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceParentAccountExternalId field
   */
   public String getServiceParentAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceParentAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceParentAccountExternalId field from a formatted string
   *
   * @param _value the ServiceParentAccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceParentAccountExternalId field
   */
   public void setServiceParentAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceParentAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceParentAccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceParentAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getServiceParentAccountExternalId () {
    return this.ServiceParentAccountExternalId;
  }
  /** Change the field to not being actively set: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetServiceParentAccountExternalId () {
    this._ServiceParentAccountExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceParentAccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceParentAccountExternalId () {
    return this._ServiceParentAccountExternalIdSet;
  }
  /** set the fields value: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceParentAccountExternalIdType") 
  public void setServiceParentAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceParentAccountExternalIdType", "setServiceParentAccountExternalIdType");
    }
    this.ServiceParentAccountExternalIdType = value;
    this._ServiceParentAccountExternalIdTypeSet = true;
  }

  /** Retrieves the ServiceParentAccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceParentAccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceParentAccountExternalIdType field
   */
   public String getServiceParentAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceParentAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceParentAccountExternalIdType field from a formatted string
   *
   * @param _value the ServiceParentAccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceParentAccountExternalIdType field
   */
   public void setServiceParentAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceParentAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceParentAccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceParentAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ServiceParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceParentAccountExternalIdType field
   */

  public String getServiceParentAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceParentAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getServiceParentAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ServiceParentAccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ServiceParentAccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceParentAccountExternalIdType field
   */
  public Enumeration getServiceParentAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceParentAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceParentAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceParentAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ServiceParentAccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setServiceParentAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceParentAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceParentAccountExternalIdTypeEnumeration(_locale);
      this.setServiceParentAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceParentAccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceParentAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceParentAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getServiceParentAccountExternalIdType () {
    return this.ServiceParentAccountExternalIdType;
  }
  /** Change the field to not being actively set: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetServiceParentAccountExternalIdType () {
    this._ServiceParentAccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceParentAccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceParentAccountExternalIdType () {
    return this._ServiceParentAccountExternalIdTypeSet;
  }
  /** set the fields value: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BRevRcvCostCtr") 
  public void setBRevRcvCostCtr (Integer value) throws ServiceException
  {
    this.BRevRcvCostCtr = value;
    this._BRevRcvCostCtrSet = true;
  }

  /** Retrieves the BRevRcvCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BRevRcvCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BRevRcvCostCtr field
   */
   public String getBRevRcvCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getBRevRcvCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BRevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBRevRcvCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the BRevRcvCostCtr field from a formatted string
   *
   * @param _value the BRevRcvCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BRevRcvCostCtr field
   */
   public void setBRevRcvCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBRevRcvCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBRevRcvCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BRevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBRevRcvCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBRevRcvCostCtrFromFormattedString");
   }

  /** get the value of the field: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getBRevRcvCostCtr () {
    return this.BRevRcvCostCtr;
  }
  /** Change the field to not being actively set: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   */
  public void unsetBRevRcvCostCtr () {
    this._BRevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: BRevRcvCostCtr (SERVICE.b_rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetBRevRcvCostCtr () {
    return this._BRevRcvCostCtrSet;
  }
  /** set the fields value: BServiceFname (SERVICE.b_service_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServiceFname") 
  public void setBServiceFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServiceFname", "setBServiceFname");
    }
    this.BServiceFname = value;
    this._BServiceFnameSet = true;
  }

  /** Retrieves the BServiceFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServiceFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceFname field
   */
   public String getBServiceFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceFnameAsFormattedString");
       return fmtMgr.formatString(this.getBServiceFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BServiceFname field from a formatted string
   *
   * @param _value the BServiceFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServiceFname field
   */
   public void setBServiceFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServiceFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceFnameFromFormattedString");
   }

  /** get the value of the field: BServiceFname (SERVICE.b_service_fname)
   * @return String the value
   */
  public String getBServiceFname () {
    return this.BServiceFname;
  }
  /** Change the field to not being actively set: BServiceFname (SERVICE.b_service_fname)
   */
  public void unsetBServiceFname () {
    this._BServiceFnameSet = false;
  }
  /** See if the field is actively set: BServiceFname (SERVICE.b_service_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServiceFname () {
    return this._BServiceFnameSet;
  }
  /** set the fields value: BServiceMinit (SERVICE.b_service_minit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServiceMinit") 
  public void setBServiceMinit (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServiceMinit", "setBServiceMinit");
    }
    this.BServiceMinit = value;
    this._BServiceMinitSet = true;
  }

  /** Retrieves the BServiceMinit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServiceMinit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceMinit field
   */
   public String getBServiceMinitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceMinitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceMinitAsFormattedString");
       return fmtMgr.formatString(this.getBServiceMinit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceMinitAsFormattedString");
       throw x;
     }
   }
  /** Sets the BServiceMinit field from a formatted string
   *
   * @param _value the BServiceMinit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServiceMinit field
   */
   public void setBServiceMinitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceMinitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServiceMinit(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceMinitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceMinitFromFormattedString");
   }

  /** get the value of the field: BServiceMinit (SERVICE.b_service_minit)
   * @return String the value
   */
  public String getBServiceMinit () {
    return this.BServiceMinit;
  }
  /** Change the field to not being actively set: BServiceMinit (SERVICE.b_service_minit)
   */
  public void unsetBServiceMinit () {
    this._BServiceMinitSet = false;
  }
  /** See if the field is actively set: BServiceMinit (SERVICE.b_service_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServiceMinit () {
    return this._BServiceMinitSet;
  }
  /** set the fields value: BServiceLname (SERVICE.b_service_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServiceLname") 
  public void setBServiceLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServiceLname", "setBServiceLname");
    }
    this.BServiceLname = value;
    this._BServiceLnameSet = true;
  }

  /** Retrieves the BServiceLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServiceLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceLname field
   */
   public String getBServiceLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceLnameAsFormattedString");
       return fmtMgr.formatString(this.getBServiceLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BServiceLname field from a formatted string
   *
   * @param _value the BServiceLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServiceLname field
   */
   public void setBServiceLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServiceLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceLnameFromFormattedString");
   }

  /** get the value of the field: BServiceLname (SERVICE.b_service_lname)
   * @return String the value
   */
  public String getBServiceLname () {
    return this.BServiceLname;
  }
  /** Change the field to not being actively set: BServiceLname (SERVICE.b_service_lname)
   */
  public void unsetBServiceLname () {
    this._BServiceLnameSet = false;
  }
  /** See if the field is actively set: BServiceLname (SERVICE.b_service_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServiceLname () {
    return this._BServiceLnameSet;
  }
  /** set the fields value: BServiceCompany (SERVICE.b_service_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServiceCompany") 
  public void setBServiceCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServiceCompany", "setBServiceCompany");
    }
    this.BServiceCompany = value;
    this._BServiceCompanySet = true;
  }

  /** Retrieves the BServiceCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServiceCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServiceCompany field
   */
   public String getBServiceCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServiceCompanyAsFormattedString");
       return fmtMgr.formatString(this.getBServiceCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServiceCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the BServiceCompany field from a formatted string
   *
   * @param _value the BServiceCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServiceCompany field
   */
   public void setBServiceCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServiceCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServiceCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServiceCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServiceCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServiceCompanyFromFormattedString");
   }

  /** get the value of the field: BServiceCompany (SERVICE.b_service_company)
   * @return String the value
   */
  public String getBServiceCompany () {
    return this.BServiceCompany;
  }
  /** Change the field to not being actively set: BServiceCompany (SERVICE.b_service_company)
   */
  public void unsetBServiceCompany () {
    this._BServiceCompanySet = false;
  }
  /** See if the field is actively set: BServiceCompany (SERVICE.b_service_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServiceCompany () {
    return this._BServiceCompanySet;
  }
  /** set the fields value: BServicePhone (SERVICE.b_service_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServicePhone") 
  public void setBServicePhone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServicePhone", "setBServicePhone");
    }
    this.BServicePhone = value;
    this._BServicePhoneSet = true;
  }

  /** Retrieves the BServicePhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServicePhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServicePhone field
   */
   public String getBServicePhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServicePhoneAsFormattedString");
       return fmtMgr.formatString(this.getBServicePhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServicePhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServicePhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the BServicePhone field from a formatted string
   *
   * @param _value the BServicePhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServicePhone field
   */
   public void setBServicePhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServicePhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServicePhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServicePhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServicePhoneFromFormattedString");
   }

  /** get the value of the field: BServicePhone (SERVICE.b_service_phone)
   * @return String the value
   */
  public String getBServicePhone () {
    return this.BServicePhone;
  }
  /** Change the field to not being actively set: BServicePhone (SERVICE.b_service_phone)
   */
  public void unsetBServicePhone () {
    this._BServicePhoneSet = false;
  }
  /** See if the field is actively set: BServicePhone (SERVICE.b_service_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServicePhone () {
    return this._BServicePhoneSet;
  }
  /** set the fields value: BServicePhone2 (SERVICE.b_service_phone2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BServicePhone2") 
  public void setBServicePhone2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BServicePhone2", "setBServicePhone2");
    }
    this.BServicePhone2 = value;
    this._BServicePhone2Set = true;
  }

  /** Retrieves the BServicePhone2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BServicePhone2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BServicePhone2 field
   */
   public String getBServicePhone2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhone2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBServicePhone2AsFormattedString");
       return fmtMgr.formatString(this.getBServicePhone2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServicePhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBServicePhone2AsFormattedString");
       throw x;
     }
   }
  /** Sets the BServicePhone2 field from a formatted string
   *
   * @param _value the BServicePhone2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BServicePhone2 field
   */
   public void setBServicePhone2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBServicePhone2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBServicePhone2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BServicePhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBServicePhone2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBServicePhone2FromFormattedString");
   }

  /** get the value of the field: BServicePhone2 (SERVICE.b_service_phone2)
   * @return String the value
   */
  public String getBServicePhone2 () {
    return this.BServicePhone2;
  }
  /** Change the field to not being actively set: BServicePhone2 (SERVICE.b_service_phone2)
   */
  public void unsetBServicePhone2 () {
    this._BServicePhone2Set = false;
  }
  /** See if the field is actively set: BServicePhone2 (SERVICE.b_service_phone2)
   * @return boolean whether the field is actively set
   */
  public boolean issetBServicePhone2 () {
    return this._BServicePhone2Set;
  }
  /** set the fields value: ChgDt (SERVICE.chg_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDt") 
  public void setChgDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDt", "setChgDt");
    }
    this.ChgDt = value;
    this._ChgDtSet = true;
  }

  /** Retrieves the ChgDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
   public String getChgDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedString");
       return fmtMgr.formatDate(this.getChgDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDt field from a formatted string
   *
   * @param _value the ChgDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
   public void setChgDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDtFromFormattedString");
   }

  /**
   * Retrieves the ChgDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDt field
   */
  public String getChgDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDt field value from a formatted date/time string
   *
   * @param _value the ChgDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDt field
   */
  public void setChgDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDt (SERVICE.chg_dt)
   * @return Date the value
   */
  public Date getChgDt () {
    return this.ChgDt;
  }
  /** Change the field to not being actively set: ChgDt (SERVICE.chg_dt)
   */
  public void unsetChgDt () {
    this._ChgDtSet = false;
  }
  /** See if the field is actively set: ChgDt (SERVICE.chg_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDt () {
    return this._ChgDtSet;
  }
  /** set the fields value: ChgWho (SERVICE.chg_who)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgWho") 
  public void setChgWho (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgWho", "setChgWho");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ChgWho", "setChgWho");
    }
    this.ChgWho = value;
    this._ChgWhoSet = true;
  }

  /** Retrieves the ChgWho field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgWho field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgWho field
   */
   public String getChgWhoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgWhoAsFormattedString");
       return fmtMgr.formatString(this.getChgWho());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgWhoAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgWho field from a formatted string
   *
   * @param _value the ChgWho field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgWho field
   */
   public void setChgWhoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgWhoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgWho(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgWho");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgWhoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgWhoFromFormattedString");
   }

  /** get the value of the field: ChgWho (SERVICE.chg_who)
   * @return String the value
   */
  public String getChgWho () {
    return this.ChgWho;
  }
  /** Change the field to not being actively set: ChgWho (SERVICE.chg_who)
   */
  public void unsetChgWho () {
    this._ChgWhoSet = false;
  }
  /** See if the field is actively set: ChgWho (SERVICE.chg_who)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgWho () {
    return this._ChgWhoSet;
  }
  /** set the fields value: Codeword (SERVICE.codeword)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Codeword") 
  public void setCodeword (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Codeword", "setCodeword");
    }
    this.Codeword = value;
    this._CodewordSet = true;
  }

  /** Retrieves the Codeword field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Codeword field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Codeword field
   */
   public String getCodewordAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCodewordAsFormattedString");
       return fmtMgr.formatString(this.getCodeword());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCodewordAsFormattedString");
       throw x;
     }
   }
  /** Sets the Codeword field from a formatted string
   *
   * @param _value the Codeword field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Codeword field
   */
   public void setCodewordFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCodewordFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCodeword(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Codeword");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCodewordFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCodewordFromFormattedString");
   }

  /** get the value of the field: Codeword (SERVICE.codeword)
   * @return String the value
   */
  public String getCodeword () {
    return this.Codeword;
  }
  /** Change the field to not being actively set: Codeword (SERVICE.codeword)
   */
  public void unsetCodeword () {
    this._CodewordSet = false;
  }
  /** See if the field is actively set: Codeword (SERVICE.codeword)
   * @return boolean whether the field is actively set
   */
  public boolean issetCodeword () {
    return this._CodewordSet;
  }
  /** set the fields value: CurrencyCode (SERVICE.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (SERVICE.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (SERVICE.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (SERVICE.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DisplayExternalIdType") 
  public void setDisplayExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DisplayExternalIdType", "setDisplayExternalIdType");
    }
    this.DisplayExternalIdType = value;
    this._DisplayExternalIdTypeSet = true;
  }

  /** Retrieves the DisplayExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DisplayExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DisplayExternalIdType field
   */
   public String getDisplayExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDisplayExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getDisplayExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDisplayExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DisplayExternalIdType field from a formatted string
   *
   * @param _value the DisplayExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DisplayExternalIdType field
   */
   public void setDisplayExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDisplayExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDisplayExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DisplayExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDisplayExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDisplayExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return Integer the value
   */
  public Integer getDisplayExternalIdType () {
    return this.DisplayExternalIdType;
  }
  /** Change the field to not being actively set: DisplayExternalIdType (SERVICE.display_external_id_type)
   */
  public void unsetDisplayExternalIdType () {
    this._DisplayExternalIdTypeSet = false;
  }
  /** See if the field is actively set: DisplayExternalIdType (SERVICE.display_external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetDisplayExternalIdType () {
    return this._DisplayExternalIdTypeSet;
  }
  /** set the fields value: EligKey1 (SERVICE.elig_key1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EligKey1") 
  public void setEligKey1 (Integer value) throws ServiceException
  {
    this.EligKey1 = value;
    this._EligKey1Set = true;
  }

  /** Retrieves the EligKey1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EligKey1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey1 field
   */
   public String getEligKey1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey1AsFormattedString");
       return fmtMgr.formatNumber(this.getEligKey1(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey1AsFormattedString");
       throw x;
     }
   }
  /** Sets the EligKey1 field from a formatted string
   *
   * @param _value the EligKey1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EligKey1 field
   */
   public void setEligKey1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEligKey1(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey1FromFormattedString");
   }

  /** get the value of the field: EligKey1 (SERVICE.elig_key1)
   * @return Integer the value
   */
  public Integer getEligKey1 () {
    return this.EligKey1;
  }
  /** Change the field to not being actively set: EligKey1 (SERVICE.elig_key1)
   */
  public void unsetEligKey1 () {
    this._EligKey1Set = false;
  }
  /** See if the field is actively set: EligKey1 (SERVICE.elig_key1)
   * @return boolean whether the field is actively set
   */
  public boolean issetEligKey1 () {
    return this._EligKey1Set;
  }
  /** set the fields value: EligKey2 (SERVICE.elig_key2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EligKey2") 
  public void setEligKey2 (Integer value) throws ServiceException
  {
    this.EligKey2 = value;
    this._EligKey2Set = true;
  }

  /** Retrieves the EligKey2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EligKey2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey2 field
   */
   public String getEligKey2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey2AsFormattedString");
       return fmtMgr.formatNumber(this.getEligKey2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey2AsFormattedString");
       throw x;
     }
   }
  /** Sets the EligKey2 field from a formatted string
   *
   * @param _value the EligKey2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EligKey2 field
   */
   public void setEligKey2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEligKey2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey2FromFormattedString");
   }

  /** get the value of the field: EligKey2 (SERVICE.elig_key2)
   * @return Integer the value
   */
  public Integer getEligKey2 () {
    return this.EligKey2;
  }
  /** Change the field to not being actively set: EligKey2 (SERVICE.elig_key2)
   */
  public void unsetEligKey2 () {
    this._EligKey2Set = false;
  }
  /** See if the field is actively set: EligKey2 (SERVICE.elig_key2)
   * @return boolean whether the field is actively set
   */
  public boolean issetEligKey2 () {
    return this._EligKey2Set;
  }
  /** set the fields value: EligKey3 (SERVICE.elig_key3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EligKey3") 
  public void setEligKey3 (Integer value) throws ServiceException
  {
    this.EligKey3 = value;
    this._EligKey3Set = true;
  }

  /** Retrieves the EligKey3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EligKey3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EligKey3 field
   */
   public String getEligKey3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEligKey3AsFormattedString");
       return fmtMgr.formatNumber(this.getEligKey3(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEligKey3AsFormattedString");
       throw x;
     }
   }
  /** Sets the EligKey3 field from a formatted string
   *
   * @param _value the EligKey3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EligKey3 field
   */
   public void setEligKey3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEligKey3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEligKey3(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EligKey3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEligKey3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEligKey3FromFormattedString");
   }

  /** get the value of the field: EligKey3 (SERVICE.elig_key3)
   * @return Integer the value
   */
  public Integer getEligKey3 () {
    return this.EligKey3;
  }
  /** Change the field to not being actively set: EligKey3 (SERVICE.elig_key3)
   */
  public void unsetEligKey3 () {
    this._EligKey3Set = false;
  }
  /** See if the field is actively set: EligKey3 (SERVICE.elig_key3)
   * @return boolean whether the field is actively set
   */
  public boolean issetEligKey3 () {
    return this._EligKey3Set;
  }
  /** set the fields value: EmfConfigId (SERVICE.emf_config_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EmfConfigId") 
  public void setEmfConfigId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EmfConfigId", "setEmfConfigId");
    }
    this.EmfConfigId = value;
    this._EmfConfigIdSet = true;
  }

  /** Retrieves the EmfConfigId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EmfConfigId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EmfConfigId field
   */
   public String getEmfConfigIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEmfConfigIdAsFormattedString");
       return fmtMgr.formatNumber(this.getEmfConfigId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEmfConfigIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the EmfConfigId field from a formatted string
   *
   * @param _value the EmfConfigId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EmfConfigId field
   */
   public void setEmfConfigIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEmfConfigIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEmfConfigId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EmfConfigId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEmfConfigIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEmfConfigIdFromFormattedString");
   }

  /** get the value of the field: EmfConfigId (SERVICE.emf_config_id)
   * @return Integer the value
   */
  public Integer getEmfConfigId () {
    return this.EmfConfigId;
  }
  /** Change the field to not being actively set: EmfConfigId (SERVICE.emf_config_id)
   */
  public void unsetEmfConfigId () {
    this._EmfConfigIdSet = false;
  }
  /** See if the field is actively set: EmfConfigId (SERVICE.emf_config_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetEmfConfigId () {
    return this._EmfConfigIdSet;
  }
  /** set the fields value: ExrateClass (SERVICE.exrate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExrateClass") 
  public void setExrateClass (Integer value) throws ServiceException
  {
    this.ExrateClass = value;
    this._ExrateClassSet = true;
  }

  /** Retrieves the ExrateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExrateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExrateClass field
   */
   public String getExrateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExrateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getExrateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExrateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExrateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExrateClass field from a formatted string
   *
   * @param _value the ExrateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExrateClass field
   */
   public void setExrateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExrateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExrateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExrateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExrateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExrateClassFromFormattedString");
   }

  /** get the value of the field: ExrateClass (SERVICE.exrate_class)
   * @return Integer the value
   */
  public Integer getExrateClass () {
    return this.ExrateClass;
  }
  /** Change the field to not being actively set: ExrateClass (SERVICE.exrate_class)
   */
  public void unsetExrateClass () {
    this._ExrateClassSet = false;
  }
  /** See if the field is actively set: ExrateClass (SERVICE.exrate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetExrateClass () {
    return this._ExrateClassSet;
  }
  /** set the fields value: IxcProviderId (SERVICE.ixc_provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IxcProviderId") 
  public void setIxcProviderId (Integer value) throws ServiceException
  {
    this.IxcProviderId = value;
    this._IxcProviderIdSet = true;
  }

  /** Retrieves the IxcProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IxcProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IxcProviderId field
   */
   public String getIxcProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIxcProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIxcProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getIxcProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IxcProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIxcProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the IxcProviderId field from a formatted string
   *
   * @param _value the IxcProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IxcProviderId field
   */
   public void setIxcProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIxcProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIxcProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IxcProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIxcProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIxcProviderIdFromFormattedString");
   }

  /** get the value of the field: IxcProviderId (SERVICE.ixc_provider_id)
   * @return Integer the value
   */
  public Integer getIxcProviderId () {
    return this.IxcProviderId;
  }
  /** Change the field to not being actively set: IxcProviderId (SERVICE.ixc_provider_id)
   */
  public void unsetIxcProviderId () {
    this._IxcProviderIdSet = false;
  }
  /** See if the field is actively set: IxcProviderId (SERVICE.ixc_provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetIxcProviderId () {
    return this._IxcProviderIdSet;
  }
  /** set the fields value: LecProviderId (SERVICE.lec_provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LecProviderId") 
  public void setLecProviderId (Integer value) throws ServiceException
  {
    this.LecProviderId = value;
    this._LecProviderIdSet = true;
  }

  /** Retrieves the LecProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LecProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LecProviderId field
   */
   public String getLecProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLecProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLecProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getLecProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LecProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLecProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LecProviderId field from a formatted string
   *
   * @param _value the LecProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LecProviderId field
   */
   public void setLecProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLecProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLecProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LecProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLecProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLecProviderIdFromFormattedString");
   }

  /** get the value of the field: LecProviderId (SERVICE.lec_provider_id)
   * @return Integer the value
   */
  public Integer getLecProviderId () {
    return this.LecProviderId;
  }
  /** Change the field to not being actively set: LecProviderId (SERVICE.lec_provider_id)
   */
  public void unsetLecProviderId () {
    this._LecProviderIdSet = false;
  }
  /** See if the field is actively set: LecProviderId (SERVICE.lec_provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLecProviderId () {
    return this._LecProviderIdSet;
  }
  /** set the fields value: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NonpubNonlist") 
  public void setNonpubNonlist (Integer value) throws ServiceException
  {
    this.NonpubNonlist = value;
    this._NonpubNonlistSet = true;
  }

  /** Retrieves the NonpubNonlist field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NonpubNonlist field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NonpubNonlist field
   */
   public String getNonpubNonlistAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonpubNonlistAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNonpubNonlistAsFormattedString");
       return fmtMgr.formatNumber(this.getNonpubNonlist(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NonpubNonlist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNonpubNonlistAsFormattedString");
       throw x;
     }
   }
  /** Sets the NonpubNonlist field from a formatted string
   *
   * @param _value the NonpubNonlist field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NonpubNonlist field
   */
   public void setNonpubNonlistFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNonpubNonlistFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNonpubNonlist(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NonpubNonlist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNonpubNonlistFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNonpubNonlistFromFormattedString");
   }

  /** get the value of the field: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return Integer the value
   */
  public Integer getNonpubNonlist () {
    return this.NonpubNonlist;
  }
  /** Change the field to not being actively set: NonpubNonlist (SERVICE.nonpub_nonlist)
   */
  public void unsetNonpubNonlist () {
    this._NonpubNonlistSet = false;
  }
  /** See if the field is actively set: NonpubNonlist (SERVICE.nonpub_nonlist)
   * @return boolean whether the field is actively set
   */
  public boolean issetNonpubNonlist () {
    return this._NonpubNonlistSet;
  }
  /** set the fields value: PicDateActive (SERVICE.pic_date_active)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PicDateActive") 
  public void setPicDateActive (Date value) throws ServiceException
  {
    this.PicDateActive = value;
    this._PicDateActiveSet = true;
  }

  /** Retrieves the PicDateActive field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PicDateActive field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PicDateActive field
   */
   public String getPicDateActiveAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPicDateActiveAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPicDateActiveAsFormattedString");
       return fmtMgr.formatDate(this.getPicDateActive(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PicDateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPicDateActiveAsFormattedString");
       throw x;
     }
   }
  /** Sets the PicDateActive field from a formatted string
   *
   * @param _value the PicDateActive field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PicDateActive field
   */
   public void setPicDateActiveFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPicDateActiveFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPicDateActive(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PicDateActive");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPicDateActiveFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPicDateActiveFromFormattedString");
   }

  /**
   * Retrieves the PicDateActive field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PicDateActive field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PicDateActive field
   */
  public String getPicDateActiveAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPicDateActiveAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPicDateActiveAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPicDateActive(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPicDateActiveAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PicDateActive field value from a formatted date/time string
   *
   * @param _value the PicDateActive field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PicDateActive field
   */
  public void setPicDateActiveFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPicDateActiveFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPicDateActive(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PicDateActive");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPicDateActiveFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PicDateActive (SERVICE.pic_date_active)
   * @return Date the value
   */
  public Date getPicDateActive () {
    return this.PicDateActive;
  }
  /** Change the field to not being actively set: PicDateActive (SERVICE.pic_date_active)
   */
  public void unsetPicDateActive () {
    this._PicDateActiveSet = false;
  }
  /** See if the field is actively set: PicDateActive (SERVICE.pic_date_active)
   * @return boolean whether the field is actively set
   */
  public boolean issetPicDateActive () {
    return this._PicDateActiveSet;
  }
  /** set the fields value: ParentAccountInternalId (SERVICE.parent_account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ParentAccountInternalId") 
  public void setParentAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ParentAccountInternalId", "setParentAccountInternalId");
    }
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

  /** get the value of the field: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return Integer the value
   */
  public Integer getParentAccountInternalId () {
    return this.ParentAccountInternalId;
  }
  /** Change the field to not being actively set: ParentAccountInternalId (SERVICE.parent_account_no)
   */
  public void unsetParentAccountInternalId () {
    this._ParentAccountInternalIdSet = false;
  }
  /** See if the field is actively set: ParentAccountInternalId (SERVICE.parent_account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetParentAccountInternalId () {
    return this._ParentAccountInternalIdSet;
  }
  /** set the fields value: PopUnits (SERVICE.pop_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PopUnits") 
  public void setPopUnits (Integer value) throws ServiceException
  {
    this.PopUnits = value;
    this._PopUnitsSet = true;
  }

  /** Retrieves the PopUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PopUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PopUnits field
   */
   public String getPopUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPopUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPopUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getPopUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PopUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPopUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PopUnits field from a formatted string
   *
   * @param _value the PopUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PopUnits field
   */
   public void setPopUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPopUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPopUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PopUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPopUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPopUnitsFromFormattedString");
   }

  /** get the value of the field: PopUnits (SERVICE.pop_units)
   * @return Integer the value
   */
  public Integer getPopUnits () {
    return this.PopUnits;
  }
  /** Change the field to not being actively set: PopUnits (SERVICE.pop_units)
   */
  public void unsetPopUnits () {
    this._PopUnitsSet = false;
  }
  /** See if the field is actively set: PopUnits (SERVICE.pop_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetPopUnits () {
    return this._PopUnitsSet;
  }
  /** set the fields value: PrivacyLevel (SERVICE.privacy_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrivacyLevel") 
  public void setPrivacyLevel (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrivacyLevel", "setPrivacyLevel");
    }
    this.PrivacyLevel = value;
    this._PrivacyLevelSet = true;
  }

  /** Retrieves the PrivacyLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrivacyLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrivacyLevel field
   */
   public String getPrivacyLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrivacyLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getPrivacyLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrivacyLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrivacyLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrivacyLevel field from a formatted string
   *
   * @param _value the PrivacyLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrivacyLevel field
   */
   public void setPrivacyLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrivacyLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrivacyLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrivacyLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrivacyLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrivacyLevelFromFormattedString");
   }

  /** get the value of the field: PrivacyLevel (SERVICE.privacy_level)
   * @return Integer the value
   */
  public Integer getPrivacyLevel () {
    return this.PrivacyLevel;
  }
  /** Change the field to not being actively set: PrivacyLevel (SERVICE.privacy_level)
   */
  public void unsetPrivacyLevel () {
    this._PrivacyLevelSet = false;
  }
  /** See if the field is actively set: PrivacyLevel (SERVICE.privacy_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrivacyLevel () {
    return this._PrivacyLevelSet;
  }
  /** set the fields value: RestrictedPic (SERVICE.restricted_pic)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RestrictedPic") 
  public void setRestrictedPic (Integer value) throws ServiceException
  {
    this.RestrictedPic = value;
    this._RestrictedPicSet = true;
  }

  /** Retrieves the RestrictedPic field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RestrictedPic field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RestrictedPic field
   */
   public String getRestrictedPicAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRestrictedPicAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRestrictedPicAsFormattedString");
       return fmtMgr.formatNumber(this.getRestrictedPic(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RestrictedPic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRestrictedPicAsFormattedString");
       throw x;
     }
   }
  /** Sets the RestrictedPic field from a formatted string
   *
   * @param _value the RestrictedPic field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RestrictedPic field
   */
   public void setRestrictedPicFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRestrictedPicFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRestrictedPic(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RestrictedPic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRestrictedPicFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRestrictedPicFromFormattedString");
   }

  /** get the value of the field: RestrictedPic (SERVICE.restricted_pic)
   * @return Integer the value
   */
  public Integer getRestrictedPic () {
    return this.RestrictedPic;
  }
  /** Change the field to not being actively set: RestrictedPic (SERVICE.restricted_pic)
   */
  public void unsetRestrictedPic () {
    this._RestrictedPicSet = false;
  }
  /** See if the field is actively set: RestrictedPic (SERVICE.restricted_pic)
   * @return boolean whether the field is actively set
   */
  public boolean issetRestrictedPic () {
    return this._RestrictedPicSet;
  }
  /** set the fields value: ServiceNamePre (SERVICE.service_name_pre)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceNamePre") 
  public void setServiceNamePre (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceNamePre", "setServiceNamePre");
    }
    this.ServiceNamePre = value;
    this._ServiceNamePreSet = true;
  }

  /** Retrieves the ServiceNamePre field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceNamePre field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceNamePre field
   */
   public String getServiceNamePreAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNamePreAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceNamePreAsFormattedString");
       return fmtMgr.formatString(this.getServiceNamePre());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceNamePreAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceNamePre field from a formatted string
   *
   * @param _value the ServiceNamePre field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceNamePre field
   */
   public void setServiceNamePreFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNamePreFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceNamePre(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceNamePre");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceNamePreFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceNamePreFromFormattedString");
   }

  /** get the value of the field: ServiceNamePre (SERVICE.service_name_pre)
   * @return String the value
   */
  public String getServiceNamePre () {
    return this.ServiceNamePre;
  }
  /** Change the field to not being actively set: ServiceNamePre (SERVICE.service_name_pre)
   */
  public void unsetServiceNamePre () {
    this._ServiceNamePreSet = false;
  }
  /** See if the field is actively set: ServiceNamePre (SERVICE.service_name_pre)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceNamePre () {
    return this._ServiceNamePreSet;
  }
  /** set the fields value: ServiceFname (SERVICE.service_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceFname") 
  public void setServiceFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceFname", "setServiceFname");
    }
    this.ServiceFname = value;
    this._ServiceFnameSet = true;
  }

  /** Retrieves the ServiceFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceFname field
   */
   public String getServiceFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceFnameAsFormattedString");
       return fmtMgr.formatString(this.getServiceFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceFname field from a formatted string
   *
   * @param _value the ServiceFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceFname field
   */
   public void setServiceFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceFnameFromFormattedString");
   }

  /** get the value of the field: ServiceFname (SERVICE.service_fname)
   * @return String the value
   */
  public String getServiceFname () {
    return this.ServiceFname;
  }
  /** Change the field to not being actively set: ServiceFname (SERVICE.service_fname)
   */
  public void unsetServiceFname () {
    this._ServiceFnameSet = false;
  }
  /** See if the field is actively set: ServiceFname (SERVICE.service_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceFname () {
    return this._ServiceFnameSet;
  }
  /** set the fields value: ServiceMinit (SERVICE.service_minit)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceMinit") 
  public void setServiceMinit (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceMinit", "setServiceMinit");
    }
    this.ServiceMinit = value;
    this._ServiceMinitSet = true;
  }

  /** Retrieves the ServiceMinit field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceMinit field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceMinit field
   */
   public String getServiceMinitAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMinitAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceMinitAsFormattedString");
       return fmtMgr.formatString(this.getServiceMinit());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceMinitAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceMinit field from a formatted string
   *
   * @param _value the ServiceMinit field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceMinit field
   */
   public void setServiceMinitFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceMinitFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceMinit(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceMinit");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceMinitFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceMinitFromFormattedString");
   }

  /** get the value of the field: ServiceMinit (SERVICE.service_minit)
   * @return String the value
   */
  public String getServiceMinit () {
    return this.ServiceMinit;
  }
  /** Change the field to not being actively set: ServiceMinit (SERVICE.service_minit)
   */
  public void unsetServiceMinit () {
    this._ServiceMinitSet = false;
  }
  /** See if the field is actively set: ServiceMinit (SERVICE.service_minit)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceMinit () {
    return this._ServiceMinitSet;
  }
  /** set the fields value: ServiceLname (SERVICE.service_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceLname") 
  public void setServiceLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceLname", "setServiceLname");
    }
    this.ServiceLname = value;
    this._ServiceLnameSet = true;
  }

  /** Retrieves the ServiceLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceLname field
   */
   public String getServiceLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceLnameAsFormattedString");
       return fmtMgr.formatString(this.getServiceLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceLname field from a formatted string
   *
   * @param _value the ServiceLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceLname field
   */
   public void setServiceLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceLnameFromFormattedString");
   }

  /** get the value of the field: ServiceLname (SERVICE.service_lname)
   * @return String the value
   */
  public String getServiceLname () {
    return this.ServiceLname;
  }
  /** Change the field to not being actively set: ServiceLname (SERVICE.service_lname)
   */
  public void unsetServiceLname () {
    this._ServiceLnameSet = false;
  }
  /** See if the field is actively set: ServiceLname (SERVICE.service_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceLname () {
    return this._ServiceLnameSet;
  }
  /** set the fields value: ServiceNameGeneration (SERVICE.service_name_generation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceNameGeneration") 
  public void setServiceNameGeneration (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceNameGeneration", "setServiceNameGeneration");
    }
    this.ServiceNameGeneration = value;
    this._ServiceNameGenerationSet = true;
  }

  /** Retrieves the ServiceNameGeneration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceNameGeneration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceNameGeneration field
   */
   public String getServiceNameGenerationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNameGenerationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceNameGenerationAsFormattedString");
       return fmtMgr.formatString(this.getServiceNameGeneration());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceNameGeneration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceNameGenerationAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceNameGeneration field from a formatted string
   *
   * @param _value the ServiceNameGeneration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceNameGeneration field
   */
   public void setServiceNameGenerationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceNameGenerationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceNameGeneration(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceNameGeneration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceNameGenerationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceNameGenerationFromFormattedString");
   }

  /** get the value of the field: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return String the value
   */
  public String getServiceNameGeneration () {
    return this.ServiceNameGeneration;
  }
  /** Change the field to not being actively set: ServiceNameGeneration (SERVICE.service_name_generation)
   */
  public void unsetServiceNameGeneration () {
    this._ServiceNameGenerationSet = false;
  }
  /** See if the field is actively set: ServiceNameGeneration (SERVICE.service_name_generation)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceNameGeneration () {
    return this._ServiceNameGenerationSet;
  }
  /** set the fields value: ServiceCompany (SERVICE.service_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceCompany") 
  public void setServiceCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceCompany", "setServiceCompany");
    }
    this.ServiceCompany = value;
    this._ServiceCompanySet = true;
  }

  /** Retrieves the ServiceCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCompany field
   */
   public String getServiceCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCompanyAsFormattedString");
       return fmtMgr.formatString(this.getServiceCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceCompany field from a formatted string
   *
   * @param _value the ServiceCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceCompany field
   */
   public void setServiceCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCompanyFromFormattedString");
   }

  /** get the value of the field: ServiceCompany (SERVICE.service_company)
   * @return String the value
   */
  public String getServiceCompany () {
    return this.ServiceCompany;
  }
  /** Change the field to not being actively set: ServiceCompany (SERVICE.service_company)
   */
  public void unsetServiceCompany () {
    this._ServiceCompanySet = false;
  }
  /** See if the field is actively set: ServiceCompany (SERVICE.service_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCompany () {
    return this._ServiceCompanySet;
  }
  /** set the fields value: ServicePhone (SERVICE.service_phone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServicePhone") 
  public void setServicePhone (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServicePhone", "setServicePhone");
    }
    this.ServicePhone = value;
    this._ServicePhoneSet = true;
  }

  /** Retrieves the ServicePhone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServicePhone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServicePhone field
   */
   public String getServicePhoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePhoneAsFormattedString");
       return fmtMgr.formatString(this.getServicePhone());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServicePhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServicePhoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServicePhone field from a formatted string
   *
   * @param _value the ServicePhone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServicePhone field
   */
   public void setServicePhoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServicePhone(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServicePhone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServicePhoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServicePhoneFromFormattedString");
   }

  /** get the value of the field: ServicePhone (SERVICE.service_phone)
   * @return String the value
   */
  public String getServicePhone () {
    return this.ServicePhone;
  }
  /** Change the field to not being actively set: ServicePhone (SERVICE.service_phone)
   */
  public void unsetServicePhone () {
    this._ServicePhoneSet = false;
  }
  /** See if the field is actively set: ServicePhone (SERVICE.service_phone)
   * @return boolean whether the field is actively set
   */
  public boolean issetServicePhone () {
    return this._ServicePhoneSet;
  }
  /** set the fields value: ServicePhone2 (SERVICE.service_phone2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServicePhone2") 
  public void setServicePhone2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServicePhone2", "setServicePhone2");
    }
    this.ServicePhone2 = value;
    this._ServicePhone2Set = true;
  }

  /** Retrieves the ServicePhone2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServicePhone2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServicePhone2 field
   */
   public String getServicePhone2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhone2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServicePhone2AsFormattedString");
       return fmtMgr.formatString(this.getServicePhone2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServicePhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServicePhone2AsFormattedString");
       throw x;
     }
   }
  /** Sets the ServicePhone2 field from a formatted string
   *
   * @param _value the ServicePhone2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServicePhone2 field
   */
   public void setServicePhone2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServicePhone2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServicePhone2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServicePhone2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServicePhone2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServicePhone2FromFormattedString");
   }

  /** get the value of the field: ServicePhone2 (SERVICE.service_phone2)
   * @return String the value
   */
  public String getServicePhone2 () {
    return this.ServicePhone2;
  }
  /** Change the field to not being actively set: ServicePhone2 (SERVICE.service_phone2)
   */
  public void unsetServicePhone2 () {
    this._ServicePhone2Set = false;
  }
  /** See if the field is actively set: ServicePhone2 (SERVICE.service_phone2)
   * @return boolean whether the field is actively set
   */
  public boolean issetServicePhone2 () {
    return this._ServicePhone2Set;
  }
  /** set the fields value: SalesChannelId (SERVICE.sales_channel_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SalesChannelId") 
  public void setSalesChannelId (Integer value) throws ServiceException
  {
    this.SalesChannelId = value;
    this._SalesChannelIdSet = true;
  }

  /** Retrieves the SalesChannelId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SalesChannelId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelId field
   */
   public String getSalesChannelIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSalesChannelId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SalesChannelId field from a formatted string
   *
   * @param _value the SalesChannelId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SalesChannelId field
   */
   public void setSalesChannelIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSalesChannelId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFromFormattedString");
   }

  /** get the value of the field: SalesChannelId (SERVICE.sales_channel_id)
   * @return Integer the value
   */
  public Integer getSalesChannelId () {
    return this.SalesChannelId;
  }
  /** Change the field to not being actively set: SalesChannelId (SERVICE.sales_channel_id)
   */
  public void unsetSalesChannelId () {
    this._SalesChannelIdSet = false;
  }
  /** See if the field is actively set: SalesChannelId (SERVICE.sales_channel_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSalesChannelId () {
    return this._SalesChannelIdSet;
  }
  /** set the fields value: SimSerialNumber (SERVICE.sim_serial_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SimSerialNumber") 
  public void setSimSerialNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SimSerialNumber", "setSimSerialNumber");
    }
    this.SimSerialNumber = value;
    this._SimSerialNumberSet = true;
  }

  /** Retrieves the SimSerialNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SimSerialNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SimSerialNumber field
   */
   public String getSimSerialNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSimSerialNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSimSerialNumberAsFormattedString");
       return fmtMgr.formatString(this.getSimSerialNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SimSerialNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSimSerialNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the SimSerialNumber field from a formatted string
   *
   * @param _value the SimSerialNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SimSerialNumber field
   */
   public void setSimSerialNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSimSerialNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSimSerialNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SimSerialNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSimSerialNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSimSerialNumberFromFormattedString");
   }

  /** get the value of the field: SimSerialNumber (SERVICE.sim_serial_number)
   * @return String the value
   */
  public String getSimSerialNumber () {
    return this.SimSerialNumber;
  }
  /** Change the field to not being actively set: SimSerialNumber (SERVICE.sim_serial_number)
   */
  public void unsetSimSerialNumber () {
    this._SimSerialNumberSet = false;
  }
  /** See if the field is actively set: SimSerialNumber (SERVICE.sim_serial_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetSimSerialNumber () {
    return this._SimSerialNumberSet;
  }
  /** set the fields value: SwitchId (SERVICE.switch_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SwitchId") 
  public void setSwitchId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SwitchId", "setSwitchId");
    }
    this.SwitchId = value;
    this._SwitchIdSet = true;
  }

  /** Retrieves the SwitchId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SwitchId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SwitchId field
   */
   public String getSwitchIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSwitchIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSwitchIdAsFormattedString");
       return fmtMgr.formatString(this.getSwitchId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SwitchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSwitchIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SwitchId field from a formatted string
   *
   * @param _value the SwitchId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SwitchId field
   */
   public void setSwitchIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSwitchIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSwitchId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SwitchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSwitchIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSwitchIdFromFormattedString");
   }

  /** get the value of the field: SwitchId (SERVICE.switch_id)
   * @return String the value
   */
  public String getSwitchId () {
    return this.SwitchId;
  }
  /** Change the field to not being actively set: SwitchId (SERVICE.switch_id)
   */
  public void unsetSwitchId () {
    this._SwitchIdSet = false;
  }
  /** See if the field is actively set: SwitchId (SERVICE.switch_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSwitchId () {
    return this._SwitchIdSet;
  }
  /** set the fields value: IsPrepaid (SERVICE.is_prepaid)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPrepaid") 
  public void setIsPrepaid (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPrepaid", "setIsPrepaid");
    }
    this.IsPrepaid = value;
    this._IsPrepaidSet = true;
  }

  /** Retrieves the IsPrepaid field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPrepaid field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPrepaid field
   */
   public String getIsPrepaidAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPrepaidAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPrepaidAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPrepaid());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPrepaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPrepaidAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPrepaid field from a formatted string
   *
   * @param _value the IsPrepaid field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPrepaid field
   */
   public void setIsPrepaidFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPrepaidFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPrepaid(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPrepaid");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPrepaidFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPrepaidFromFormattedString");
   }

  /** get the value of the field: IsPrepaid (SERVICE.is_prepaid)
   * @return Boolean the value
   */
  public Boolean getIsPrepaid () {
    return this.IsPrepaid;
  }
  /** Change the field to not being actively set: IsPrepaid (SERVICE.is_prepaid)
   */
  public void unsetIsPrepaid () {
    this._IsPrepaidSet = false;
  }
  /** See if the field is actively set: IsPrepaid (SERVICE.is_prepaid)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPrepaid () {
    return this._IsPrepaidSet;
  }
  /** set the fields value: ServiceActiveDt (SERVICE.service_active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceActiveDt") 
  public void setServiceActiveDt (Date value) throws ServiceException
  {
    this.ServiceActiveDt = value;
    this._ServiceActiveDtSet = true;
  }

  /** Retrieves the ServiceActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceActiveDt field
   */
   public String getServiceActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getServiceActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceActiveDt field from a formatted string
   *
   * @param _value the ServiceActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceActiveDt field
   */
   public void setServiceActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ServiceActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceActiveDt field
   */
  public String getServiceActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getServiceActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceActiveDt field value from a formatted date/time string
   *
   * @param _value the ServiceActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceActiveDt field
   */
  public void setServiceActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setServiceActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ServiceActiveDt (SERVICE.service_active_dt)
   * @return Date the value
   */
  public Date getServiceActiveDt () {
    return this.ServiceActiveDt;
  }
  /** Change the field to not being actively set: ServiceActiveDt (SERVICE.service_active_dt)
   */
  public void unsetServiceActiveDt () {
    this._ServiceActiveDtSet = false;
  }
  /** See if the field is actively set: ServiceActiveDt (SERVICE.service_active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceActiveDt () {
    return this._ServiceActiveDtSet;
  }
  /** set the fields value: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInactiveDt") 
  public void setServiceInactiveDt (Date value) throws ServiceException
  {
    this.ServiceInactiveDt = value;
    this._ServiceInactiveDtSet = true;
  }

  /** Retrieves the ServiceInactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInactiveDt field
   */
   public String getServiceInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getServiceInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInactiveDt field from a formatted string
   *
   * @param _value the ServiceInactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInactiveDt field
   */
   public void setServiceInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the ServiceInactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ServiceInactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInactiveDt field
   */
  public String getServiceInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getServiceInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ServiceInactiveDt field value from a formatted date/time string
   *
   * @param _value the ServiceInactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInactiveDt field
   */
  public void setServiceInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setServiceInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return Date the value
   */
  public Date getServiceInactiveDt () {
    return this.ServiceInactiveDt;
  }
  /** Change the field to not being actively set: ServiceInactiveDt (SERVICE.service_inactive_dt)
   */
  public void unsetServiceInactiveDt () {
    this._ServiceInactiveDtSet = false;
  }
  /** See if the field is actively set: ServiceInactiveDt (SERVICE.service_inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInactiveDt () {
    return this._ServiceInactiveDtSet;
  }
  /** set the fields value: ViewId (SERVICE.view_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewId") 
  public void setViewId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewId", "setViewId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ViewId", "setViewId");
    }
    this.ViewId = value;
    this._ViewIdSet = true;
  }

  /** Retrieves the ViewId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewId field
   */
   public String getViewIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getViewId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewId field from a formatted string
   *
   * @param _value the ViewId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewId field
   */
   public void setViewIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewIdFromFormattedString");
   }

  /** get the value of the field: ViewId (SERVICE.view_id)
   * @return BigInteger the value
   */
  public BigInteger getViewId () {
    return this.ViewId;
  }
  /** Change the field to not being actively set: ViewId (SERVICE.view_id)
   */
  public void unsetViewId () {
    this._ViewIdSet = false;
  }
  /** See if the field is actively set: ViewId (SERVICE.view_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewId () {
    return this._ViewIdSet;
  }
  public String toString() {
    return UnbilledUsageServiceObjectHelper.toMap(this, null).toString();
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
    
      super.resetFlags(flag, true);
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (ServiceParentAccountExternalId != null))  _ServiceParentAccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (ServiceParentAccountExternalIdType != null))  _ServiceParentAccountExternalIdTypeSet = flag;
  /** SERVICE.b_rev_rcv_cost_ctr field */
    if(!nonNullOnly || (BRevRcvCostCtr != null))  _BRevRcvCostCtrSet = flag;
  /** SERVICE.b_service_fname field */
    if(!nonNullOnly || (BServiceFname != null))  _BServiceFnameSet = flag;
  /** SERVICE.b_service_minit field */
    if(!nonNullOnly || (BServiceMinit != null))  _BServiceMinitSet = flag;
  /** SERVICE.b_service_lname field */
    if(!nonNullOnly || (BServiceLname != null))  _BServiceLnameSet = flag;
  /** SERVICE.b_service_company field */
    if(!nonNullOnly || (BServiceCompany != null))  _BServiceCompanySet = flag;
  /** SERVICE.b_service_phone field */
    if(!nonNullOnly || (BServicePhone != null))  _BServicePhoneSet = flag;
  /** SERVICE.b_service_phone2 field */
    if(!nonNullOnly || (BServicePhone2 != null))  _BServicePhone2Set = flag;
  /** SERVICE.chg_dt field */
    if(!nonNullOnly || (ChgDt != null))  _ChgDtSet = flag;
  /** SERVICE.chg_who field */
    if(!nonNullOnly || (ChgWho != null))  _ChgWhoSet = flag;
  /** SERVICE.codeword field */
    if(!nonNullOnly || (Codeword != null))  _CodewordSet = flag;
  /** SERVICE.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** SERVICE.display_external_id_type field */
    if(!nonNullOnly || (DisplayExternalIdType != null))  _DisplayExternalIdTypeSet = flag;
  /** SERVICE.elig_key1 field */
    if(!nonNullOnly || (EligKey1 != null))  _EligKey1Set = flag;
  /** SERVICE.elig_key2 field */
    if(!nonNullOnly || (EligKey2 != null))  _EligKey2Set = flag;
  /** SERVICE.elig_key3 field */
    if(!nonNullOnly || (EligKey3 != null))  _EligKey3Set = flag;
  /** SERVICE.emf_config_id field */
    if(!nonNullOnly || (EmfConfigId != null))  _EmfConfigIdSet = flag;
  /** SERVICE.exrate_class field */
    if(!nonNullOnly || (ExrateClass != null))  _ExrateClassSet = flag;
  /** SERVICE.ixc_provider_id field */
    if(!nonNullOnly || (IxcProviderId != null))  _IxcProviderIdSet = flag;
  /** SERVICE.lec_provider_id field */
    if(!nonNullOnly || (LecProviderId != null))  _LecProviderIdSet = flag;
  /** SERVICE.nonpub_nonlist field */
    if(!nonNullOnly || (NonpubNonlist != null))  _NonpubNonlistSet = flag;
  /** SERVICE.pic_date_active field */
    if(!nonNullOnly || (PicDateActive != null))  _PicDateActiveSet = flag;
  /** SERVICE.parent_account_no field */
    if(!nonNullOnly || (ParentAccountInternalId != null))  _ParentAccountInternalIdSet = flag;
  /** SERVICE.pop_units field */
    if(!nonNullOnly || (PopUnits != null))  _PopUnitsSet = flag;
  /** SERVICE.privacy_level field */
    if(!nonNullOnly || (PrivacyLevel != null))  _PrivacyLevelSet = flag;
  /** SERVICE.restricted_pic field */
    if(!nonNullOnly || (RestrictedPic != null))  _RestrictedPicSet = flag;
  /** SERVICE.service_name_pre field */
    if(!nonNullOnly || (ServiceNamePre != null))  _ServiceNamePreSet = flag;
  /** SERVICE.service_fname field */
    if(!nonNullOnly || (ServiceFname != null))  _ServiceFnameSet = flag;
  /** SERVICE.service_minit field */
    if(!nonNullOnly || (ServiceMinit != null))  _ServiceMinitSet = flag;
  /** SERVICE.service_lname field */
    if(!nonNullOnly || (ServiceLname != null))  _ServiceLnameSet = flag;
  /** SERVICE.service_name_generation field */
    if(!nonNullOnly || (ServiceNameGeneration != null))  _ServiceNameGenerationSet = flag;
  /** SERVICE.service_company field */
    if(!nonNullOnly || (ServiceCompany != null))  _ServiceCompanySet = flag;
  /** SERVICE.service_phone field */
    if(!nonNullOnly || (ServicePhone != null))  _ServicePhoneSet = flag;
  /** SERVICE.service_phone2 field */
    if(!nonNullOnly || (ServicePhone2 != null))  _ServicePhone2Set = flag;
  /** SERVICE.sales_channel_id field */
    if(!nonNullOnly || (SalesChannelId != null))  _SalesChannelIdSet = flag;
  /** SERVICE.sim_serial_number field */
    if(!nonNullOnly || (SimSerialNumber != null))  _SimSerialNumberSet = flag;
  /** SERVICE.switch_id field */
    if(!nonNullOnly || (SwitchId != null))  _SwitchIdSet = flag;
  /** SERVICE.is_prepaid field */
    if(!nonNullOnly || (IsPrepaid != null))  _IsPrepaidSet = flag;
  /** SERVICE.service_active_dt field */
    if(!nonNullOnly || (ServiceActiveDt != null))  _ServiceActiveDtSet = flag;
  /** SERVICE.service_inactive_dt field */
    if(!nonNullOnly || (ServiceInactiveDt != null))  _ServiceInactiveDtSet = flag;
  /** SERVICE.view_id field */
    if(!nonNullOnly || (ViewId != null))  _ViewIdSet = flag;
      super.resetFlags(flag, nonNullOnly);
    
  }
}
