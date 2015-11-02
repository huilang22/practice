/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a DepositCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositObjectData noOpIn;

/**
 *
 * Constructor to create a   DepositCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectData noOpInIn) {
    super(id, context, "DepositCreate");
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
