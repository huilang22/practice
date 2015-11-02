/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaTypeObjectKeyData gatGetIn;
/**
 *
 * Constructor to create a  GeoAreaTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectKeyData gatGetInIn) {
    super(id, context, "GeoAreaTypeGet");
    gatGetIn = gatGetInIn;
  }

  public void translateToMap() {
    if (gatGetIn != null) {
      gatGetIn.resetFlags(true, true);
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(gatGetIn, new HashMap(), "GeoAreaTypeObjectKeyData").get("GeoAreaTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaType
 * @param gatGetInIn Value of the gatGetIn
 *
 */

  public void setGeoAreaType(GeoAreaTypeObjectKeyData gatGetInIn) {
    gatGetIn = gatGetInIn;
  }

  public void translateFromMap() {
    gatGetIn = GeoAreaTypeObjectKeyHelper.fromMap(inputMap, "GeoAreaType");
  }

/**
 *
 * Gets the GeoAreaType
 * @return Value of the GeoAreaType
 *
 */

  public GeoAreaTypeObjectKeyData getGeoAreaType( ) {
    return gatGetIn;
  }

}
