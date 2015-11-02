/*
 * Generated code DO NOT EDIT
 * Generated file: AccountLocateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountLocateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountLocateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountLocateObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountLocateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountLocateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountLocateObjectData noOpInIn) {
    super(id, context, "AccountLocateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountLocate", AccountLocateObjectHelper.toMap(noOpIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
/**
 *
 * Sets the  AccountLocate
 * @param noOpInIn AccountLocateObjectData to set
 *
 */
  public void setAccountLocate(AccountLocateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountLocate passed into the constructor
 * @return Simulated response
 *
 */
  public AccountLocateObjectData getAccountLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountLocateObjectHelper.fromMap(inputMap, "AccountLocate");
  }
}
