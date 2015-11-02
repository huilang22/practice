/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaServiceabilityUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a GeoAreaServiceabilityUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaServiceabilityUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASObjData GeoAreaSvcUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaServiceabilityUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaServiceabilityUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjData GeoAreaSvcUpdateInIn) {
    super(id, context, "GeoAreaServiceabilityUpdate");
    GeoAreaSvcUpdateIn = GeoAreaSvcUpdateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcUpdateIn != null) {
      GeoAreaSvcUpdateIn.resetFlags(true, true);
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcUpdateIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }


/**
 *
 * Sets the GeoAreaServiceability
 * @param GeoAreaSvcUpdateInIn Value of the GeoAreaSvcUpdateIn
 *
 */

  public void setGeoAreaServiceability(GASObjData GeoAreaSvcUpdateInIn) {
    GeoAreaSvcUpdateIn = GeoAreaSvcUpdateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcUpdateIn = GASObjHelper.fromMap(inputMap, "GeoAreaServiceability");
  }

/**
 *
 * Gets the GeoAreaServiceability
 * @return Value of the GeoAreaServiceability
 *
 */

  public GASObjData getGeoAreaServiceability( ) {
    return GeoAreaSvcUpdateIn;
  }

}
