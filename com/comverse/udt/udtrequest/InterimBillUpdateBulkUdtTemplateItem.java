/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectData intBillUpdateIn;
/**
 *
 * Constructor to create a  InterimBillUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectData intBillUpdateInIn) {
    super(id, context, "InterimBillUpdate");
    intBillUpdateIn = intBillUpdateInIn;
  }

  public void translateToMap() {
    if (intBillUpdateIn != null) {
      intBillUpdateIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillUpdateIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param intBillUpdateInIn Value of the intBillUpdateIn
 *
 */

  public void setInterimBill(InterimBillObjectData intBillUpdateInIn) {
    intBillUpdateIn = intBillUpdateInIn;
  }

  public void translateFromMap() {
    intBillUpdateIn = InterimBillObjectHelper.fromMap(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectData getInterimBill( ) {
    return intBillUpdateIn;
  }

}
