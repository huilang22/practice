/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedAccountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedAccountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDObjectData oacAccountIn;
  protected PaymentProfileObjectData _PaymentProfile;
  protected OrderObjectData oacOrderIn;
  protected Boolean oacVerboseResponse;
  protected Integer billingSC;
  protected Integer remitSC;
  protected Integer inquirySC;
  protected Integer collectionSC;
  protected Integer printSC;
/**
 *
 * Constructor to create a  OrderedAccountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedAccountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectData oacAccountInIn, PaymentProfileObjectData _PaymentProfileIn, OrderObjectData oacOrderInIn, Boolean oacVerboseResponseIn, Integer billingSCIn, Integer remitSCIn, Integer inquirySCIn, Integer collectionSCIn, Integer printSCIn) {
    super(id, context, "OrderedAccountCreate");
    oacAccountIn = oacAccountInIn;
    _PaymentProfile = _PaymentProfileIn;
    oacOrderIn = oacOrderInIn;
    oacVerboseResponse = oacVerboseResponseIn;
    billingSC = billingSCIn;
    remitSC = remitSCIn;
    inquirySC = inquirySCIn;
    collectionSC = collectionSCIn;
    printSC = printSCIn;
  }

  public void translateToMap() {
    if (oacAccountIn != null) {
      oacAccountIn.resetFlags(true, true);
      addInput("Account", AccountXIDObjectHelper.toMap(oacAccountIn, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (_PaymentProfile != null) {
      _PaymentProfile.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(_PaymentProfile, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (oacOrderIn != null) {
      oacOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oacOrderIn, new HashMap(), "OrderedAccountCreateOutputData").get("OrderedAccountCreateOutputData"));
    }
    if (oacVerboseResponse != null) {
      addInput("VerboseResponse", oacVerboseResponse);
    }
    if (billingSC != null) {
      addInput("BillingServiceCenterId", billingSC);
    }
    if (remitSC != null) {
      addInput("RemitServiceCenterId", remitSC);
    }
    if (inquirySC != null) {
      addInput("InquiryServiceCenterId", inquirySC);
    }
    if (collectionSC != null) {
      addInput("CollectionServiceCenterId", collectionSC);
    }
    if (printSC != null) {
      addInput("PrintServiceCenterId", printSC);
    }
  }


/**
 *
 * Sets the Account
 * @param oacAccountInIn Value of the oacAccountIn
 *
 */

  public void setAccount(AccountXIDObjectData oacAccountInIn) {
    oacAccountIn = oacAccountInIn;
  }

/**
 *
 * Sets the PaymentProfile
 * @param _PaymentProfileIn Value of the _PaymentProfile
 *
 */

  public void setPaymentProfile(PaymentProfileObjectData _PaymentProfileIn) {
    _PaymentProfile = _PaymentProfileIn;
  }

/**
 *
 * Sets the Order
 * @param oacOrderInIn Value of the oacOrderIn
 *
 */

  public void setOrder(OrderObjectData oacOrderInIn) {
    oacOrderIn = oacOrderInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oacVerboseResponseIn Value of the oacVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oacVerboseResponseIn) {
    oacVerboseResponse = oacVerboseResponseIn;
  }

/**
 *
 * Sets the BillingServiceCenterId
 * @param billingSCIn Value of the billingSC
 *
 */

  public void setBillingServiceCenterId(Integer billingSCIn) {
    billingSC = billingSCIn;
  }

/**
 *
 * Sets the RemitServiceCenterId
 * @param remitSCIn Value of the remitSC
 *
 */

  public void setRemitServiceCenterId(Integer remitSCIn) {
    remitSC = remitSCIn;
  }

/**
 *
 * Sets the InquiryServiceCenterId
 * @param inquirySCIn Value of the inquirySC
 *
 */

  public void setInquiryServiceCenterId(Integer inquirySCIn) {
    inquirySC = inquirySCIn;
  }

/**
 *
 * Sets the CollectionServiceCenterId
 * @param collectionSCIn Value of the collectionSC
 *
 */

  public void setCollectionServiceCenterId(Integer collectionSCIn) {
    collectionSC = collectionSCIn;
  }

/**
 *
 * Sets the PrintServiceCenterId
 * @param printSCIn Value of the printSC
 *
 */

  public void setPrintServiceCenterId(Integer printSCIn) {
    printSC = printSCIn;
  }

  public void translateFromMap() {
    oacAccountIn = AccountXIDObjectHelper.fromMap(inputMap, "Account");
    _PaymentProfile = PaymentProfileObjectHelper.fromMap(inputMap, "PaymentProfile");
    oacOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oacVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
    billingSC = (Integer)inputMap.get("BillingServiceCenterId");
    remitSC = (Integer)inputMap.get("RemitServiceCenterId");
    inquirySC = (Integer)inputMap.get("InquiryServiceCenterId");
    collectionSC = (Integer)inputMap.get("CollectionServiceCenterId");
    printSC = (Integer)inputMap.get("PrintServiceCenterId");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDObjectData getAccount( ) {
    return oacAccountIn;
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectData getPaymentProfile( ) {
    return _PaymentProfile;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oacOrderIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oacVerboseResponse;
  }

/**
 *
 * Gets the BillingServiceCenterId
 * @return Value of the BillingServiceCenterId
 *
 */

  public Integer getBillingServiceCenterId( ) {
    return billingSC;
  }

/**
 *
 * Gets the RemitServiceCenterId
 * @return Value of the RemitServiceCenterId
 *
 */

  public Integer getRemitServiceCenterId( ) {
    return remitSC;
  }

/**
 *
 * Gets the InquiryServiceCenterId
 * @return Value of the InquiryServiceCenterId
 *
 */

  public Integer getInquiryServiceCenterId( ) {
    return inquirySC;
  }

/**
 *
 * Gets the CollectionServiceCenterId
 * @return Value of the CollectionServiceCenterId
 *
 */

  public Integer getCollectionServiceCenterId( ) {
    return collectionSC;
  }

/**
 *
 * Gets the PrintServiceCenterId
 * @return Value of the PrintServiceCenterId
 *
 */

  public Integer getPrintServiceCenterId( ) {
    return printSC;
  }

}
