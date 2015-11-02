/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaTypeObjectData gatCrIn;
/**
 *
 * Constructor to create a  GeoAreaTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectData gatCrInIn) {
    super(id, context, "GeoAreaTypeCreate");
    gatCrIn = gatCrInIn;
  }

  public void translateToMap() {
    if (gatCrIn != null) {
      gatCrIn.resetFlags(true, true);
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatCrIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }


/**
 *
 * Sets the GeoAreaType
 * @param gatCrInIn Value of the gatCrIn
 *
 */

  public void setGeoAreaType(GeoAreaTypeObjectData gatCrInIn) {
    gatCrIn = gatCrInIn;
  }

  public void translateFromMap() {
    gatCrIn = GeoAreaTypeObjectHelper.fromMap(inputMap, "GeoAreaType");
  }

/**
 *
 * Gets the GeoAreaType
 * @return Value of the GeoAreaType
 *
 */

  public GeoAreaTypeObjectData getGeoAreaType( ) {
    return gatCrIn;
  }

}
