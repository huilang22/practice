/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaBoundaryConditionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaBoundaryConditionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaBoundaryConditionObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaBoundaryConditionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaBoundaryConditionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectData noOpInIn) {
    super(id, context, "GeoAreaBoundaryConditionCreate");
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
