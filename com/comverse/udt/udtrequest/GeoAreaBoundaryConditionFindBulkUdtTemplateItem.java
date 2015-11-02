/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryConditionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryConditionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryConditionObjectFilter GABCFindIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryConditionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectFilter GABCFindInIn) {
    super(id, context, "GeoAreaBoundaryConditionFind");
    GABCFindIn = GABCFindInIn;
  }

  public void translateToMap() {
    if (GABCFindIn != null) {
      Integer index =  GABCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCFindIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundaryCondition
 * @param GABCFindInIn Value of the GABCFindIn
 *
 */

  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectFilter GABCFindInIn) {
    GABCFindIn = GABCFindInIn;
  }

  public void translateFromMap() {
    GABCFindIn = GeoAreaBoundaryConditionObjectHelper.fromMapFilter(inputMap, "GeoAreaBoundaryCondition");
  }

/**
 *
 * Gets the GeoAreaBoundaryCondition
 * @return Value of the GeoAreaBoundaryCondition
 *
 */

  public GeoAreaBoundaryConditionObjectFilter getGeoAreaBoundaryCondition( ) {
    return GABCFindIn;
  }

}
