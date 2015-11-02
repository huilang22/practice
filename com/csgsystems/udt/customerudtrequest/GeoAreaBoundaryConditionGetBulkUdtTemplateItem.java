/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryConditionGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaBoundaryConditionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaBoundaryConditionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaBoundaryConditionObjectKeyData GABCGetIn;
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaBoundaryConditionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaBoundaryConditionObjectKeyData GABCGetInIn) {
    super(id, context, "GeoAreaBoundaryConditionGet");
    GABCGetIn = GABCGetInIn;
  }

  public void translateToMap() {
    if (GABCGetIn != null) {
      GABCGetIn.resetFlags(true, true);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(GABCGetIn, new HashMap(), "GeoAreaBoundaryConditionObjectKeyData").get("GeoAreaBoundaryConditionObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaBoundaryCondition
 * @param GABCGetInIn Value of the GABCGetIn
 *
 */

  public void setGeoAreaBoundaryCondition(GeoAreaBoundaryConditionObjectKeyData GABCGetInIn) {
    GABCGetIn = GABCGetInIn;
  }

  public void translateFromMap() {
    GABCGetIn = GeoAreaBoundaryConditionObjectKeyHelper.fromMap(inputMap, "GeoAreaBoundaryCondition");
  }

/**
 *
 * Gets the GeoAreaBoundaryCondition
 * @return Value of the GeoAreaBoundaryCondition
 *
 */

  public GeoAreaBoundaryConditionObjectKeyData getGeoAreaBoundaryCondition( ) {
    return GABCGetIn;
  }

}
