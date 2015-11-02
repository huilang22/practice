/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentMapObjectData.java
 * Definition File: Admin/AccountSegmentMap.xml
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
  
/** AccountSegmentMapObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class AccountSegmentMapObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public AccountSegmentMapObjectKeyData Key = null;
  /** ACCT_SEG_MAP.mkt_code field */
  public    Integer MktCode  = null;
  protected boolean _MktCodeSet = false;
  /** ACCT_SEG_MAP.franchise_code field */
  public    Integer FranchiseCode  = null;
  protected boolean _FranchiseCodeSet = false;
  /** ACCT_SEG_MAP.rev_rcv_cost_ctr field */
  public    Integer RevRcvCostCtr  = null;
  protected boolean _RevRcvCostCtrSet = false;
  /** ACCT_SEG_MAP.remit_service_center field */
  public    Integer RemitServiceCenter  = null;
  protected boolean _RemitServiceCenterSet = false;
  /** ACCT_SEG_MAP.billing_service_center field */
  public    Integer BillingServiceCenter  = null;
  protected boolean _BillingServiceCenterSet = false;
  /** ACCT_SEG_MAP.service_inquiry_center field */
  public    Integer ServiceInquiryCenter  = null;
  protected boolean _ServiceInquiryCenterSet = false;
  /** ACCT_SEG_MAP.collections_center field */
  public    Integer CollectionsCenter  = null;
  protected boolean _CollectionsCenterSet = false;
  /** ACCT_SEG_MAP.msg_grp_id field */
  public    Integer MsgGrpId  = null;
  protected boolean _MsgGrpIdSet = false;
  /** ACCT_SEG_MAP.insert_grp_id field */
  public    Integer InsertGrpId  = null;
  protected boolean _InsertGrpIdSet = false;
  /** ACCT_SEG_MAP.vip_code field */
  public    Integer VipCode  = null;
  protected boolean _VipCodeSet = false;
  /** ACCT_SEG_MAP.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** ACCT_SEG_MAP.config_tag_id field */
  public    String ConfigTagId  = null;
  protected boolean _ConfigTagIdSet = false;
  private String _objName = "AccountSegmentMapObjectData";
  /** Default constructor */
  public AccountSegmentMapObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public AccountSegmentMapObjectData (AccountSegmentMapObjectData other)
  {

    if (other == null) return;
    this.Key = new AccountSegmentMapObjectKeyData (other.Key);
    this.MktCode = other.MktCode;
    this._MktCodeSet = other._MktCodeSet;
    this.FranchiseCode = other.FranchiseCode;
    this._FranchiseCodeSet = other._FranchiseCodeSet;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this._RevRcvCostCtrSet = other._RevRcvCostCtrSet;
    this.RemitServiceCenter = other.RemitServiceCenter;
    this._RemitServiceCenterSet = other._RemitServiceCenterSet;
    this.BillingServiceCenter = other.BillingServiceCenter;
    this._BillingServiceCenterSet = other._BillingServiceCenterSet;
    this.ServiceInquiryCenter = other.ServiceInquiryCenter;
    this._ServiceInquiryCenterSet = other._ServiceInquiryCenterSet;
    this.CollectionsCenter = other.CollectionsCenter;
    this._CollectionsCenterSet = other._CollectionsCenterSet;
    this.MsgGrpId = other.MsgGrpId;
    this._MsgGrpIdSet = other._MsgGrpIdSet;
    this.InsertGrpId = other.InsertGrpId;
    this._InsertGrpIdSet = other._InsertGrpIdSet;
    this.VipCode = other.VipCode;
    this._VipCodeSet = other._VipCodeSet;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.ConfigTagId = other.ConfigTagId;
    this._ConfigTagIdSet = other._ConfigTagIdSet;
  }

  /** get the Key for this object
   * @return AccountSegmentMapObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public AccountSegmentMapObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (AccountSegmentMapObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setAcctSegId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AcctSegId", "setAcctSegId");
    }
    if (this.Key == null) this.Key = new AccountSegmentMapObjectKeyData ();
    this.Key.AcctSegId = value;
    this.Key._AcctSegIdSet = true;
  }
  /** get the value of the field: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return Integer the value
   */
  public Integer getAcctSegId () {
    if (this.Key == null) return null;
    return this.Key.AcctSegId;
  }
  /** Change the field to not being actively set: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   */
  public void unsetAcctSegId () {
    if (this.Key == null) return;
    this.Key._AcctSegIdSet = false;
  }
  /** See if the field is actively set: AcctSegId (ACCT_SEG_MAP.acct_seg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAcctSegId () {
    if (this.Key == null) return false;
    return this.Key._AcctSegIdSet;
  }

  /** Retrieves the AcctSegId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AcctSegId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AcctSegId field
   */
   public String getAcctSegIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAcctSegIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAcctSegId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAcctSegIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AcctSegId field from a formatted string
   *
   * @param _value the AcctSegId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AcctSegId field
   */
   public void setAcctSegIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAcctSegIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAcctSegId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AcctSegId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAcctSegIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAcctSegIdFromFormattedString");
   }

  /** set the fields value: MktCode (ACCT_SEG_MAP.mkt_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MktCode") 
  public void setMktCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MktCode", "setMktCode");
    }
    this.MktCode = value;
    this._MktCodeSet = true;
  }

  /** Retrieves the MktCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MktCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MktCode field
   */
   public String getMktCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMktCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getMktCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMktCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the MktCode field from a formatted string
   *
   * @param _value the MktCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MktCode field
   */
   public void setMktCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMktCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMktCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MktCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMktCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMktCodeFromFormattedString");
   }

  /** get the value of the field: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return Integer the value
   */
  public Integer getMktCode () {
    return this.MktCode;
  }
  /** Change the field to not being actively set: MktCode (ACCT_SEG_MAP.mkt_code)
   */
  public void unsetMktCode () {
    this._MktCodeSet = false;
  }
  /** See if the field is actively set: MktCode (ACCT_SEG_MAP.mkt_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetMktCode () {
    return this._MktCodeSet;
  }
  /** set the fields value: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FranchiseCode") 
  public void setFranchiseCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FranchiseCode", "setFranchiseCode");
    }
    this.FranchiseCode = value;
    this._FranchiseCodeSet = true;
  }

  /** Retrieves the FranchiseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FranchiseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FranchiseCode field
   */
   public String getFranchiseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFranchiseCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFranchiseCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFranchiseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FranchiseCode field from a formatted string
   *
   * @param _value the FranchiseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FranchiseCode field
   */
   public void setFranchiseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFranchiseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFranchiseCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FranchiseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFranchiseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFranchiseCodeFromFormattedString");
   }

  /** get the value of the field: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return Integer the value
   */
  public Integer getFranchiseCode () {
    return this.FranchiseCode;
  }
  /** Change the field to not being actively set: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   */
  public void unsetFranchiseCode () {
    this._FranchiseCodeSet = false;
  }
  /** See if the field is actively set: FranchiseCode (ACCT_SEG_MAP.franchise_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFranchiseCode () {
    return this._FranchiseCodeSet;
  }
  /** set the fields value: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RevRcvCostCtr") 
  public void setRevRcvCostCtr (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RevRcvCostCtr", "setRevRcvCostCtr");
    }
    this.RevRcvCostCtr = value;
    this._RevRcvCostCtrSet = true;
  }

  /** Retrieves the RevRcvCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RevRcvCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RevRcvCostCtr field
   */
   public String getRevRcvCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getRevRcvCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the RevRcvCostCtr field from a formatted string
   *
   * @param _value the RevRcvCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RevRcvCostCtr field
   */
   public void setRevRcvCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRevRcvCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFromFormattedString");
   }

  /** get the value of the field: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getRevRcvCostCtr () {
    return this.RevRcvCostCtr;
  }
  /** Change the field to not being actively set: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   */
  public void unsetRevRcvCostCtr () {
    this._RevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: RevRcvCostCtr (ACCT_SEG_MAP.rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetRevRcvCostCtr () {
    return this._RevRcvCostCtrSet;
  }
  /** set the fields value: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RemitServiceCenter") 
  public void setRemitServiceCenter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RemitServiceCenter", "setRemitServiceCenter");
    }
    this.RemitServiceCenter = value;
    this._RemitServiceCenterSet = true;
  }

  /** Retrieves the RemitServiceCenter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RemitServiceCenter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RemitServiceCenter field
   */
   public String getRemitServiceCenterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemitServiceCenterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRemitServiceCenterAsFormattedString");
       return fmtMgr.formatNumber(this.getRemitServiceCenter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RemitServiceCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRemitServiceCenterAsFormattedString");
       throw x;
     }
   }
  /** Sets the RemitServiceCenter field from a formatted string
   *
   * @param _value the RemitServiceCenter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RemitServiceCenter field
   */
   public void setRemitServiceCenterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRemitServiceCenterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRemitServiceCenter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RemitServiceCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRemitServiceCenterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRemitServiceCenterFromFormattedString");
   }

  /** get the value of the field: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return Integer the value
   */
  public Integer getRemitServiceCenter () {
    return this.RemitServiceCenter;
  }
  /** Change the field to not being actively set: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   */
  public void unsetRemitServiceCenter () {
    this._RemitServiceCenterSet = false;
  }
  /** See if the field is actively set: RemitServiceCenter (ACCT_SEG_MAP.remit_service_center)
   * @return boolean whether the field is actively set
   */
  public boolean issetRemitServiceCenter () {
    return this._RemitServiceCenterSet;
  }
  /** set the fields value: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingServiceCenter") 
  public void setBillingServiceCenter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillingServiceCenter", "setBillingServiceCenter");
    }
    this.BillingServiceCenter = value;
    this._BillingServiceCenterSet = true;
  }

  /** Retrieves the BillingServiceCenter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingServiceCenter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingServiceCenter field
   */
   public String getBillingServiceCenterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingServiceCenterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingServiceCenterAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingServiceCenter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingServiceCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingServiceCenterAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingServiceCenter field from a formatted string
   *
   * @param _value the BillingServiceCenter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingServiceCenter field
   */
   public void setBillingServiceCenterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingServiceCenterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingServiceCenter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingServiceCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingServiceCenterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingServiceCenterFromFormattedString");
   }

  /** get the value of the field: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return Integer the value
   */
  public Integer getBillingServiceCenter () {
    return this.BillingServiceCenter;
  }
  /** Change the field to not being actively set: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   */
  public void unsetBillingServiceCenter () {
    this._BillingServiceCenterSet = false;
  }
  /** See if the field is actively set: BillingServiceCenter (ACCT_SEG_MAP.billing_service_center)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingServiceCenter () {
    return this._BillingServiceCenterSet;
  }
  /** set the fields value: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInquiryCenter") 
  public void setServiceInquiryCenter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInquiryCenter", "setServiceInquiryCenter");
    }
    this.ServiceInquiryCenter = value;
    this._ServiceInquiryCenterSet = true;
  }

  /** Retrieves the ServiceInquiryCenter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInquiryCenter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInquiryCenter field
   */
   public String getServiceInquiryCenterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInquiryCenterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInquiryCenterAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInquiryCenter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInquiryCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInquiryCenterAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInquiryCenter field from a formatted string
   *
   * @param _value the ServiceInquiryCenter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInquiryCenter field
   */
   public void setServiceInquiryCenterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInquiryCenterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInquiryCenter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInquiryCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInquiryCenterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInquiryCenterFromFormattedString");
   }

  /** get the value of the field: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return Integer the value
   */
  public Integer getServiceInquiryCenter () {
    return this.ServiceInquiryCenter;
  }
  /** Change the field to not being actively set: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   */
  public void unsetServiceInquiryCenter () {
    this._ServiceInquiryCenterSet = false;
  }
  /** See if the field is actively set: ServiceInquiryCenter (ACCT_SEG_MAP.service_inquiry_center)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInquiryCenter () {
    return this._ServiceInquiryCenterSet;
  }
  /** set the fields value: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CollectionsCenter") 
  public void setCollectionsCenter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CollectionsCenter", "setCollectionsCenter");
    }
    this.CollectionsCenter = value;
    this._CollectionsCenterSet = true;
  }

  /** Retrieves the CollectionsCenter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CollectionsCenter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CollectionsCenter field
   */
   public String getCollectionsCenterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionsCenterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCollectionsCenterAsFormattedString");
       return fmtMgr.formatNumber(this.getCollectionsCenter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionsCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCollectionsCenterAsFormattedString");
       throw x;
     }
   }
  /** Sets the CollectionsCenter field from a formatted string
   *
   * @param _value the CollectionsCenter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CollectionsCenter field
   */
   public void setCollectionsCenterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCollectionsCenterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCollectionsCenter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CollectionsCenter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCollectionsCenterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCollectionsCenterFromFormattedString");
   }

  /** get the value of the field: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return Integer the value
   */
  public Integer getCollectionsCenter () {
    return this.CollectionsCenter;
  }
  /** Change the field to not being actively set: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   */
  public void unsetCollectionsCenter () {
    this._CollectionsCenterSet = false;
  }
  /** See if the field is actively set: CollectionsCenter (ACCT_SEG_MAP.collections_center)
   * @return boolean whether the field is actively set
   */
  public boolean issetCollectionsCenter () {
    return this._CollectionsCenterSet;
  }
  /** set the fields value: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgGrpId") 
  public void setMsgGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgGrpId", "setMsgGrpId");
    }
    this.MsgGrpId = value;
    this._MsgGrpIdSet = true;
  }

  /** Retrieves the MsgGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpId field
   */
   public String getMsgGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgGrpId field from a formatted string
   *
   * @param _value the MsgGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgGrpId field
   */
   public void setMsgGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFromFormattedString");
   }

  /** get the value of the field: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return Integer the value
   */
  public Integer getMsgGrpId () {
    return this.MsgGrpId;
  }
  /** Change the field to not being actively set: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   */
  public void unsetMsgGrpId () {
    this._MsgGrpIdSet = false;
  }
  /** See if the field is actively set: MsgGrpId (ACCT_SEG_MAP.msg_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgGrpId () {
    return this._MsgGrpIdSet;
  }
  /** set the fields value: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InsertGrpId") 
  public void setInsertGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "InsertGrpId", "setInsertGrpId");
    }
    this.InsertGrpId = value;
    this._InsertGrpIdSet = true;
  }

  /** Retrieves the InsertGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InsertGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InsertGrpId field
   */
   public String getInsertGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInsertGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getInsertGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInsertGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the InsertGrpId field from a formatted string
   *
   * @param _value the InsertGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InsertGrpId field
   */
   public void setInsertGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInsertGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInsertGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InsertGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInsertGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInsertGrpIdFromFormattedString");
   }

  /** get the value of the field: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return Integer the value
   */
  public Integer getInsertGrpId () {
    return this.InsertGrpId;
  }
  /** Change the field to not being actively set: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   */
  public void unsetInsertGrpId () {
    this._InsertGrpIdSet = false;
  }
  /** See if the field is actively set: InsertGrpId (ACCT_SEG_MAP.insert_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetInsertGrpId () {
    return this._InsertGrpIdSet;
  }
  /** set the fields value: VipCode (ACCT_SEG_MAP.vip_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VipCode") 
  public void setVipCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VipCode", "setVipCode");
    }
    this.VipCode = value;
    this._VipCodeSet = true;
  }

  /** Retrieves the VipCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VipCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VipCode field
   */
   public String getVipCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVipCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getVipCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVipCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the VipCode field from a formatted string
   *
   * @param _value the VipCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VipCode field
   */
   public void setVipCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVipCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVipCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VipCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVipCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVipCodeFromFormattedString");
   }

  /** get the value of the field: VipCode (ACCT_SEG_MAP.vip_code)
   * @return Integer the value
   */
  public Integer getVipCode () {
    return this.VipCode;
  }
  /** Change the field to not being actively set: VipCode (ACCT_SEG_MAP.vip_code)
   */
  public void unsetVipCode () {
    this._VipCodeSet = false;
  }
  /** See if the field is actively set: VipCode (ACCT_SEG_MAP.vip_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetVipCode () {
    return this._VipCodeSet;
  }
  /** set the fields value: RateClass (ACCT_SEG_MAP.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
    this.RateClass = value;
    this._RateClassSet = true;
  }

  /** Retrieves the RateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClass field
   */
   public String getRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClass field from a formatted string
   *
   * @param _value the RateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClass field
   */
   public void setRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFromFormattedString");
   }

  /** get the value of the field: RateClass (ACCT_SEG_MAP.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (ACCT_SEG_MAP.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (ACCT_SEG_MAP.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConfigTagId") 
  public void setConfigTagId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ConfigTagId", "setConfigTagId");
    }
    this.ConfigTagId = value;
    this._ConfigTagIdSet = true;
  }

  /** Retrieves the ConfigTagId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConfigTagId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConfigTagId field
   */
   public String getConfigTagIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConfigTagIdAsFormattedString");
       return fmtMgr.formatString(this.getConfigTagId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConfigTagIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConfigTagId field from a formatted string
   *
   * @param _value the ConfigTagId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConfigTagId field
   */
   public void setConfigTagIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConfigTagIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConfigTagId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConfigTagId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConfigTagIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConfigTagIdFromFormattedString");
   }

  /** get the value of the field: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return String the value
   */
  public String getConfigTagId () {
    return this.ConfigTagId;
  }
  /** Change the field to not being actively set: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   */
  public void unsetConfigTagId () {
    this._ConfigTagIdSet = false;
  }
  /** See if the field is actively set: ConfigTagId (ACCT_SEG_MAP.config_tag_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetConfigTagId () {
    return this._ConfigTagIdSet;
  }
  public String toString() {
    return AccountSegmentMapObjectHelper.toMap(this, null).toString();
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
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** ACCT_SEG_MAP.mkt_code field */
    if(!nonNullOnly || (MktCode != null))  _MktCodeSet = flag;
  /** ACCT_SEG_MAP.franchise_code field */
    if(!nonNullOnly || (FranchiseCode != null))  _FranchiseCodeSet = flag;
  /** ACCT_SEG_MAP.rev_rcv_cost_ctr field */
    if(!nonNullOnly || (RevRcvCostCtr != null))  _RevRcvCostCtrSet = flag;
  /** ACCT_SEG_MAP.remit_service_center field */
    if(!nonNullOnly || (RemitServiceCenter != null))  _RemitServiceCenterSet = flag;
  /** ACCT_SEG_MAP.billing_service_center field */
    if(!nonNullOnly || (BillingServiceCenter != null))  _BillingServiceCenterSet = flag;
  /** ACCT_SEG_MAP.service_inquiry_center field */
    if(!nonNullOnly || (ServiceInquiryCenter != null))  _ServiceInquiryCenterSet = flag;
  /** ACCT_SEG_MAP.collections_center field */
    if(!nonNullOnly || (CollectionsCenter != null))  _CollectionsCenterSet = flag;
  /** ACCT_SEG_MAP.msg_grp_id field */
    if(!nonNullOnly || (MsgGrpId != null))  _MsgGrpIdSet = flag;
  /** ACCT_SEG_MAP.insert_grp_id field */
    if(!nonNullOnly || (InsertGrpId != null))  _InsertGrpIdSet = flag;
  /** ACCT_SEG_MAP.vip_code field */
    if(!nonNullOnly || (VipCode != null))  _VipCodeSet = flag;
  /** ACCT_SEG_MAP.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** ACCT_SEG_MAP.config_tag_id field */
    if(!nonNullOnly || (ConfigTagId != null))  _ConfigTagIdSet = flag;
  }
}
