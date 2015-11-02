/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillFindBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectFilter findIn;
/**
 *
 * Constructor to create a  InterimBillFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectFilter findInIn) {
    super(id, context, "InterimBillFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InterimBill", InterimBillObjectHelper.toMap(findIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param findInIn Value of the findIn
 *
 */

  public void setInterimBill(InterimBillObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = InterimBillObjectHelper.fromMapFilter(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectFilter getInterimBill( ) {
    return findIn;
  }

}
