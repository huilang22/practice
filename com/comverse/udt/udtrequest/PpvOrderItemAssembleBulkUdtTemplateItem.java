/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOrderItemAssembleBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvOrderItemAssembleBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvOrderItemAssembleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvAccountObjectData ____AccountIn;
  protected CtcOfferObjectData _Offer;
  protected CtcOrderMethodObjectData _OrderMethod;
  protected Boolean _IgnoreOrderMethod;
  protected Boolean _IgnoreOrderWindow;
  protected Integer _CurrencyCode;
  protected String _QuickOrderCode;
/**
 *
 * Constructor to create a  PpvOrderItemAssembleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvOrderItemAssembleBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData ____AccountInIn, CtcOfferObjectData _OfferIn, CtcOrderMethodObjectData _OrderMethodIn, Boolean _IgnoreOrderMethodIn, Boolean _IgnoreOrderWindowIn, Integer _CurrencyCodeIn, String _QuickOrderCodeIn) {
    super(id, context, "PpvOrderItemAssemble");
    ____AccountIn = ____AccountInIn;
    _Offer = _OfferIn;
    _OrderMethod = _OrderMethodIn;
    _IgnoreOrderMethod = _IgnoreOrderMethodIn;
    _IgnoreOrderWindow = _IgnoreOrderWindowIn;
    _CurrencyCode = _CurrencyCodeIn;
    _QuickOrderCode = _QuickOrderCodeIn;
  }

  public void translateToMap() {
    if (____AccountIn != null) {
      ____AccountIn.resetFlags(true, true);
      addInput("AccountIn", PpvAccountObjectHelper.toMap(____AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_Offer != null) {
      _Offer.resetFlags(true, true);
      addInput("Offer", CtcOfferObjectHelper.toMap(_Offer, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_OrderMethod != null) {
      _OrderMethod.resetFlags(true, true);
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(_OrderMethod, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (_IgnoreOrderMethod != null) {
      addInput("IgnoreOrderMethod", _IgnoreOrderMethod);
    }
    if (_IgnoreOrderWindow != null) {
      addInput("IgnoreOrderWindow", _IgnoreOrderWindow);
    }
    if (_CurrencyCode != null) {
      addInput("CurrencyCode", _CurrencyCode);
    }
    if (_QuickOrderCode != null) {
      addInput("QuickOrderCode", _QuickOrderCode);
    }
  }


/**
 *
 * Sets the AccountIn
 * @param ____AccountInIn Value of the ____AccountIn
 *
 */

  public void setAccountIn(PpvAccountObjectData ____AccountInIn) {
    ____AccountIn = ____AccountInIn;
  }

/**
 *
 * Sets the Offer
 * @param _OfferIn Value of the _Offer
 *
 */

  public void setOffer(CtcOfferObjectData _OfferIn) {
    _Offer = _OfferIn;
  }

/**
 *
 * Sets the OrderMethod
 * @param _OrderMethodIn Value of the _OrderMethod
 *
 */

  public void setOrderMethod(CtcOrderMethodObjectData _OrderMethodIn) {
    _OrderMethod = _OrderMethodIn;
  }

/**
 *
 * Sets the IgnoreOrderMethod
 * @param _IgnoreOrderMethodIn Value of the _IgnoreOrderMethod
 *
 */

  public void setIgnoreOrderMethod(Boolean _IgnoreOrderMethodIn) {
    _IgnoreOrderMethod = _IgnoreOrderMethodIn;
  }

/**
 *
 * Sets the IgnoreOrderWindow
 * @param _IgnoreOrderWindowIn Value of the _IgnoreOrderWindow
 *
 */

  public void setIgnoreOrderWindow(Boolean _IgnoreOrderWindowIn) {
    _IgnoreOrderWindow = _IgnoreOrderWindowIn;
  }

/**
 *
 * Sets the CurrencyCode
 * @param _CurrencyCodeIn Value of the _CurrencyCode
 *
 */

  public void setCurrencyCode(Integer _CurrencyCodeIn) {
    _CurrencyCode = _CurrencyCodeIn;
  }

/**
 *
 * Sets the QuickOrderCode
 * @param _QuickOrderCodeIn Value of the _QuickOrderCode
 *
 */

  public void setQuickOrderCode(String _QuickOrderCodeIn) {
    _QuickOrderCode = _QuickOrderCodeIn;
  }

  public void translateFromMap() {
    ____AccountIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountIn");
    _Offer = CtcOfferObjectHelper.fromMap(inputMap, "Offer");
    _OrderMethod = CtcOrderMethodObjectHelper.fromMap(inputMap, "OrderMethod");
    _IgnoreOrderMethod = (Boolean)inputMap.get("IgnoreOrderMethod");
    _IgnoreOrderWindow = (Boolean)inputMap.get("IgnoreOrderWindow");
    _CurrencyCode = (Integer)inputMap.get("CurrencyCode");
    _QuickOrderCode = (String)inputMap.get("QuickOrderCode");
  }

/**
 *
 * Gets the AccountIn
 * @return Value of the AccountIn
 *
 */

  public PpvAccountObjectData getAccountIn( ) {
    return ____AccountIn;
  }

/**
 *
 * Gets the Offer
 * @return Value of the Offer
 *
 */

  public CtcOfferObjectData getOffer( ) {
    return _Offer;
  }

/**
 *
 * Gets the OrderMethod
 * @return Value of the OrderMethod
 *
 */

  public CtcOrderMethodObjectData getOrderMethod( ) {
    return _OrderMethod;
  }

/**
 *
 * Gets the IgnoreOrderMethod
 * @return Value of the IgnoreOrderMethod
 *
 */

  public Boolean getIgnoreOrderMethod( ) {
    return _IgnoreOrderMethod;
  }

/**
 *
 * Gets the IgnoreOrderWindow
 * @return Value of the IgnoreOrderWindow
 *
 */

  public Boolean getIgnoreOrderWindow( ) {
    return _IgnoreOrderWindow;
  }

/**
 *
 * Gets the CurrencyCode
 * @return Value of the CurrencyCode
 *
 */

  public Integer getCurrencyCode( ) {
    return _CurrencyCode;
  }

/**
 *
 * Gets the QuickOrderCode
 * @return Value of the QuickOrderCode
 *
 */

  public String getQuickOrderCode( ) {
    return _QuickOrderCode;
  }

}
