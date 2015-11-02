/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysCreateBulkUdtTemplateItem.java
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
 * Class used to create a NonWorkDaysCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NonWorkDaysCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NonWorkDaysObjectData NonWorkDaysCreateIn;
/**
 *
 * Constructor to create a  NonWorkDaysCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NonWorkDaysCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectData NonWorkDaysCreateInIn) {
    super(id, context, "NonWorkDaysCreate");
    NonWorkDaysCreateIn = NonWorkDaysCreateInIn;
  }

  public void translateToMap() {
    if (NonWorkDaysCreateIn != null) {
      NonWorkDaysCreateIn.resetFlags(true, true);
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysCreateIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }


/**
 *
 * Sets the NonWorkDays
 * @param NonWorkDaysCreateInIn Value of the NonWorkDaysCreateIn
 *
 */

  public void setNonWorkDays(NonWorkDaysObjectData NonWorkDaysCreateInIn) {
    NonWorkDaysCreateIn = NonWorkDaysCreateInIn;
  }

  public void translateFromMap() {
    NonWorkDaysCreateIn = NonWorkDaysObjectHelper.fromMap(inputMap, "NonWorkDays");
  }

/**
 *
 * Gets the NonWorkDays
 * @return Value of the NonWorkDays
 *
 */

  public NonWorkDaysObjectData getNonWorkDays( ) {
    return NonWorkDaysCreateIn;
  }

}
