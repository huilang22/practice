/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GAObjectKeyData GAGetIn;
/**
 *
 * Constructor to create a  GeoAreaGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectKeyData GAGetInIn) {
    super(id, context, "GeoAreaGet");
    GAGetIn = GAGetInIn;
  }

  public void translateToMap() {
    if (GAGetIn != null) {
      GAGetIn.resetFlags(true, true);
      addInput("GeoArea", GAObjectKeyHelper.toMap(GAGetIn, new HashMap(), "GAObjectKeyData").get("GAObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoArea
 * @param GAGetInIn Value of the GAGetIn
 *
 */

  public void setGeoArea(GAObjectKeyData GAGetInIn) {
    GAGetIn = GAGetInIn;
  }

  public void translateFromMap() {
    GAGetIn = GAObjectKeyHelper.fromMap(inputMap, "GeoArea");
  }

/**
 *
 * Gets the GeoArea
 * @return Value of the GeoArea
 *
 */

  public GAObjectKeyData getGeoArea( ) {
    return GAGetIn;
  }

}
