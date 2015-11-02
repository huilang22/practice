/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PlanIdCreditCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdCreditCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PlanIdCreditObjectData picCrIn;
/**
 *
 * Constructor to create a  PlanIdCreditCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdCreditCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PlanIdCreditObjectData picCrInIn) {
    super(id, context, "PlanIdCreditCreate");
    picCrIn = picCrInIn;
  }

  public void translateToMap() {
    if (picCrIn != null) {
      picCrIn.resetFlags(true, true);
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picCrIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }


/**
 *
 * Sets the PlanIdCredit
 * @param picCrInIn Value of the picCrIn
 *
 */

  public void setPlanIdCredit(PlanIdCreditObjectData picCrInIn) {
    picCrIn = picCrInIn;
  }

  public void translateFromMap() {
    picCrIn = PlanIdCreditObjectHelper.fromMap(inputMap, "PlanIdCredit");
  }

/**
 *
 * Gets the PlanIdCredit
 * @return Value of the PlanIdCredit
 *
 */

  public PlanIdCreditObjectData getPlanIdCredit( ) {
    return picCrIn;
  }

}
