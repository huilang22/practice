/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryConditionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryConditionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryConditionObjectData GABCUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryConditionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectData GABCUpdateInIn) {
    super(id, context, "GeoAreaBoundaryConditionUpdate");
    GABCUpdateIn = GABCUpdateInIn;
  }

  public void translateToMap() {
    if (GABCUpdateIn != null) {
      GABCUpdateIn.resetFlags(true, true);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCUpdateIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundaryCondition
 * @param GABCUpdateInIn Value of the GABCUpdateIn
 *
 */

  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectData GABCUpdateInIn) {
    GABCUpdateIn = GABCUpdateInIn;
  }

  public void translateFromMap() {
    GABCUpdateIn = GeoAreaBoundaryConditionObjectHelper.fromMap(inputMap, "GeoAreaBoundaryCondition");
  }

/**
 *
 * Gets the GeoAreaBoundaryCondition
 * @return Value of the GeoAreaBoundaryCondition
 *
 */

  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryCondition( ) {
    return GABCUpdateIn;
  }

}
