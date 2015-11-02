/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaInventoryAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaInventoryAssocObjectFilter GAIAFindIn;
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectFilter GAIAFindInIn) {
    super(id, context, "GeoAreaInventoryAssocFind");
    GAIAFindIn = GAIAFindInIn;
  }

  public void translateToMap() {
    if (GAIAFindIn != null) {
      Integer index =  GAIAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIAFindIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaInventoryAssoc
 * @param GAIAFindInIn Value of the GAIAFindIn
 *
 */

  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectFilter GAIAFindInIn) {
    GAIAFindIn = GAIAFindInIn;
  }

  public void translateFromMap() {
    GAIAFindIn = GeoAreaInventoryAssocObjectHelper.fromMapFilter(inputMap, "GeoAreaInventoryAssoc");
  }

/**
 *
 * Gets the GeoAreaInventoryAssoc
 * @return Value of the GeoAreaInventoryAssoc
 *
 */

  public GeoAreaInventoryAssocObjectFilter getGeoAreaInventoryAssoc( ) {
    return GAIAFindIn;
  }

}
