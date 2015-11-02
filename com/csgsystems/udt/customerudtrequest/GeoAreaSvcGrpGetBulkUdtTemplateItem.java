/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGObjKeyData GeoAreaSvcGrpGetIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjKeyData GeoAreaSvcGrpGetInIn) {
    super(id, context, "GeoAreaSvcGrpGet");
    GeoAreaSvcGrpGetIn = GeoAreaSvcGrpGetInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpGetIn != null) {
      GeoAreaSvcGrpGetIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(GeoAreaSvcGrpGetIn, new HashMap(), "GASGObjKeyData").get("GASGObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrp
 * @param GeoAreaSvcGrpGetInIn Value of the GeoAreaSvcGrpGetIn
 *
 */

  public void setGeoAreaSvcGrp(GASGObjKeyData GeoAreaSvcGrpGetInIn) {
    GeoAreaSvcGrpGetIn = GeoAreaSvcGrpGetInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpGetIn = GASGObjKeyHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }

/**
 *
 * Gets the GeoAreaSvcGrp
 * @return Value of the GeoAreaSvcGrp
 *
 */

  public GASGObjKeyData getGeoAreaSvcGrp( ) {
    return GeoAreaSvcGrpGetIn;
  }

}
