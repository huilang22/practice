/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneFindBulkUdtTemplateItem.java
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
 * Class used to create a ZoneFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneObjectFilter zFindIn;
/**
 *
 * Constructor to create a  ZoneFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectFilter zFindInIn) {
    super(id, context, "ZoneFind");
    zFindIn = zFindInIn;
  }

  public void translateToMap() {
    if (zFindIn != null) {
      Integer index =  zFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Zone", ZoneObjectHelper.toMap(zFindIn, new HashMap(), "Zone").get("Zone"));
    }
  }


/**
 *
 * Sets the Zone
 * @param zFindInIn Value of the zFindIn
 *
 */

  public void setZone(ZoneObjectFilter zFindInIn) {
    zFindIn = zFindInIn;
  }

  public void translateFromMap() {
    zFindIn = ZoneObjectHelper.fromMapFilter(inputMap, "Zone");
  }

/**
 *
 * Gets the Zone
 * @return Value of the Zone
 *
 */

  public ZoneObjectFilter getZone( ) {
    return zFindIn;
  }

}
