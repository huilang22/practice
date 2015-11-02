/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GAObjectFilter GAFindIn;
/**
 *
 * Constructor to create a  GeoAreaFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GAObjectFilter GAFindInIn) {
    super(id, context, "GeoAreaFind");
    GAFindIn = GAFindInIn;
  }

  public void translateToMap() {
    if (GAFindIn != null) {
      Integer index =  GAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoArea", GAObjectHelper.toMap(GAFindIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }


/**
 *
 * Sets the GeoArea
 * @param GAFindInIn Value of the GAFindIn
 *
 */

  public void setGeoArea(GAObjectFilter GAFindInIn) {
    GAFindIn = GAFindInIn;
  }

  public void translateFromMap() {
    GAFindIn = GAObjectHelper.fromMapFilter(inputMap, "GeoArea");
  }

/**
 *
 * Gets the GeoArea
 * @return Value of the GeoArea
 *
 */

  public GAObjectFilter getGeoArea( ) {
    return GAFindIn;
  }

}
