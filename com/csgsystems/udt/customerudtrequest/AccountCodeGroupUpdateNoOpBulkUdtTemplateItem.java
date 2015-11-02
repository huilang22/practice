/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeGroupUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeGroupUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCodeGroupUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeGroupUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectData noOpInIn) {
    super(id, context, "AccountCodeGroupUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(noOpIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
/**
 *
 * Sets the  AccountCodeGroup
 * @param noOpInIn AccountCodeGroupObjectData to set
 *
 */
  public void setAccountCodeGroup(AccountCodeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCodeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeGroupObjectData getAccountCodeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeGroupObjectHelper.fromMap(inputMap, "AccountCodeGroup");
  }
}
