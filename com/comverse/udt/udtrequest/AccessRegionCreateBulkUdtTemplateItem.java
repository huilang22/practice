/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a AccessRegionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccessRegionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccessRegionObjectData AccessRegionCreateIn;
/**
 *
 * Constructor to create a  AccessRegionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccessRegionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectData AccessRegionCreateInIn) {
    super(id, context, "AccessRegionCreate");
    AccessRegionCreateIn = AccessRegionCreateInIn;
  }

  public void translateToMap() {
    if (AccessRegionCreateIn != null) {
      AccessRegionCreateIn.resetFlags(true, true);
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionCreateIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }


/**
 *
 * Sets the AccessRegion
 * @param AccessRegionCreateInIn Value of the AccessRegionCreateIn
 *
 */

  public void setAccessRegion(AccessRegionObjectData AccessRegionCreateInIn) {
    AccessRegionCreateIn = AccessRegionCreateInIn;
  }

  public void translateFromMap() {
    AccessRegionCreateIn = AccessRegionObjectHelper.fromMap(inputMap, "AccessRegion");
  }

/**
 *
 * Gets the AccessRegion
 * @return Value of the AccessRegion
 *
 */

  public AccessRegionObjectData getAccessRegion( ) {
    return AccessRegionCreateIn;
  }

}
