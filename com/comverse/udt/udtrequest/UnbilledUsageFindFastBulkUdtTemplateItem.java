/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindFastBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageFindFastBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindFastBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsageffindIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindFastBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindFastBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindInIn) {
    super(id, context, "UnbilledUsageFindFast");
    UnbilledUsageffindIn = UnbilledUsageffindInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageffindIn != null) {
      Integer index =  UnbilledUsageffindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsageffindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageffindInIn Value of the UnbilledUsageffindIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsageffindInIn) {
    UnbilledUsageffindIn = UnbilledUsageffindInIn;
  }

  public void translateFromMap() {
    UnbilledUsageffindIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageffindIn;
  }

}
