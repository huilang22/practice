/*
 * Generated code DO NOT EDIT
 * Generated file: AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountDisconnectChargeServiceAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountDisconnectChargeServiceAmountGetOutputData noOpInIn) {
    super(id, context, "AccountDisconnectChargeServiceAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountDisconnectChargeServiceAmountGetOutputData", AccountDisconnectChargeServiceAmountGetOutputHelper.toMap(noOpIn).get("AccountDisconnectChargeServiceAmountGetOutputData"));
    }
  }
/**
 *
 * Sets the  AccountDisconnectChargeServiceAmountGetOutputData
 * @param noOpInIn AccountDisconnectChargeServiceAmountGetOutputData to set
 *
 */
  public void setAccountDisconnectChargeServiceAmountGetOutputData(AccountDisconnectChargeServiceAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountDisconnectChargeServiceAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeServiceAmountGetOutputData getAccountDisconnectChargeServiceAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(inputMap);
  }
}
