/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpDeleteBulkUdtTemplateItem.java
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
