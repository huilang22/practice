/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysGetBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a NonWorkDaysGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NonWorkDaysGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NonWorkDaysObjectKeyData NonWorkDaysGetIn;
/**
 *
 * Constructor to create a  NonWorkDaysGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NonWorkDaysGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectKeyData NonWorkDaysGetInIn) {
    super(id, context, "NonWorkDaysGet");
    NonWorkDaysGetIn = NonWorkDaysGetInIn;
  }

  public void translateToMap() {
    if (NonWorkDaysGetIn != null) {
      NonWorkDaysGetIn.resetFlags(true, true);
      addInput("NonWorkDays", NonWorkDaysObjectKeyHelper.toMap(NonWorkDaysGetIn, new HashMap(), "NonWorkDaysObjectKeyData").get("NonWorkDaysObjectKeyData"));
    }
  }


/**
 *
 * Sets the NonWorkDays
 * @param NonWorkDaysGetInIn Value of the NonWorkDaysGetIn
 *
 */

  public void setNonWorkDays(NonWorkDaysObjectKeyData NonWorkDaysGetInIn) {
    NonWorkDaysGetIn = NonWorkDaysGetInIn;
  }

  public void translateFromMap() {
    NonWorkDaysGetIn = NonWorkDaysObjectKeyHelper.fromMap(inputMap, "NonWorkDays");
  }

/**
 *
 * Gets the NonWorkDays
 * @return Value of the NonWorkDays
 *
 */

  public NonWorkDaysObjectKeyData getNonWorkDays( ) {
    return NonWorkDaysGetIn;
  }

}
