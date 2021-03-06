/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCreateOutputData noOpInIn) {
    super(id, context, "AccountCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCreateOutputData", AccountCreateOutputHelper.toMap(noOpIn).get("AccountCreateOutputData"));
    }
  }
/**
 *
 * Sets the  AccountCreateOutputData
 * @param noOpInIn AccountCreateOutputData to set
 *
 */
  public void setAccountCreateOutputData(AccountCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCreateOutputData getAccountCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCreateOutputHelper.fromMap(inputMap);
  }
}
