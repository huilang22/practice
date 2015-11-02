/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaAddressAssocFindBulkUdtTemplateItem.java
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
