/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaInventoryAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaInventoryAssocObjectKeyData GAIAGetIn;
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectKeyData GAIAGetInIn) {
    super(id, context, "GeoAreaInventoryAssocGet");
    GAIAGetIn = GAIAGetInIn;
  }

  public void translateToMap() {
    if (GAIAGetIn != null) {
      GAIAGetIn.resetFlags(true, true);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectKeyHelper.toMap(GAIAGetIn, new HashMap(), "GeoAreaInventoryAssocObjectKeyData").get("GeoAreaInventoryAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaInventoryAssoc
 * @param GAIAGetInIn Value of the GAIAGetIn
 *
 */

  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectKeyData GAIAGetInIn) {
    GAIAGetIn = GAIAGetInIn;
  }

  public void translateFromMap() {
    GAIAGetIn = GeoAreaInventoryAssocObjectKeyHelper.fromMap(inputMap, "GeoAreaInventoryAssoc");
  }

/**
 *
 * Gets the GeoAreaInventoryAssoc
 * @return Value of the GeoAreaInventoryAssoc
 *
 */

  public GeoAreaInventoryAssocObjectKeyData getGeoAreaInventoryAssoc( ) {
    return GAIAGetIn;
  }

}
