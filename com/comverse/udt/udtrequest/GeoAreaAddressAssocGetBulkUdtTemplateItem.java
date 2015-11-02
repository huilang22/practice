/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaAddressAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaAddressAssocObjectKeyData GAAAGetIn;
/**
 *
 * Constructor to create a  GeoAreaAddressAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectKeyData GAAAGetInIn) {
    super(id, context, "GeoAreaAddressAssocGet");
    GAAAGetIn = GAAAGetInIn;
  }

  public void translateToMap() {
    if (GAAAGetIn != null) {
      GAAAGetIn.resetFlags(true, true);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectKeyHelper.toMap(GAAAGetIn, new HashMap(), "GeoAreaAddressAssocObjectKeyData").get("GeoAreaAddressAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the GeoAreaAddressAssoc
 * @param GAAAGetInIn Value of the GAAAGetIn
 *
 */

  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectKeyData GAAAGetInIn) {
    GAAAGetIn = GAAAGetInIn;
  }

  public void translateFromMap() {
    GAAAGetIn = GeoAreaAddressAssocObjectKeyHelper.fromMap(inputMap, "GeoAreaAddressAssoc");
  }

/**
 *
 * Gets the GeoAreaAddressAssoc
 * @return Value of the GeoAreaAddressAssoc
 *
 */

  public GeoAreaAddressAssocObjectKeyData getGeoAreaAddressAssoc( ) {
    return GAAAGetIn;
  }

}
