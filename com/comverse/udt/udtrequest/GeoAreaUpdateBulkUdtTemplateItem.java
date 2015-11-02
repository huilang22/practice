/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GAObjectData GAUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectData GAUpdateInIn) {
    super(id, context, "GeoAreaUpdate");
    GAUpdateIn = GAUpdateInIn;
  }

  public void translateToMap() {
    if (GAUpdateIn != null) {
      GAUpdateIn.resetFlags(true, true);
      addInput("GeoArea", GAObjectHelper.toMap(GAUpdateIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }


/**
 *
 * Sets the GeoArea
 * @param GAUpdateInIn Value of the GAUpdateIn
 *
 */

  public void setGeoArea(GAObjectData GAUpdateInIn) {
    GAUpdateIn = GAUpdateInIn;
  }

  public void translateFromMap() {
    GAUpdateIn = GAObjectHelper.fromMap(inputMap, "GeoArea");
  }

/**
 *
 * Gets the GeoArea
 * @return Value of the GeoArea
 *
 */

  public GAObjectData getGeoArea( ) {
    return GAUpdateIn;
  }

}
