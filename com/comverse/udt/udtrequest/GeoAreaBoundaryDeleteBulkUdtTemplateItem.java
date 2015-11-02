/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryObjectKeyData GABDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryObjectKeyData GABDeleteInIn) {
    super(id, context, "GeoAreaBoundaryDelete");
    GABDeleteIn = GABDeleteInIn;
  }

  public void translateToMap() {
    if (GABDeleteIn != null) {
      GABDeleteIn.resetFlags(true, true);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(GABDeleteIn, new HashMap(), "GeoAreaBoundaryObjectKeyData").get("GeoAreaBoundaryObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundary
 * @param GABDeleteInIn Value of the GABDeleteIn
 *
 */

  public void setGeoAreaBoundary(GeoAreaBoundaryObjectKeyData GABDeleteInIn) {
    GABDeleteIn = GABDeleteInIn;
  }

  public void translateFromMap() {
    GABDeleteIn = GeoAreaBoundaryObjectKeyHelper.fromMap(inputMap, "GeoAreaBoundary");
  }

/**
 *
 * Gets the GeoAreaBoundary
 * @return Value of the GeoAreaBoundary
 *
 */

  public GeoAreaBoundaryObjectKeyData getGeoAreaBoundary( ) {
    return GABDeleteIn;
  }

}
