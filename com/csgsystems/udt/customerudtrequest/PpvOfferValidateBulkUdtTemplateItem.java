/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOfferValidateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a PpvOfferValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvOfferValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvAccountObjectData ___AccountIn;
  protected CtcOfferObjectData Offer;
  protected CtcOrderMethodObjectData OrderMethod;
  protected Boolean IgnoreOrderMethod;
  protected Boolean IgnoreOrderWindow;
  protected Integer CurrencyCode;
  protected String QuickOrderCode;
/**
 *
 * Constructor to create a  PpvOfferValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvOfferValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvAccountObjectData ___AccountInIn, CtcOfferObjectData OfferIn, CtcOrderMethodObjectData OrderMethodIn, Boolean IgnoreOrderMethodIn, Boolean IgnoreOrderWindowIn, Integer CurrencyCodeIn, String QuickOrderCodeIn) {
    super(id, context, "PpvOfferValidate");
    ___AccountIn = ___AccountInIn;
    Offer = OfferIn;
    OrderMethod = OrderMethodIn;
    IgnoreOrderMethod = IgnoreOrderMethodIn;
    IgnoreOrderWindow = IgnoreOrderWindowIn;
    CurrencyCode = CurrencyCodeIn;
    QuickOrderCode = QuickOrderCodeIn;
  }

  public void translateToMap() {
    if (___AccountIn != null) {
      ___AccountIn.resetFlags(true, true);
      addInput("AccountIn", PpvAccountObjectHelper.toMap(___AccountIn, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (Offer != null) {
      Offer.resetFlags(true, true);
      addInput("Offer", CtcOfferObjectHelper.toMap(Offer, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (OrderMethod != null) {
      OrderMethod.resetFlags(true, true);
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(OrderMethod, new HashMap(), "AccountOut").get("AccountOut"));
    }
    if (IgnoreOrderMethod != null) {
      addInput("IgnoreOrderMethod", IgnoreOrderMethod);
    }
    if (IgnoreOrderWindow != null) {
      addInput("IgnoreOrderWindow", IgnoreOrderWindow);
    }
    if (CurrencyCode != null) {
      addInput("CurrencyCode", CurrencyCode);
    }
    if (QuickOrderCode != null) {
      addInput("QuickOrderCode", QuickOrderCode);
    }
  }


/**
 *
 * Sets the AccountIn
 * @param ___AccountInIn Value of the ___AccountIn
 *
 */

  public void setAccountIn(PpvAccountObjectData ___AccountInIn) {
    ___AccountIn = ___AccountInIn;
  }

/**
 *
 * Sets the Offer
 * @param OfferIn Value of the Offer
 *
 */

  public void setOffer(CtcOfferObjectData OfferIn) {
    Offer = OfferIn;
  }

/**
 *
 * Sets the OrderMethod
 * @param OrderMethodIn Value of the OrderMethod
 *
 */

  public void setOrderMethod(CtcOrderMethodObjectData OrderMethodIn) {
    OrderMethod = OrderMethodIn;
  }

/**
 *
 * Sets the IgnoreOrderMethod
 * @param IgnoreOrderMethodIn Value of the IgnoreOrderMethod
 *
 */

  public void setIgnoreOrderMethod(Boolean IgnoreOrderMethodIn) {
    IgnoreOrderMethod = IgnoreOrderMethodIn;
  }

/**
 *
 * Sets the IgnoreOrderWindow
 * @param IgnoreOrderWindowIn Value of the IgnoreOrderWindow
 *
 */

  public void setIgnoreOrderWindow(Boolean IgnoreOrderWindowIn) {
    IgnoreOrderWindow = IgnoreOrderWindowIn;
  }

/**
 *
 * Sets the CurrencyCode
 * @param CurrencyCodeIn Value of the CurrencyCode
 *
 */

  public void setCurrencyCode(Integer CurrencyCodeIn) {
    CurrencyCode = CurrencyCodeIn;
  }

/**
 *
 * Sets the QuickOrderCode
 * @param QuickOrderCodeIn Value of the QuickOrderCode
 *
 */

  public void setQuickOrderCode(String QuickOrderCodeIn) {
    QuickOrderCode = QuickOrderCodeIn;
  }

  public void translateFromMap() {
    ___AccountIn = PpvAccountObjectHelper.fromMap(inputMap, "AccountIn");
    Offer = CtcOfferObjectHelper.fromMap(inputMap, "Offer");
    OrderMethod = CtcOrderMethodObjectHelper.fromMap(inputMap, "OrderMethod");
    IgnoreOrderMethod = (Boolean)inputMap.get("IgnoreOrderMethod");
    IgnoreOrderWindow = (Boolean)inputMap.get("IgnoreOrderWindow");
    CurrencyCode = (Integer)inputMap.get("CurrencyCode");
    QuickOrderCode = (String)inputMap.get("QuickOrderCode");
  }

/**
 *
 * Gets the AccountIn
 * @return Value of the AccountIn
 *
 */

  public PpvAccountObjectData getAccountIn( ) {
    return ___AccountIn;
  }

/**
 *
 * Gets the Offer
 * @return Value of the Offer
 *
 */

  public CtcOfferObjectData getOffer( ) {
    return Offer;
  }

/**
 *
 * Gets the OrderMethod
 * @return Value of the OrderMethod
 *
 */

  public CtcOrderMethodObjectData getOrderMethod( ) {
    return OrderMethod;
  }

/**
 *
 * Gets the IgnoreOrderMethod
 * @return Value of the IgnoreOrderMethod
 *
 */

  public Boolean getIgnoreOrderMethod( ) {
    return IgnoreOrderMethod;
  }

/**
 *
 * Gets the IgnoreOrderWindow
 * @return Value of the IgnoreOrderWindow
 *
 */

  public Boolean getIgnoreOrderWindow( ) {
    return IgnoreOrderWindow;
  }

/**
 *
 * Gets the CurrencyCode
 * @return Value of the CurrencyCode
 *
 */

  public Integer getCurrencyCode( ) {
    return CurrencyCode;
  }

/**
 *
 * Gets the QuickOrderCode
 * @return Value of the QuickOrderCode
 *
 */

  public String getQuickOrderCode( ) {
    return QuickOrderCode;
  }

}
