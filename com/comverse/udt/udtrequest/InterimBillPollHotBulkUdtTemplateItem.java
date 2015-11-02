/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillPollHotBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillPollHotBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillPollHotBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectData intBillPollIn;
/**
 *
 * Constructor to create a  InterimBillPollHotBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillPollHotBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectData intBillPollInIn) {
    super(id, context, "InterimBillPollHot");
    intBillPollIn = intBillPollInIn;
  }

  public void translateToMap() {
    if (intBillPollIn != null) {
      intBillPollIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillPollIn, new HashMap(), "InterimBillPollHotOutputData").get("InterimBillPollHotOutputData"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param intBillPollInIn Value of the intBillPollIn
 *
 */

  public void setInterimBill(InterimBillObjectData intBillPollInIn) {
    intBillPollIn = intBillPollInIn;
  }

  public void translateFromMap() {
    intBillPollIn = InterimBillObjectHelper.fromMap(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectData getInterimBill( ) {
    return intBillPollIn;
  }

}
