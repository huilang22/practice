/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaSvcGrpGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaSvcGrpGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASGObjData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaSvcGrpGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaSvcGrpGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjData noOpInIn) {
    super(id, context, "GeoAreaSvcGrpGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
/**
 *
 * Sets the  GeoAreaSvcGrp
 * @param noOpInIn GASGObjData to set
 *
 */
  public void setGeoAreaSvcGrp(GASGObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaSvcGrp passed into the constructor
 * @return Simulated response
 *
 */
  public GASGObjData getGeoAreaSvcGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASGObjHelper.fromMap(inputMap, "GeoAreaSvcGrp");
  }
}
