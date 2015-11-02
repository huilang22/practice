/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCreateBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a AccountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDObjectData acIn;
  protected PaymentProfileObjectData _____PaymentProfile;
  protected Integer billingSC;
  protected Integer remitSC;
  protected Integer inquirySC;
  protected Integer collectionSC;
  protected Integer printSC;
  protected Integer server_category;
/**
 *
 * Constructor to create a  AccountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectData acInIn, PaymentProfileObjectData _____PaymentProfileIn, Integer billingSCIn, Integer remitSCIn, Integer inquirySCIn, Integer collectionSCIn, Integer printSCIn, Integer server_categoryIn) {
    super(id, context, "AccountCreate");
    acIn = acInIn;
    _____PaymentProfile = _____PaymentProfileIn;
    billingSC = billingSCIn;
    remitSC = remitSCIn;
    inquirySC = inquirySCIn;
    collectionSC = collectionSCIn;
    printSC = printSCIn;
    server_category = server_categoryIn;
  }

  public void translateToMap() {
    if (acIn != null) {
      acIn.resetFlags(true, true);
      addInput("Account", AccountXIDObjectHelper.toMap(acIn, new HashMap(), "AccountCreateOutputData").get("AccountCreateOutputData"));
    }
    if (_____PaymentProfile != null) {
      _____PaymentProfile.resetFlags(true, true);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(_____PaymentProfile, new HashMap(), "AccountCreateOutputData").get("AccountCreateOutputData"));
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
    if (server_category != null) {
      addInput("ServerCategory", server_category);
    }
  }


/**
 *
 * Sets the Account
 * @param acInIn Value of the acIn
 *
 */

  public void setAccount(AccountXIDObjectData acInIn) {
    acIn = acInIn;
  }

/**
 *
 * Sets the PaymentProfile
 * @param _____PaymentProfileIn Value of the _____PaymentProfile
 *
 */

  public void setPaymentProfile(PaymentProfileObjectData _____PaymentProfileIn) {
    _____PaymentProfile = _____PaymentProfileIn;
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

/**
 *
 * Sets the ServerCategory
 * @param server_categoryIn Value of the server_category
 *
 */

  public void setServerCategory(Integer server_categoryIn) {
    server_category = server_categoryIn;
  }

  public void translateFromMap() {
    acIn = AccountXIDObjectHelper.fromMap(inputMap, "Account");
    _____PaymentProfile = PaymentProfileObjectHelper.fromMap(inputMap, "PaymentProfile");
    billingSC = (Integer)inputMap.get("BillingServiceCenterId");
    remitSC = (Integer)inputMap.get("RemitServiceCenterId");
    inquirySC = (Integer)inputMap.get("InquiryServiceCenterId");
    collectionSC = (Integer)inputMap.get("CollectionServiceCenterId");
    printSC = (Integer)inputMap.get("PrintServiceCenterId");
    server_category = (Integer)inputMap.get("ServerCategory");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDObjectData getAccount( ) {
    return acIn;
  }

/**
 *
 * Gets the PaymentProfile
 * @return Value of the PaymentProfile
 *
 */

  public PaymentProfileObjectData getPaymentProfile( ) {
    return _____PaymentProfile;
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

/**
 *
 * Gets the ServerCategory
 * @return Value of the ServerCategory
 *
 */

  public Integer getServerCategory( ) {
    return server_category;
  }

}
