/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryObjectData GABUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectData GABUpdateInIn) {
    super(id, context, "GeoAreaBoundaryUpdate");
    GABUpdateIn = GABUpdateInIn;
  }

  public void translateToMap() {
    if (GABUpdateIn != null) {
      GABUpdateIn.resetFlags(true, true);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABUpdateIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundary
 * @param GABUpdateInIn Value of the GABUpdateIn
 *
 */

  public void setGeoAreaBoundary(GeoAreaBoundaryObjectData GABUpdateInIn) {
    GABUpdateIn = GABUpdateInIn;
  }

  public void translateFromMap() {
    GABUpdateIn = GeoAreaBoundaryObjectHelper.fromMap(inputMap, "GeoAreaBoundary");
  }

/**
 *
 * Gets the GeoAreaBoundary
 * @return Value of the GeoAreaBoundary
 *
 */

  public GeoAreaBoundaryObjectData getGeoAreaBoundary( ) {
    return GABUpdateIn;
  }

}
