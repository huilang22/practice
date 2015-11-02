/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaAddressAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaAddressAssocObjectData GAAAUpdateIn;
/**
 *
 * Constructor to create a  GeoAreaAddressAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectData GAAAUpdateInIn) {
    super(id, context, "GeoAreaAddressAssocUpdate");
    GAAAUpdateIn = GAAAUpdateInIn;
  }

  public void translateToMap() {
    if (GAAAUpdateIn != null) {
      GAAAUpdateIn.resetFlags(true, true);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAAUpdateIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaAddressAssoc
 * @param GAAAUpdateInIn Value of the GAAAUpdateIn
 *
 */

  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectData GAAAUpdateInIn) {
    GAAAUpdateIn = GAAAUpdateInIn;
  }

  public void translateFromMap() {
    GAAAUpdateIn = GeoAreaAddressAssocObjectHelper.fromMap(inputMap, "GeoAreaAddressAssoc");
  }

/**
 *
 * Gets the GeoAreaAddressAssoc
 * @return Value of the GeoAreaAddressAssoc
 *
 */

  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssoc( ) {
    return GAAAUpdateIn;
  }

}
