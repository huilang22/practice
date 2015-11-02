/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGObjData GeoAreaSvcGrpCreateIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjData GeoAreaSvcGrpCreateInIn) {
    super(id, context, "GeoAreaSvcGrpCreate");
    GeoAreaSvcGrpCreateIn = GeoAreaSvcGrpCreateInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpCreateIn != null) {
      GeoAreaSvcGrpCreateIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpCreateIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrp
 * @param GeoAreaSvcGrpCreateInIn Value of the GeoAreaSvcGrpCreateIn
 *
 */

  public void setGeoAreaSvcGrp(GASGObjData GeoAreaSvcGrpCreateInIn) {
    GeoAreaSvcGrpCreateIn = GeoAreaSvcGrpCreateInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpCreateIn = GASGObjHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }

/**
 *
 * Gets the GeoAreaSvcGrp
 * @return Value of the GeoAreaSvcGrp
 *
 */

  public GASGObjData getGeoAreaSvcGrp( ) {
    return GeoAreaSvcGrpCreateIn;
  }

}
