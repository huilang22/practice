/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaServiceabilityDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaServiceabilityDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaServiceabilityDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GASObjData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaServiceabilityDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaServiceabilityDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjData noOpInIn) {
    super(id, context, "GeoAreaServiceabilityDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaServiceability", GASObjHelper.toMap(noOpIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
/**
 *
 * Sets the  GeoAreaServiceability
 * @param noOpInIn GASObjData to set
 *
 */
  public void setGeoAreaServiceability(GASObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaServiceability passed into the constructor
 * @return Simulated response
 *
 */
  public GASObjData getGeoAreaServiceability() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GASObjHelper.fromMap(inputMap, "GeoAreaServiceability");
  }
}
