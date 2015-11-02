/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryObjectData GABCreateIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectData GABCreateInIn) {
    super(id, context, "GeoAreaBoundaryCreate");
    GABCreateIn = GABCreateInIn;
  }

  public void translateToMap() {
    if (GABCreateIn != null) {
      GABCreateIn.resetFlags(true, true);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABCreateIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundary
 * @param GABCreateInIn Value of the GABCreateIn
 *
 */

  public void setGeoAreaBoundary(GeoAreaBoundaryObjectData GABCreateInIn) {
    GABCreateIn = GABCreateInIn;
  }

  public void translateFromMap() {
    GABCreateIn = GeoAreaBoundaryObjectHelper.fromMap(inputMap, "GeoAreaBoundary");
  }

/**
 *
 * Gets the GeoAreaBoundary
 * @return Value of the GeoAreaBoundary
 *
 */

  public GeoAreaBoundaryObjectData getGeoAreaBoundary( ) {
    return GABCreateIn;
  }

}
