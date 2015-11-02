/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountMessageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountMessageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountMessageObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountMessageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountMessageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectData noOpInIn) {
    super(id, context, "AccountMessageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(noOpIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
/**
 *
 * Sets the  AccountMessage
 * @param noOpInIn AccountMessageObjectData to set
 *
 */
  public void setAccountMessage(AccountMessageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountMessage passed into the constructor
 * @return Simulated response
 *
 */
  public AccountMessageObjectData getAccountMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountMessageObjectHelper.fromMap(inputMap, "AccountMessage");
  }
}
