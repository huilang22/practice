/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositGetBulkUdtTemplateItem.java
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
 * Class used to create a DepositGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositObjectKeyData depositGetIn;
/**
 *
 * Constructor to create a  DepositGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectKeyData depositGetInIn) {
    super(id, context, "DepositGet");
    depositGetIn = depositGetInIn;
  }

  public void translateToMap() {
    if (depositGetIn != null) {
      depositGetIn.resetFlags(true, true);
      addInput("Deposit", DepositObjectKeyHelper.toMap(depositGetIn, new HashMap(), "DepositObjectKeyData").get("DepositObjectKeyData"));
    }
  }


/**
 *
 * Sets the Deposit
 * @param depositGetInIn Value of the depositGetIn
 *
 */

  public void setDeposit(DepositObjectKeyData depositGetInIn) {
    depositGetIn = depositGetInIn;
  }

  public void translateFromMap() {
    depositGetIn = DepositObjectKeyHelper.fromMap(inputMap, "Deposit");
  }

/**
 *
 * Gets the Deposit
 * @return Value of the Deposit
 *
 */

  public DepositObjectKeyData getDeposit( ) {
    return depositGetIn;
  }

}
