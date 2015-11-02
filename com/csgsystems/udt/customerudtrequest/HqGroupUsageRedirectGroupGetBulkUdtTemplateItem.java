/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupUsageRedirectGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupUsageRedirectGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupUsageRedirectGroupObjectKeyData HqGroupUsageRedirectGroupGetIn;
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupUsageRedirectGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupUsageRedirectGroupObjectKeyData HqGroupUsageRedirectGroupGetInIn) {
    super(id, context, "HqGroupUsageRedirectGroupGet");
    HqGroupUsageRedirectGroupGetIn = HqGroupUsageRedirectGroupGetInIn;
  }

  public void translateToMap() {
    if (HqGroupUsageRedirectGroupGetIn != null) {
      HqGroupUsageRedirectGroupGetIn.resetFlags(true, true);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectKeyHelper.toMap(HqGroupUsageRedirectGroupGetIn, new HashMap(), "HqGroupUsageRedirectGroupObjectKeyData").get("HqGroupUsageRedirectGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the HqGroupUsageRedirectGroup
 * @param HqGroupUsageRedirectGroupGetInIn Value of the HqGroupUsageRedirectGroupGetIn
 *
 */

  public void setHqGroupUsageRedirectGroup(HqGroupUsageRedirectGroupObjectKeyData HqGroupUsageRedirectGroupGetInIn) {
    HqGroupUsageRedirectGroupGetIn = HqGroupUsageRedirectGroupGetInIn;
  }

  public void translateFromMap() {
    HqGroupUsageRedirectGroupGetIn = HqGroupUsageRedirectGroupObjectKeyHelper.fromMap(inputMap, "HqGroupUsageRedirectGroup");
  }

/**
 *
 * Gets the HqGroupUsageRedirectGroup
 * @return Value of the HqGroupUsageRedirectGroup
 *
 */

  public HqGroupUsageRedirectGroupObjectKeyData getHqGroupUsageRedirectGroup( ) {
    return HqGroupUsageRedirectGroupGetIn;
  }

}
