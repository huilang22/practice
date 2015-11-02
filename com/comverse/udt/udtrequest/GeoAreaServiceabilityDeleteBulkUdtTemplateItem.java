/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaServiceabilityDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaServiceabilityDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASObjKeyData GeoAreaSvcDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaServiceabilityDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaServiceabilityDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjKeyData GeoAreaSvcDeleteInIn) {
    super(id, context, "GeoAreaServiceabilityDelete");
    GeoAreaSvcDeleteIn = GeoAreaSvcDeleteInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcDeleteIn != null) {
      GeoAreaSvcDeleteIn.resetFlags(true, true);
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(GeoAreaSvcDeleteIn, new HashMap(), "GASObjKeyData").get("GASObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaServiceability
 * @param GeoAreaSvcDeleteInIn Value of the GeoAreaSvcDeleteIn
 *
 */

  public void setGeoAreaServiceability(GASObjKeyData GeoAreaSvcDeleteInIn) {
    GeoAreaSvcDeleteIn = GeoAreaSvcDeleteInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcDeleteIn = GASObjKeyHelper.fromMap(inputMap, "GeoAreaServiceability");
  }

/**
 *
 * Gets the GeoAreaServiceability
 * @return Value of the GeoAreaServiceability
 *
 */

  public GASObjKeyData getGeoAreaServiceability( ) {
    return GeoAreaSvcDeleteIn;
  }

}
