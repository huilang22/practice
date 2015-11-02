/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByServiceFindBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageByServiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageByServiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn;
/**
 *
 * Constructor to create a  UnbilledUsageByServiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageByServiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageServiceObjectFilter UnbilledUsageServicefindInIn) {
    super(id, context, "UnbilledUsageByServiceFind");
    UnbilledUsageServicefindIn = UnbilledUsageServicefindInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageServicefindIn != null) {
      Integer index =  UnbilledUsageServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(UnbilledUsageServicefindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageServicefindInIn Value of the UnbilledUsageServicefindIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageServiceObjectFilter UnbilledUsageServicefindInIn) {
    UnbilledUsageServicefindIn = UnbilledUsageServicefindInIn;
  }

  public void translateFromMap() {
    UnbilledUsageServicefindIn = UnbilledUsageServiceObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageServiceObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageServicefindIn;
  }

}
