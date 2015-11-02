/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ZoneCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ZoneCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ZoneObjectData noOpIn;

/**
 *
 * Constructor to create a   ZoneCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ZoneCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ZoneObjectData noOpInIn) {
    super(id, context, "ZoneCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Zone", ZoneObjectHelper.toMap(noOpIn, new HashMap(), "Zone").get("Zone"));
    }
  }
/**
 *
 * Sets the  Zone
 * @param noOpInIn ZoneObjectData to set
 *
 */
  public void setZone(ZoneObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Zone passed into the constructor
 * @return Simulated response
 *
 */
  public ZoneObjectData getZone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ZoneObjectHelper.fromMap(inputMap, "Zone");
  }
}
