/*
 * Generated code DO NOT EDIT
 * Generated file: AccountDisconnectChargeAmountGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AccountDisconnectChargeAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountDisconnectChargeAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountDisconnectChargeAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountDisconnectChargeAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountDisconnectChargeAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountDisconnectChargeAmountGetOutputData noOpInIn) {
    super(id, context, "AccountDisconnectChargeAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountDisconnectChargeAmountGetOutputData", AccountDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("AccountDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Sets the  AccountDisconnectChargeAmountGetOutputData
 * @param noOpInIn AccountDisconnectChargeAmountGetOutputData to set
 *
 */
  public void setAccountDisconnectChargeAmountGetOutputData(AccountDisconnectChargeAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeAmountGetOutputData getAccountDisconnectChargeAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountDisconnectChargeAmountGetOutputHelper.fromMap(inputMap);
  }
}
