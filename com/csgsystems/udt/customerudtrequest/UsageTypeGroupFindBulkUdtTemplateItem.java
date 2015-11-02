/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeGroupFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a UsageTypeGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageTypeGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageTypeGroupObjectFilter UTGFndIn;
/**
 *
 * Constructor to create a  UsageTypeGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageTypeGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeGroupObjectFilter UTGFndInIn) {
    super(id, context, "UsageTypeGroupFind");
    UTGFndIn = UTGFndInIn;
  }

  public void translateToMap() {
    if (UTGFndIn != null) {
      Integer index =  UTGFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGFndIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }


/**
 *
 * Sets the UsageTypeGroup
 * @param UTGFndInIn Value of the UTGFndIn
 *
 */

  public void setUsageTypeGroup(UsageTypeGroupObjectFilter UTGFndInIn) {
    UTGFndIn = UTGFndInIn;
  }

  public void translateFromMap() {
    UTGFndIn = UsageTypeGroupObjectHelper.fromMapFilter(inputMap, "UsageTypeGroup");
  }

/**
 *
 * Gets the UsageTypeGroup
 * @return Value of the UsageTypeGroup
 *
 */

  public UsageTypeGroupObjectFilter getUsageTypeGroup( ) {
    return UTGFndIn;
  }

}
