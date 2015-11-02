/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaAddressAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaAddressAssocObjectData GAAACreateIn;
/**
 *
 * Constructor to create a  GeoAreaAddressAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectData GAAACreateInIn) {
    super(id, context, "GeoAreaAddressAssocCreate");
    GAAACreateIn = GAAACreateInIn;
  }

  public void translateToMap() {
    if (GAAACreateIn != null) {
      GAAACreateIn.resetFlags(true, true);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAACreateIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaAddressAssoc
 * @param GAAACreateInIn Value of the GAAACreateIn
 *
 */

  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectData GAAACreateInIn) {
    GAAACreateIn = GAAACreateInIn;
  }

  public void translateFromMap() {
    GAAACreateIn = GeoAreaAddressAssocObjectHelper.fromMap(inputMap, "GeoAreaAddressAssoc");
  }

/**
 *
 * Gets the GeoAreaAddressAssoc
 * @return Value of the GeoAreaAddressAssoc
 *
 */

  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssoc( ) {
    return GAAACreateIn;
  }

}
