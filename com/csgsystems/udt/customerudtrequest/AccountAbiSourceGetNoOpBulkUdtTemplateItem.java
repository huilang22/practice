/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountAbiSourceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountAbiSourceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountAbiSourceObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountAbiSourceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountAbiSourceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectData noOpInIn) {
    super(id, context, "AccountAbiSourceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(noOpIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
/**
 *
 * Sets the  AccountAbiSource
 * @param noOpInIn AccountAbiSourceObjectData to set
 *
 */
  public void setAccountAbiSource(AccountAbiSourceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountAbiSource passed into the constructor
 * @return Simulated response
 *
 */
  public AccountAbiSourceObjectData getAccountAbiSource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountAbiSourceObjectHelper.fromMap(inputMap, "AccountAbiSource");
  }
}
