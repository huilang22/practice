/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByAccountFindBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageByAccountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageByAccountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn;
/**
 *
 * Constructor to create a  UnbilledUsageByAccountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageByAccountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindInIn) {
    super(id, context, "UnbilledUsageByAccountFind");
    UnbilledUsageAcctfindIn = UnbilledUsageAcctfindInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageAcctfindIn != null) {
      Integer index =  UnbilledUsageAcctfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(UnbilledUsageAcctfindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageAcctfindInIn Value of the UnbilledUsageAcctfindIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindInIn) {
    UnbilledUsageAcctfindIn = UnbilledUsageAcctfindInIn;
  }

  public void translateFromMap() {
    UnbilledUsageAcctfindIn = UnbilledUsageAccountObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageAccountObjectFilter getUnbilledUsage( ) {
    return UnbilledUsageAcctfindIn;
  }

}
