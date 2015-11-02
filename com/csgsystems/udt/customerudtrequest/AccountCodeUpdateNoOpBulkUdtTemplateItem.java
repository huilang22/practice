/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectData noOpInIn) {
    super(id, context, "AccountCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(noOpIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
/**
 *
 * Sets the  AccountCode
 * @param noOpInIn AccountCodeObjectData to set
 *
 */
  public void setAccountCode(AccountCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCode passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeObjectData getAccountCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeObjectHelper.fromMap(inputMap, "AccountCode");
  }
}
