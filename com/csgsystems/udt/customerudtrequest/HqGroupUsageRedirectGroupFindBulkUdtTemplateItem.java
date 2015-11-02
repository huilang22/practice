/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupUsageRedirectGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupUsageRedirectGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectGroupObjectFilter HqGroupUsageRedirectGroupFindIn;
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupUsageRedirectGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectFilter HqGroupUsageRedirectGroupFindInIn) {
    super(id, context, "HqGroupUsageRedirectGroupFind");
    HqGroupUsageRedirectGroupFindIn = HqGroupUsageRedirectGroupFindInIn;
  }

  public void translateToMap() {
    if (HqGroupUsageRedirectGroupFindIn != null) {
      Integer index =  HqGroupUsageRedirectGroupFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupFindIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }


/**
 *
 * Sets the HqGroupUsageRedirectGroup
 * @param HqGroupUsageRedirectGroupFindInIn Value of the HqGroupUsageRedirectGroupFindIn
 *
 */

  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectFilter HqGroupUsageRedirectGroupFindInIn) {
    HqGroupUsageRedirectGroupFindIn = HqGroupUsageRedirectGroupFindInIn;
  }

  public void translateFromMap() {
    HqGroupUsageRedirectGroupFindIn = HqGroupUsageRedirectGroupObjectHelper.fromMapFilter(inputMap, "HqGroupUsageRedirectGroup");
  }

/**
 *
 * Gets the HqGroupUsageRedirectGroup
 * @return Value of the HqGroupUsageRedirectGroup
 *
 */

  public HqGroupUsageRedirectGroupObjectFilter getHqGroupUsageRedirectGroup( ) {
    return HqGroupUsageRedirectGroupFindIn;
  }

}
