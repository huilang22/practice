/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ZoneDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneObjectKeyData zDeleteIn;
/**
 *
 * Constructor to create a  ZoneDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectKeyData zDeleteInIn) {
    super(id, context, "ZoneDelete");
    zDeleteIn = zDeleteInIn;
  }

  public void translateToMap() {
    if (zDeleteIn != null) {
      zDeleteIn.resetFlags(true, true);
      addInput("Zone", ZoneObjectKeyHelper.toMap(zDeleteIn, new HashMap(), "ZoneObjectKeyData").get("ZoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the Zone
 * @param zDeleteInIn Value of the zDeleteIn
 *
 */

  public void setZone(ZoneObjectKeyData zDeleteInIn) {
    zDeleteIn = zDeleteInIn;
  }

  public void translateFromMap() {
    zDeleteIn = ZoneObjectKeyHelper.fromMap(inputMap, "Zone");
  }

/**
 *
 * Gets the Zone
 * @return Value of the Zone
 *
 */

  public ZoneObjectKeyData getZone( ) {
    return zDeleteIn;
  }

}
