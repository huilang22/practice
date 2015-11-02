/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryObjectFilter GABFindIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectFilter GABFindInIn) {
    super(id, context, "GeoAreaBoundaryFind");
    GABFindIn = GABFindInIn;
  }

  public void translateToMap() {
    if (GABFindIn != null) {
      Integer index =  GABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABFindIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundary
 * @param GABFindInIn Value of the GABFindIn
 *
 */

  public void setGeoAreaBoundary(GeoAreaBoundaryObjectFilter GABFindInIn) {
    GABFindIn = GABFindInIn;
  }

  public void translateFromMap() {
    GABFindIn = GeoAreaBoundaryObjectHelper.fromMapFilter(inputMap, "GeoAreaBoundary");
  }

/**
 *
 * Gets the GeoAreaBoundary
 * @return Value of the GeoAreaBoundary
 *
 */

  public GeoAreaBoundaryObjectFilter getGeoAreaBoundary( ) {
    return GABFindIn;
  }

}
