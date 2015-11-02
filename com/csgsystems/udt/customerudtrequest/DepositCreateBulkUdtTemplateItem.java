/*
 * Generated code DO NOT EDIT
 * Generated file: DepositCreateBulkUdtTemplateItem.java
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
 * Class used to create a DepositCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositObjectData depositCreateIn;
/**
 *
 * Constructor to create a  DepositCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectData depositCreateInIn) {
    super(id, context, "DepositCreate");
    depositCreateIn = depositCreateInIn;
  }

  public void translateToMap() {
    if (depositCreateIn != null) {
      depositCreateIn.resetFlags(true, true);
      addInput("Deposit", DepositObjectHelper.toMap(depositCreateIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }


/**
 *
 * Sets the Deposit
 * @param depositCreateInIn Value of the depositCreateIn
 *
 */

  public void setDeposit(DepositObjectData depositCreateInIn) {
    depositCreateIn = depositCreateInIn;
  }

  public void translateFromMap() {
    depositCreateIn = DepositObjectHelper.fromMap(inputMap, "Deposit");
  }

/**
 *
 * Gets the Deposit
 * @return Value of the Deposit
 *
 */

  public DepositObjectData getDeposit( ) {
    return depositCreateIn;
  }

}
