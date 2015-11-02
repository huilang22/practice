/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionGetBulkUdtTemplateItem.java
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
 * Class used to create a AccessRegionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccessRegionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccessRegionObjectKeyData AccessRegionGetIn;
/**
 *
 * Constructor to create a  AccessRegionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccessRegionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccessRegionObjectKeyData AccessRegionGetInIn) {
    super(id, context, "AccessRegionGet");
    AccessRegionGetIn = AccessRegionGetInIn;
  }

  public void translateToMap() {
    if (AccessRegionGetIn != null) {
      AccessRegionGetIn.resetFlags(true, true);
      addInput("AccessRegion", AccessRegionObjectKeyHelper.toMap(AccessRegionGetIn, new HashMap(), "AccessRegionObjectKeyData").get("AccessRegionObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccessRegion
 * @param AccessRegionGetInIn Value of the AccessRegionGetIn
 *
 */

  public void setAccessRegion(AccessRegionObjectKeyData AccessRegionGetInIn) {
    AccessRegionGetIn = AccessRegionGetInIn;
  }

  public void translateFromMap() {
    AccessRegionGetIn = AccessRegionObjectKeyHelper.fromMap(inputMap, "AccessRegion");
  }

/**
 *
 * Gets the AccessRegion
 * @return Value of the AccessRegion
 *
 */

  public AccessRegionObjectKeyData getAccessRegion( ) {
    return AccessRegionGetIn;
  }

}
