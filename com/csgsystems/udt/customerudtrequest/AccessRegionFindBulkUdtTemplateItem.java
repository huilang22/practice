/*
 * Generated code DO NOT EDIT
 * Generated file: AccessRegionFindBulkUdtTemplateItem.java
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
 * Class used to create a AccessRegionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccessRegionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccessRegionObjectFilter AccessRegionFindIn;
/**
 *
 * Constructor to create a  AccessRegionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccessRegionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectFilter AccessRegionFindInIn) {
    super(id, context, "AccessRegionFind");
    AccessRegionFindIn = AccessRegionFindInIn;
  }

  public void translateToMap() {
    if (AccessRegionFindIn != null) {
      Integer index =  AccessRegionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionFindIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }


/**
 *
 * Sets the AccessRegion
 * @param AccessRegionFindInIn Value of the AccessRegionFindIn
 *
 */

  public void setAccessRegion(AccessRegionObjectFilter AccessRegionFindInIn) {
    AccessRegionFindIn = AccessRegionFindInIn;
  }

  public void translateFromMap() {
    AccessRegionFindIn = AccessRegionObjectHelper.fromMapFilter(inputMap, "AccessRegion");
  }

/**
 *
 * Gets the AccessRegion
 * @return Value of the AccessRegion
 *
 */

  public AccessRegionObjectFilter getAccessRegion( ) {
    return AccessRegionFindIn;
  }

}
