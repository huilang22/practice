/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a ZoneClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneClassObjectData zcCrIn;
/**
 *
 * Constructor to create a  ZoneClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectData zcCrInIn) {
    super(id, context, "ZoneClassCreate");
    zcCrIn = zcCrInIn;
  }

  public void translateToMap() {
    if (zcCrIn != null) {
      zcCrIn.resetFlags(true, true);
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcCrIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }


/**
 *
 * Sets the ZoneClass
 * @param zcCrInIn Value of the zcCrIn
 *
 */

  public void setZoneClass(ZoneClassObjectData zcCrInIn) {
    zcCrIn = zcCrInIn;
  }

  public void translateFromMap() {
    zcCrIn = ZoneClassObjectHelper.fromMap(inputMap, "ZoneClass");
  }

/**
 *
 * Gets the ZoneClass
 * @return Value of the ZoneClass
 *
 */

  public ZoneClassObjectData getZoneClass( ) {
    return zcCrIn;
  }

}
