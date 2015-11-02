/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GAObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectData noOpInIn) {
    super(id, context, "GeoAreaUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoArea", GAObjectHelper.toMap(noOpIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
/**
 *
 * Sets the  GeoArea
 * @param noOpInIn GAObjectData to set
 *
 */
  public void setGeoArea(GAObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoArea passed into the constructor
 * @return Simulated response
 *
 */
  public GAObjectData getGeoArea() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GAObjectHelper.fromMap(inputMap, "GeoArea");
  }
}
