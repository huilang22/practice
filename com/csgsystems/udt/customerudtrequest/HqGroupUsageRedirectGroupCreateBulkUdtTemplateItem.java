/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupUsageRedirectGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupUsageRedirectGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupCreateIn;
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupUsageRedirectGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupCreateInIn) {
    super(id, context, "HqGroupUsageRedirectGroupCreate");
    HqGroupUsageRedirectGroupCreateIn = HqGroupUsageRedirectGroupCreateInIn;
  }

  public void translateToMap() {
    if (HqGroupUsageRedirectGroupCreateIn != null) {
      HqGroupUsageRedirectGroupCreateIn.resetFlags(true, true);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupCreateIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }


/**
 *
 * Sets the HqGroupUsageRedirectGroup
 * @param HqGroupUsageRedirectGroupCreateInIn Value of the HqGroupUsageRedirectGroupCreateIn
 *
 */

  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupCreateInIn) {
    HqGroupUsageRedirectGroupCreateIn = HqGroupUsageRedirectGroupCreateInIn;
  }

  public void translateFromMap() {
    HqGroupUsageRedirectGroupCreateIn = HqGroupUsageRedirectGroupObjectHelper.fromMap(inputMap, "HqGroupUsageRedirectGroup");
  }

/**
 *
 * Gets the HqGroupUsageRedirectGroup
 * @return Value of the HqGroupUsageRedirectGroup
 *
 */

  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroup( ) {
    return HqGroupUsageRedirectGroupCreateIn;
  }

}
