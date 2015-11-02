/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAutoAssociateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a GeoAreaInventoryAutoAssociateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaInventoryAutoAssociateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaInventoryAutoAssociateOutputData noOpIn;

/**
 *
 * Constructor to create a   GeoAreaInventoryAutoAssociateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaInventoryAutoAssociateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAutoAssociateOutputData noOpInIn) {
    super(id, context, "GeoAreaInventoryAutoAssociate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GeoAreaInventoryAutoAssociateOutputData", GeoAreaInventoryAutoAssociateOutputHelper.toMap(noOpIn).get("GeoAreaInventoryAutoAssociateOutputData"));
    }
  }
/**
 *
 * Sets the  GeoAreaInventoryAutoAssociateOutputData
 * @param noOpInIn GeoAreaInventoryAutoAssociateOutputData to set
 *
 */
  public void setGeoAreaInventoryAutoAssociateOutputData(GeoAreaInventoryAutoAssociateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaInventoryAutoAssociateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaInventoryAutoAssociateOutputData getGeoAreaInventoryAutoAssociateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaInventoryAutoAssociateOutputHelper.fromMap(inputMap);
  }
}
