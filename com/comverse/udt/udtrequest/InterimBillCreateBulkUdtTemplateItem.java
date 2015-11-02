/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillCreateBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectData intBillCreateIn;
/**
 *
 * Constructor to create a  InterimBillCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectData intBillCreateInIn) {
    super(id, context, "InterimBillCreate");
    intBillCreateIn = intBillCreateInIn;
  }

  public void translateToMap() {
    if (intBillCreateIn != null) {
      intBillCreateIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillCreateIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param intBillCreateInIn Value of the intBillCreateIn
 *
 */

  public void setInterimBill(InterimBillObjectData intBillCreateInIn) {
    intBillCreateIn = intBillCreateInIn;
  }

  public void translateFromMap() {
    intBillCreateIn = InterimBillObjectHelper.fromMap(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectData getInterimBill( ) {
    return intBillCreateIn;
  }

}
