/*
 * Generated code DO NOT EDIT
 * Generated file: DepositGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DepositGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositObjectData noOpIn;

/**
 *
 * Constructor to create a   DepositGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectData noOpInIn) {
    super(id, context, "DepositGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Deposit", DepositObjectHelper.toMap(noOpIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }
/**
 *
 * Sets the  Deposit
 * @param noOpInIn DepositObjectData to set
 *
 */
  public void setDeposit(DepositObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Deposit passed into the constructor
 * @return Simulated response
 *
 */
  public DepositObjectData getDeposit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepositObjectHelper.fromMap(inputMap, "Deposit");
  }
}
