/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectData noOpInIn) {
    super(id, context, "GeoAreaTypeDelete");
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
