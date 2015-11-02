/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGObjData GeoAreaSvcGrpUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjData GeoAreaSvcGrpUpdateInIn) {
    super(id, context, "GeoAreaSvcGrpUpdate");
    GeoAreaSvcGrpUpdateIn = GeoAreaSvcGrpUpdateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpUpdateIn != null) {
      GeoAreaSvcGrpUpdateIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpUpdateIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrp
 * @param GeoAreaSvcGrpUpdateInIn Value of the GeoAreaSvcGrpUpdateIn
 *
 */

  public void setGeoAreaSvcGrp(GASGObjData GeoAreaSvcGrpUpdateInIn) {
    GeoAreaSvcGrpUpdateIn = GeoAreaSvcGrpUpdateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpUpdateIn = GASGObjHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }

/**
 *
 * Gets the GeoAreaSvcGrp
 * @return Value of the GeoAreaSvcGrp
 *
 */

  public GASGObjData getGeoAreaSvcGrp( ) {
    return GeoAreaSvcGrpUpdateIn;
  }

}
