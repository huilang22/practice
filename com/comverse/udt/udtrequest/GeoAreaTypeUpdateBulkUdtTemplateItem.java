/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaTypeObjectData gatUpdIn;
/**
 *
 * Constructor to create a  GeoAreaTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectData gatUpdInIn) {
    super(id, context, "GeoAreaTypeUpdate");
    gatUpdIn = gatUpdInIn;
  }

  public void translateToMap() {
    if (gatUpdIn != null) {
      gatUpdIn.resetFlags(true, true);
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatUpdIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }


/**
 *
 * Sets the GeoAreaType
 * @param gatUpdInIn Value of the gatUpdIn
 *
 */

  public void setGeoAreaType(GeoAreaTypeObjectData gatUpdInIn) {
    gatUpdIn = gatUpdInIn;
  }

  public void translateFromMap() {
    gatUpdIn = GeoAreaTypeObjectHelper.fromMap(inputMap, "GeoAreaType");
  }

/**
 *
 * Gets the GeoAreaType
 * @return Value of the GeoAreaType
 *
 */

  public GeoAreaTypeObjectData getGeoAreaType( ) {
    return gatUpdIn;
  }

}
