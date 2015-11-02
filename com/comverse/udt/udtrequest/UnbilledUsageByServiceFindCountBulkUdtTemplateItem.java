/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByServiceFindCountBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageByServiceFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageByServiceFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn;
/**
 *
 * Constructor to create a  UnbilledUsageByServiceFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageByServiceFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountInIn) {
    super(id, context, "UnbilledUsageByServiceFindCount");
    UnbilledUsageServicefindCountIn = UnbilledUsageServicefindCountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageServicefindCountIn != null) {
      Integer index =  UnbilledUsageServicefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(UnbilledUsageServicefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageServicefindCountInIn Value of the UnbilledUsageServicefindCountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountInIn) {
    UnbilledUsageServicefindCountIn = UnbilledUsageServicefindCountInIn;
  }

  public void translateFromMap() {
    UnbilledUsageServicefindCountIn = UnbilledUsageServiceObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageServiceObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageServicefindCountIn;
  }

}
