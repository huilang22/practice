/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ZoneGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ZoneGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ZoneObjectKeyData zGetIn;
/**
 *
 * Constructor to create a  ZoneGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ZoneGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectKeyData zGetInIn) {
    super(id, context, "ZoneGet");
    zGetIn = zGetInIn;
  }

  public void translateToMap() {
    if (zGetIn != null) {
      zGetIn.resetFlags(true, true);
      addInput("Zone", ZoneObjectKeyHelper.toMap(zGetIn, new HashMap(), "ZoneObjectKeyData").get("ZoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the Zone
 * @param zGetInIn Value of the zGetIn
 *
 */

  public void setZone(ZoneObjectKeyData zGetInIn) {
    zGetIn = zGetInIn;
  }

  public void translateFromMap() {
    zGetIn = ZoneObjectKeyHelper.fromMap(inputMap, "Zone");
  }

/**
 *
 * Gets the Zone
 * @return Value of the Zone
 *
 */

  public ZoneObjectKeyData getZone( ) {
    return zGetIn;
  }

}
