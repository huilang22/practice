/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaServiceabilityCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaServiceabilityCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASObjData GeoAreaSvcCreateIn;
/**
 *
 * Constructor to create a  GeoAreaServiceabilityCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaServiceabilityCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjData GeoAreaSvcCreateInIn) {
    super(id, context, "GeoAreaServiceabilityCreate");
    GeoAreaSvcCreateIn = GeoAreaSvcCreateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcCreateIn != null) {
      GeoAreaSvcCreateIn.resetFlags(true, true);
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcCreateIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }


/**
 *
 * Sets the GeoAreaServiceability
 * @param GeoAreaSvcCreateInIn Value of the GeoAreaSvcCreateIn
 *
 */

  public void setGeoAreaServiceability(GASObjData GeoAreaSvcCreateInIn) {
    GeoAreaSvcCreateIn = GeoAreaSvcCreateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcCreateIn = GASObjHelper.fromMap(inputMap, "GeoAreaServiceability");
  }

/**
 *
 * Gets the GeoAreaServiceability
 * @return Value of the GeoAreaServiceability
 *
 */

  public GASObjData getGeoAreaServiceability( ) {
    return GeoAreaSvcCreateIn;
  }

}
