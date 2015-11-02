/*
 * Generated code DO NOT EDIT
 * Generated file: DepositReturnBulkUdtTemplateItem.java
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
 * Class used to create a DepositReturnBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositReturnBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositObjectData depositReturnIn;
/**
 *
 * Constructor to create a  DepositReturnBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositReturnBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectData depositReturnInIn) {
    super(id, context, "DepositReturn");
    depositReturnIn = depositReturnInIn;
  }

  public void translateToMap() {
    if (depositReturnIn != null) {
      depositReturnIn.resetFlags(true, true);
      addInput("Deposit", DepositObjectHelper.toMap(depositReturnIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }


/**
 *
 * Sets the Deposit
 * @param depositReturnInIn Value of the depositReturnIn
 *
 */

  public void setDeposit(DepositObjectData depositReturnInIn) {
    depositReturnIn = depositReturnInIn;
  }

  public void translateFromMap() {
    depositReturnIn = DepositObjectHelper.fromMap(inputMap, "Deposit");
  }

/**
 *
 * Gets the Deposit
 * @return Value of the Deposit
 *
 */

  public DepositObjectData getDeposit( ) {
    return depositReturnIn;
  }

}
