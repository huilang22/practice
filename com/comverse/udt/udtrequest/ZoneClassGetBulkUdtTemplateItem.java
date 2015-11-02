/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassGetBulkUdtTemplateItem.java
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
 * Class used to create a ZoneClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneClassObjectKeyData zcGetIn;
/**
 *
 * Constructor to create a  ZoneClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectKeyData zcGetInIn) {
    super(id, context, "ZoneClassGet");
    zcGetIn = zcGetInIn;
  }

  public void translateToMap() {
    if (zcGetIn != null) {
      zcGetIn.resetFlags(true, true);
      addInput("ZoneClass", ZoneClassObjectKeyHelper.toMap(zcGetIn, new HashMap(), "ZoneClassObjectKeyData").get("ZoneClassObjectKeyData"));
    }
  }


/**
 *
 * Sets the ZoneClass
 * @param zcGetInIn Value of the zcGetIn
 *
 */

  public void setZoneClass(ZoneClassObjectKeyData zcGetInIn) {
    zcGetIn = zcGetInIn;
  }

  public void translateFromMap() {
    zcGetIn = ZoneClassObjectKeyHelper.fromMap(inputMap, "ZoneClass");
  }

/**
 *
 * Gets the ZoneClass
 * @return Value of the ZoneClass
 *
 */

  public ZoneClassObjectKeyData getZoneClass( ) {
    return zcGetIn;
  }

}
