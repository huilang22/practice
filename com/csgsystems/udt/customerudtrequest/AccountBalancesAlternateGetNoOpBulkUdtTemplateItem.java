/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesAlternateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBalancesAlternateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBalancesAlternateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBalancesObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountBalancesAlternateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBalancesAlternateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData noOpInIn) {
    super(id, context, "AccountBalancesAlternateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(noOpIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
/**
 *
 * Sets the  AccountBalances
 * @param noOpInIn AccountBalancesObjectData to set
 *
 */
  public void setAccountBalances(AccountBalancesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBalances passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalancesObjectData getAccountBalances() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
  }
}
