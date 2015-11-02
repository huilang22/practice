/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositFindBulkUdtTemplateItem.java
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
 * Class used to create a DepositFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositObjectFilter depositFindIn;
/**
 *
 * Constructor to create a  DepositFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositObjectFilter depositFindInIn) {
    super(id, context, "DepositFind");
    depositFindIn = depositFindInIn;
  }

  public void translateToMap() {
    if (depositFindIn != null) {
      Integer index =  depositFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Deposit", DepositObjectHelper.toMap(depositFindIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }


/**
 *
 * Sets the Deposit
 * @param depositFindInIn Value of the depositFindIn
 *
 */

  public void setDeposit(DepositObjectFilter depositFindInIn) {
    depositFindIn = depositFindInIn;
  }

  public void translateFromMap() {
    depositFindIn = DepositObjectHelper.fromMapFilter(inputMap, "Deposit");
  }

/**
 *
 * Gets the Deposit
 * @return Value of the Deposit
 *
 */

  public DepositObjectFilter getDeposit( ) {
    return depositFindIn;
  }

}
