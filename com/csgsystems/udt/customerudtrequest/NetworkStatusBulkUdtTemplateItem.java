/*
 * Generated code DO NOT EDIT
 * Generated file: NetworkStatusBulkUdtTemplateItem.java
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
 * Class used to create a NetworkStatusBulkUdtTemplateItem Bulk Template
 *
 */

public class NetworkStatusBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData agnsIn;
  protected Date effectiveDate;
/**
 *
 * Constructor to create a  NetworkStatusBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NetworkStatusBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData agnsInIn, Date effectiveDateIn) {
    super(id, context, "NetworkStatus");
    agnsIn = agnsInIn;
    effectiveDate = effectiveDateIn;
  }

  public void translateToMap() {
    if (agnsIn != null) {
      agnsIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(agnsIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (effectiveDate != null) {
      addInput("EffectiveDate", effectiveDate);
    }
  }


/**
 *
 * Sets the Account
 * @param agnsInIn Value of the agnsIn
 *
 */

  public void setAccount(AccountObjectKeyData agnsInIn) {
    agnsIn = agnsInIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effectiveDateIn Value of the effectiveDate
 *
 */

  public void setEffectiveDate(Date effectiveDateIn) {
    effectiveDate = effectiveDateIn;
  }

  public void translateFromMap() {
    agnsIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
    effectiveDate = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return agnsIn;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effectiveDate;
  }

}
