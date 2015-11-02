/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupCorridorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupCorridorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupCorridorObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupCorridorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupCorridorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectData noOpInIn) {
    super(id, context, "HqGroupCorridorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
/**
 *
 * Sets the  HqGroupCorridor
 * @param noOpInIn HqGroupCorridorObjectData to set
 *
 */
  public void setHqGroupCorridor(HqGroupCorridorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupCorridor passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupCorridorObjectData getHqGroupCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupCorridorObjectHelper.fromMap(inputMap, "HqGroupCorridor");
  }
}
