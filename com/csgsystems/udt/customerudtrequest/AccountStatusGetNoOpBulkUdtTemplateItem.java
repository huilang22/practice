/*
 * Generated code DO NOT EDIT
 * Generated file: AccountStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountStatusObjectData noOpInIn) {
    super(id, context, "AccountStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(noOpIn, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }
/**
 *
 * Sets the  AccountStatus
 * @param noOpInIn AccountStatusObjectData to set
 *
 */
  public void setAccountStatus(AccountStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountStatus passed into the constructor
 * @return Simulated response
 *
 */
  public AccountStatusObjectData getAccountStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountStatusObjectHelper.fromMap(inputMap, "AccountStatus");
  }
}
