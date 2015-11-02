/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GAObjectData GACreateIn;
/**
 *
 * Constructor to create a  GeoAreaCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectData GACreateInIn) {
    super(id, context, "GeoAreaCreate");
    GACreateIn = GACreateInIn;
  }

  public void translateToMap() {
    if (GACreateIn != null) {
      GACreateIn.resetFlags(true, true);
      addInput("GeoArea", GAObjectHelper.toMap(GACreateIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }


/**
 *
 * Sets the GeoArea
 * @param GACreateInIn Value of the GACreateIn
 *
 */

  public void setGeoArea(GAObjectData GACreateInIn) {
    GACreateIn = GACreateInIn;
  }

  public void translateFromMap() {
    GACreateIn = GAObjectHelper.fromMap(inputMap, "GeoArea");
  }

/**
 *
 * Gets the GeoArea
 * @return Value of the GeoArea
 *
 */

  public GAObjectData getGeoArea( ) {
    return GACreateIn;
  }

}
