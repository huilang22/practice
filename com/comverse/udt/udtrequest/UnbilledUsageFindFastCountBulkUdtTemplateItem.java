/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindFastCountBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageFindFastCountBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindFastCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsageffindCountIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindFastCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindFastCountBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsageffindCountInIn) {
    super(id, context, "UnbilledUsageFindFastCount");
    UnbilledUsageffindCountIn = UnbilledUsageffindCountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageffindCountIn != null) {
      Integer index =  UnbilledUsageffindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsageffindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageffindCountInIn Value of the UnbilledUsageffindCountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsageffindCountInIn) {
    UnbilledUsageffindCountIn = UnbilledUsageffindCountInIn;
  }

  public void translateFromMap() {
    UnbilledUsageffindCountIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageffindCountIn;
  }

}
