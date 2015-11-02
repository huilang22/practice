/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaServiceabilityGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaServiceabilityGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASObjKeyData GeoAreaSvcGetIn;
/**
 *
 * Constructor to create a  GeoAreaServiceabilityGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaServiceabilityGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjKeyData GeoAreaSvcGetInIn) {
    super(id, context, "GeoAreaServiceabilityGet");
    GeoAreaSvcGetIn = GeoAreaSvcGetInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGetIn != null) {
      GeoAreaSvcGetIn.resetFlags(true, true);
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(GeoAreaSvcGetIn, new HashMap(), "GASObjKeyData").get("GASObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaServiceability
 * @param GeoAreaSvcGetInIn Value of the GeoAreaSvcGetIn
 *
 */

  public void setGeoAreaServiceability(GASObjKeyData GeoAreaSvcGetInIn) {
    GeoAreaSvcGetIn = GeoAreaSvcGetInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGetIn = GASObjKeyHelper.fromMap(inputMap, "GeoAreaServiceability");
  }

/**
 *
 * Gets the GeoAreaServiceability
 * @return Value of the GeoAreaServiceability
 *
 */

  public GASObjKeyData getGeoAreaServiceability( ) {
    return GeoAreaSvcGetIn;
  }

}
