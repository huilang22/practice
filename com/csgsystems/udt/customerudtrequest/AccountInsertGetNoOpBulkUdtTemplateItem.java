/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountInsertGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountInsertGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountInsertObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountInsertGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountInsertGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectData noOpInIn) {
    super(id, context, "AccountInsertGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(noOpIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
/**
 *
 * Sets the  AccountInsert
 * @param noOpInIn AccountInsertObjectData to set
 *
 */
  public void setAccountInsert(AccountInsertObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountInsert passed into the constructor
 * @return Simulated response
 *
 */
  public AccountInsertObjectData getAccountInsert() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountInsertObjectHelper.fromMap(inputMap, "AccountInsert");
  }
}
