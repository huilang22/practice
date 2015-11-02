/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryObjectKeyData GABGetIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectKeyData GABGetInIn) {
    super(id, context, "GeoAreaBoundaryGet");
    GABGetIn = GABGetInIn;
  }

  public void translateToMap() {
    if (GABGetIn != null) {
      GABGetIn.resetFlags(true, true);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(GABGetIn, new HashMap(), "GeoAreaBoundaryObjectKeyData").get("GeoAreaBoundaryObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundary
 * @param GABGetInIn Value of the GABGetIn
 *
 */

  public void setGeoAreaBoundary(GeoAreaBoundaryObjectKeyData GABGetInIn) {
    GABGetIn = GABGetInIn;
  }

  public void translateFromMap() {
    GABGetIn = GeoAreaBoundaryObjectKeyHelper.fromMap(inputMap, "GeoAreaBoundary");
  }

/**
 *
 * Gets the GeoAreaBoundary
 * @return Value of the GeoAreaBoundary
 *
 */

  public GeoAreaBoundaryObjectKeyData getGeoAreaBoundary( ) {
    return GABGetIn;
  }

}
