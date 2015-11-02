/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccessRegionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccessRegionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccessRegionObjectData AccessRegionUpdateIn;
/**
 *
 * Constructor to create a  AccessRegionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccessRegionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectData AccessRegionUpdateInIn) {
    super(id, context, "AccessRegionUpdate");
    AccessRegionUpdateIn = AccessRegionUpdateInIn;
  }

  public void translateToMap() {
    if (AccessRegionUpdateIn != null) {
      AccessRegionUpdateIn.resetFlags(true, true);
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionUpdateIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }


/**
 *
 * Sets the AccessRegion
 * @param AccessRegionUpdateInIn Value of the AccessRegionUpdateIn
 *
 */

  public void setAccessRegion(AccessRegionObjectData AccessRegionUpdateInIn) {
    AccessRegionUpdateIn = AccessRegionUpdateInIn;
  }

  public void translateFromMap() {
    AccessRegionUpdateIn = AccessRegionObjectHelper.fromMap(inputMap, "AccessRegion");
  }

/**
 *
 * Gets the AccessRegion
 * @return Value of the AccessRegion
 *
 */

  public AccessRegionObjectData getAccessRegion( ) {
    return AccessRegionUpdateIn;
  }

}
