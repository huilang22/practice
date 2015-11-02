/*
 * Generated code DO NOT EDIT
 * Generated file: NetActionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NetActionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NetActionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NetActionObjectData noOpIn;

/**
 *
 * Constructor to create a   NetActionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NetActionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NetActionObjectData noOpInIn) {
    super(id, context, "NetActionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NetAction", NetActionObjectHelper.toMap(noOpIn, new HashMap(), "NetAction").get("NetAction"));
    }
  }
/**
 *
 * Sets the  NetAction
 * @param noOpInIn NetActionObjectData to set
 *
 */
  public void setNetAction(NetActionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NetAction passed into the constructor
 * @return Simulated response
 *
 */
  public NetActionObjectData getNetAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NetActionObjectHelper.fromMap(inputMap, "NetAction");
  }
}
