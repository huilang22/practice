/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a UnbilledUsageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsagefindIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindInIn) {
    super(id, context, "UnbilledUsageFind");
    UnbilledUsagefindIn = UnbilledUsagefindInIn;
  }

  public void translateToMap() {
    if (UnbilledUsagefindIn != null) {
      Integer index =  UnbilledUsagefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagefindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsagefindInIn Value of the UnbilledUsagefindIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsagefindInIn) {
    UnbilledUsagefindIn = UnbilledUsagefindInIn;
  }

  public void translateFromMap() {
    UnbilledUsagefindIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsagefindIn;
  }

}
