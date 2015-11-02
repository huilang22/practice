/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ZoneClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneClassObjectData zcUpdIn;
/**
 *
 * Constructor to create a  ZoneClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectData zcUpdInIn) {
    super(id, context, "ZoneClassUpdate");
    zcUpdIn = zcUpdInIn;
  }

  public void translateToMap() {
    if (zcUpdIn != null) {
      zcUpdIn.resetFlags(true, true);
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(zcUpdIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }


/**
 *
 * Sets the ZoneClass
 * @param zcUpdInIn Value of the zcUpdIn
 *
 */

  public void setZoneClass(ZoneClassObjectData zcUpdInIn) {
    zcUpdIn = zcUpdInIn;
  }

  public void translateFromMap() {
    zcUpdIn = ZoneClassObjectHelper.fromMap(inputMap, "ZoneClass");
  }

/**
 *
 * Gets the ZoneClass
 * @return Value of the ZoneClass
 *
 */

  public ZoneClassObjectData getZoneClass( ) {
    return zcUpdIn;
  }

}
