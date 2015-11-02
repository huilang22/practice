/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountIdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountIdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountIdObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountIdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountIdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectData noOpInIn) {
    super(id, context, "AccountIdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectHelper.toMap(noOpIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }
/**
 *
 * Sets the  AccountId
 * @param noOpInIn AccountIdObjectData to set
 *
 */
  public void setAccountId(AccountIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountId passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectData getAccountId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountIdObjectHelper.fromMap(inputMap, "AccountId");
  }
}
