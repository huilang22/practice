/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaBoundaryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaBoundaryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaBoundaryObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaBoundaryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaBoundaryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectData noOpInIn) {
    super(id, context, "GeoAreaBoundaryUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
/**
 *
 * Sets the  GeoAreaBoundary
 * @param noOpInIn GeoAreaBoundaryObjectData to set
 *
 */
  public void setGeoAreaBoundary(GeoAreaBoundaryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaBoundary passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaBoundaryObjectData getGeoAreaBoundary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaBoundaryObjectHelper.fromMap(inputMap, "GeoAreaBoundary");
  }
}
