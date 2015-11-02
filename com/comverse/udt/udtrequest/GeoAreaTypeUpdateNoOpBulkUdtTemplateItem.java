/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectData noOpInIn) {
    super(id, context, "GeoAreaTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(noOpIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
/**
 *
 * Sets the  GeoAreaType
 * @param noOpInIn GeoAreaTypeObjectData to set
 *
 */
  public void setGeoAreaType(GeoAreaTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaType passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaTypeObjectData getGeoAreaType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaTypeObjectHelper.fromMap(inputMap, "GeoAreaType");
  }
}
