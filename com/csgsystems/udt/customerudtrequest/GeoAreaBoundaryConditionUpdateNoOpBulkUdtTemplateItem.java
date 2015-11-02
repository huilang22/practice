/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryConditionUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaBoundaryConditionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaBoundaryConditionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaBoundaryConditionObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectData noOpInIn) {
    super(id, context, "GeoAreaBoundaryConditionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
/**
 *
 * Sets the  GeoAreaBoundaryCondition
 * @param noOpInIn GeoAreaBoundaryConditionObjectData to set
 *
 */
  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaBoundaryCondition passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaBoundaryConditionObjectHelper.fromMap(inputMap, "GeoAreaBoundaryCondition");
  }
}
