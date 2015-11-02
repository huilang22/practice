/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryConditionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryConditionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryConditionObjectKeyData GABCDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryConditionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectKeyData GABCDeleteInIn) {
    super(id, context, "GeoAreaBoundaryConditionDelete");
    GABCDeleteIn = GABCDeleteInIn;
  }

  public void translateToMap() {
    if (GABCDeleteIn != null) {
      GABCDeleteIn.resetFlags(true, true);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(GABCDeleteIn, new HashMap(), "GeoAreaBoundaryConditionObjectKeyData").get("GeoAreaBoundaryConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundaryCondition
 * @param GABCDeleteInIn Value of the GABCDeleteIn
 *
 */

  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectKeyData GABCDeleteInIn) {
    GABCDeleteIn = GABCDeleteInIn;
  }

  public void translateFromMap() {
    GABCDeleteIn = GeoAreaBoundaryConditionObjectKeyHelper.fromMap(inputMap, "GeoAreaBoundaryCondition");
  }

/**
 *
 * Gets the GeoAreaBoundaryCondition
 * @return Value of the GeoAreaBoundaryCondition
 *
 */

  public GeoAreaBoundaryConditionObjectKeyData getGeoAreaBoundaryCondition( ) {
    return GABCDeleteIn;
  }

}
