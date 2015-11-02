/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapPriorityUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OpenItemIdMapPriorityUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OpenItemIdMapPriorityUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OpenItemIdMapObjectData noOpIn;

/**
 *
 * Constructor to create a   OpenItemIdMapPriorityUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OpenItemIdMapPriorityUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OpenItemIdMapObjectData noOpInIn) {
    super(id, context, "OpenItemIdMapPriorityUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OpenItemIdMap", OpenItemIdMapObjectHelper.toMap(noOpIn, new HashMap(), "OpenItemIdMap").get("OpenItemIdMap"));
    }
  }
/**
 *
 * Sets the  OpenItemIdMap
 * @param noOpInIn OpenItemIdMapObjectData to set
 *
 */
  public void setOpenItemIdMap(OpenItemIdMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OpenItemIdMap passed into the constructor
 * @return Simulated response
 *
 */
  public OpenItemIdMapObjectData getOpenItemIdMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OpenItemIdMapObjectHelper.fromMap(inputMap, "OpenItemIdMap");
  }
}
