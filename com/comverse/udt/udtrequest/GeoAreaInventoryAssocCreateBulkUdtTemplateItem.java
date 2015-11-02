/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaInventoryAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaInventoryAssocObjectData GAIACreateIn;
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectData GAIACreateInIn) {
    super(id, context, "GeoAreaInventoryAssocCreate");
    GAIACreateIn = GAIACreateInIn;
  }

  public void translateToMap() {
    if (GAIACreateIn != null) {
      GAIACreateIn.resetFlags(true, true);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIACreateIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaInventoryAssoc
 * @param GAIACreateInIn Value of the GAIACreateIn
 *
 */

  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectData GAIACreateInIn) {
    GAIACreateIn = GAIACreateInIn;
  }

  public void translateFromMap() {
    GAIACreateIn = GeoAreaInventoryAssocObjectHelper.fromMap(inputMap, "GeoAreaInventoryAssoc");
  }

/**
 *
 * Gets the GeoAreaInventoryAssoc
 * @return Value of the GeoAreaInventoryAssoc
 *
 */

  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssoc( ) {
    return GAIACreateIn;
  }

}
