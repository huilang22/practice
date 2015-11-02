/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GAObjectData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectData noOpInIn) {
    super(id, context, "GeoAreaDelete");
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
