/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneClassGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ZoneClassGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ZoneClassGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ZoneClassObjectData noOpIn;

/**
 *
 * Constructor to create a   ZoneClassGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ZoneClassGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneClassObjectData noOpInIn) {
    super(id, context, "ZoneClassGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(noOpIn, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
/**
 *
 * Sets the  ZoneClass
 * @param noOpInIn ZoneClassObjectData to set
 *
 */
  public void setZoneClass(ZoneClassObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ZoneClass passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneClassObjectData getZoneClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ZoneClassObjectHelper.fromMap(inputMap, "ZoneClass");
  }
}
