/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryConditionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryConditionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryConditionObjectData GABCCreateIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryConditionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectData GABCCreateInIn) {
    super(id, context, "GeoAreaBoundaryConditionCreate");
    GABCCreateIn = GABCCreateInIn;
  }

  public void translateToMap() {
    if (GABCCreateIn != null) {
      GABCCreateIn.resetFlags(true, true);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCCreateIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundaryCondition
 * @param GABCCreateInIn Value of the GABCCreateIn
 *
 */

  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectData GABCCreateInIn) {
    GABCCreateIn = GABCCreateInIn;
  }

  public void translateFromMap() {
    GABCCreateIn = GeoAreaBoundaryConditionObjectHelper.fromMap(inputMap, "GeoAreaBoundaryCondition");
  }

/**
 *
 * Gets the GeoAreaBoundaryCondition
 * @return Value of the GeoAreaBoundaryCondition
 *
 */

  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryCondition( ) {
    return GABCCreateIn;
  }

}
