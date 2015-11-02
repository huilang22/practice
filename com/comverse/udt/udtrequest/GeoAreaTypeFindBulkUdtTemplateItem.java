/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeoAreaTypeObjectFilter gatFindIn;
/**
 *
 * Constructor to create a  GeoAreaTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaTypeObjectFilter gatFindInIn) {
    super(id, context, "GeoAreaTypeFind");
    gatFindIn = gatFindInIn;
  }

  public void translateToMap() {
    if (gatFindIn != null) {
      Integer index =  gatFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatFindIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }


/**
 *
 * Sets the GeoAreaType
 * @param gatFindInIn Value of the gatFindIn
 *
 */

  public void setGeoAreaType(GeoAreaTypeObjectFilter gatFindInIn) {
    gatFindIn = gatFindInIn;
  }

  public void translateFromMap() {
    gatFindIn = GeoAreaTypeObjectHelper.fromMapFilter(inputMap, "GeoAreaType");
  }

/**
 *
 * Gets the GeoAreaType
 * @return Value of the GeoAreaType
 *
 */

  public GeoAreaTypeObjectFilter getGeoAreaType( ) {
    return gatFindIn;
  }

}
