/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByAccountFindCountBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageByAccountFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageByAccountFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn;
/**
 *
 * Constructor to create a  UnbilledUsageByAccountFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageByAccountFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountInIn) {
    super(id, context, "UnbilledUsageByAccountFindCount");
    UnbilledUsageAccountfindCountIn = UnbilledUsageAccountfindCountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageAccountfindCountIn != null) {
      Integer index =  UnbilledUsageAccountfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(UnbilledUsageAccountfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageAccountfindCountInIn Value of the UnbilledUsageAccountfindCountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountInIn) {
    UnbilledUsageAccountfindCountIn = UnbilledUsageAccountfindCountInIn;
  }

  public void translateFromMap() {
    UnbilledUsageAccountfindCountIn = UnbilledUsageAccountObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageAccountObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageAccountfindCountIn;
  }

}
