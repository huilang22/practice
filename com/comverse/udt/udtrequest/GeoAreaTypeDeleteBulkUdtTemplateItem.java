/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaTypeObjectKeyData gatDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectKeyData gatDeleteInIn) {
    super(id, context, "GeoAreaTypeDelete");
    gatDeleteIn = gatDeleteInIn;
  }

  public void translateToMap() {
    if (gatDeleteIn != null) {
      gatDeleteIn.resetFlags(true, true);
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(gatDeleteIn, new HashMap(), "GeoAreaTypeObjectKeyData").get("GeoAreaTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaType
 * @param gatDeleteInIn Value of the gatDeleteIn
 *
 */

  public void setGeoAreaType(GeoAreaTypeObjectKeyData gatDeleteInIn) {
    gatDeleteIn = gatDeleteInIn;
  }

  public void translateFromMap() {
    gatDeleteIn = GeoAreaTypeObjectKeyHelper.fromMap(inputMap, "GeoAreaType");
  }

/**
 *
 * Gets the GeoAreaType
 * @return Value of the GeoAreaType
 *
 */

  public GeoAreaTypeObjectKeyData getGeoAreaType( ) {
    return gatDeleteIn;
  }

}
