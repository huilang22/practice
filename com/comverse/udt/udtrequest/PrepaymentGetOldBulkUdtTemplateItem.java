/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentGetOldBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentGetOldBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentGetOldBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectKeyData getOldIn;
/**
 *
 * Constructor to create a  PrepaymentGetOldBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentGetOldBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectKeyData getOldInIn) {
    super(id, context, "PrepaymentGetOld");
    getOldIn = getOldInIn;
  }

  public void translateToMap() {
    if (getOldIn != null) {
      getOldIn.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(getOldIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Prepayment
 * @param getOldInIn Value of the getOldIn
 *
 */

  public void setPrepayment(PrepaymentObjectKeyData getOldInIn) {
    getOldIn = getOldInIn;
  }

  public void translateFromMap() {
    getOldIn = PrepaymentObjectKeyHelper.fromMap(inputMap, "Prepayment");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectKeyData getPrepayment( ) {
    return getOldIn;
  }

}
