/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaAddressAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaAddressAssocObjectFilter GAAAFindIn;
/**
 *
 * Constructor to create a  GeoAreaAddressAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectFilter GAAAFindInIn) {
    super(id, context, "GeoAreaAddressAssocFind");
    GAAAFindIn = GAAAFindInIn;
  }

  public void translateToMap() {
    if (GAAAFindIn != null) {
      Integer index =  GAAAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAAFindIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }


/**
 *
 * Sets the GeoAreaAddressAssoc
 * @param GAAAFindInIn Value of the GAAAFindIn
 *
 */

  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectFilter GAAAFindInIn) {
    GAAAFindIn = GAAAFindInIn;
  }

  public void translateFromMap() {
    GAAAFindIn = GeoAreaAddressAssocObjectHelper.fromMapFilter(inputMap, "GeoAreaAddressAssoc");
  }

/**
 *
 * Gets the GeoAreaAddressAssoc
 * @return Value of the GeoAreaAddressAssoc
 *
 */

  public GeoAreaAddressAssocObjectFilter getGeoAreaAddressAssoc( ) {
    return GAAAFindIn;
  }

}
