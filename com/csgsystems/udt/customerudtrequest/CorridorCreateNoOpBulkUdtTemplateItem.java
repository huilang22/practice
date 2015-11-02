/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CorridorObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectData noOpInIn) {
    super(id, context, "CorridorCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Corridor", CorridorObjectHelper.toMap(noOpIn, new HashMap(), "Corridor").get("Corridor"));
    }
  }
/**
 *
 * Sets the  Corridor
 * @param noOpInIn CorridorObjectData to set
 *
 */
  public void setCorridor(CorridorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Corridor passed into the constructor
 * @return Simulated response
 *
 */
  public CorridorObjectData getCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CorridorObjectHelper.fromMap(inputMap, "Corridor");
  }
}
