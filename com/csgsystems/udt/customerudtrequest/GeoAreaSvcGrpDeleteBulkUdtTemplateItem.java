/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpDeleteBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGObjKeyData GeoAreaSvcGrpDeleteIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjKeyData GeoAreaSvcGrpDeleteInIn) {
    super(id, context, "GeoAreaSvcGrpDelete");
    GeoAreaSvcGrpDeleteIn = GeoAreaSvcGrpDeleteInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpDeleteIn != null) {
      GeoAreaSvcGrpDeleteIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(GeoAreaSvcGrpDeleteIn, new HashMap(), "GASGObjKeyData").get("GASGObjKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrp
 * @param GeoAreaSvcGrpDeleteInIn Value of the GeoAreaSvcGrpDeleteIn
 *
 */

  public void setGeoAreaSvcGrp(GASGObjKeyData GeoAreaSvcGrpDeleteInIn) {
    GeoAreaSvcGrpDeleteIn = GeoAreaSvcGrpDeleteInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpDeleteIn = GASGObjKeyHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }

/**
 *
 * Gets the GeoAreaSvcGrp
 * @return Value of the GeoAreaSvcGrp
 *
 */

  public GASGObjKeyData getGeoAreaSvcGrp( ) {
    return GeoAreaSvcGrpDeleteIn;
  }

}
