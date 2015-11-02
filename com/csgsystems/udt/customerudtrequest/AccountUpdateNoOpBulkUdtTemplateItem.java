/*
 * Generated code DO NOT EDIT
 * Generated file: AccountUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountXIDObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectData noOpInIn) {
    super(id, context, "AccountUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Account", AccountXIDObjectHelper.toMap(noOpIn, new HashMap(), "Account").get("Account"));
    }
  }
/**
 *
 * Sets the  Account
 * @param noOpInIn AccountXIDObjectData to set
 *
 */
  public void setAccount(AccountXIDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Account passed into the constructor
 * @return Simulated response
 *
 */
  public AccountXIDObjectData getAccount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountXIDObjectHelper.fromMap(inputMap, "Account");
  }
}
