/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneCreateBulkUdtTemplateItem.java
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
 * Class used to create a ZoneCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneObjectData zCrIn;
/**
 *
 * Constructor to create a  ZoneCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectData zCrInIn) {
    super(id, context, "ZoneCreate");
    zCrIn = zCrInIn;
  }

  public void translateToMap() {
    if (zCrIn != null) {
      zCrIn.resetFlags(true, true);
      addInput("Zone", ZoneObjectHelper.toMap(zCrIn, new HashMap(), "Zone").get("Zone"));
    }
  }


/**
 *
 * Sets the Zone
 * @param zCrInIn Value of the zCrIn
 *
 */

  public void setZone(ZoneObjectData zCrInIn) {
    zCrIn = zCrInIn;
  }

  public void translateFromMap() {
    zCrIn = ZoneObjectHelper.fromMap(inputMap, "Zone");
  }

/**
 *
 * Gets the Zone
 * @return Value of the Zone
 *
 */

  public ZoneObjectData getZone( ) {
    return zCrIn;
  }

}
