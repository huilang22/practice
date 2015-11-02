/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaInventoryAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaInventoryAssocObjectData GAIAUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaInventoryAssocObjectData GAIAUpdateInIn) {
    super(id, context, "GeoAreaInventoryAssocUpdate");
    GAIAUpdateIn = GAIAUpdateInIn;
  }

  public void translateToMap() {
    if (GAIAUpdateIn != null) {
      GAIAUpdateIn.resetFlags(true, true);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIAUpdateIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaInventoryAssoc
 * @param GAIAUpdateInIn Value of the GAIAUpdateIn
 *
 */

  public void setGeoAreaInventoryAssoc(GeoAreaInventoryAssocObjectData GAIAUpdateInIn) {
    GAIAUpdateIn = GAIAUpdateInIn;
  }

  public void translateFromMap() {
    GAIAUpdateIn = GeoAreaInventoryAssocObjectHelper.fromMap(inputMap, "GeoAreaInventoryAssoc");
  }

/**
 *
 * Gets the GeoAreaInventoryAssoc
 * @return Value of the GeoAreaInventoryAssoc
 *
 */

  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssoc( ) {
    return GAIAUpdateIn;
  }

}
