/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ZoneUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneObjectData zUpdIn;
/**
 *
 * Constructor to create a  ZoneUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectData zUpdInIn) {
    super(id, context, "ZoneUpdate");
    zUpdIn = zUpdInIn;
  }

  public void translateToMap() {
    if (zUpdIn != null) {
      zUpdIn.resetFlags(true, true);
      addInput("Zone", ZoneObjectHelper.toMap(zUpdIn, new HashMap(), "Zone").get("Zone"));
    }
  }


/**
 *
 * Sets the Zone
 * @param zUpdInIn Value of the zUpdIn
 *
 */

  public void setZone(ZoneObjectData zUpdInIn) {
    zUpdIn = zUpdInIn;
  }

  public void translateFromMap() {
    zUpdIn = ZoneObjectHelper.fromMap(inputMap, "Zone");
  }

/**
 *
 * Gets the Zone
 * @return Value of the Zone
 *
 */

  public ZoneObjectData getZone( ) {
    return zUpdIn;
  }

}
