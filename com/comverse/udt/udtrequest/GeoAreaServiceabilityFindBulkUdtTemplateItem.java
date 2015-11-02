/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaServiceabilityFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaServiceabilityFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASObjFilter GeoAreaSvcFindIn;
/**
 *
 * Constructor to create a  GeoAreaServiceabilityFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaServiceabilityFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GASObjFilter GeoAreaSvcFindInIn) {
    super(id, context, "GeoAreaServiceabilityFind");
    GeoAreaSvcFindIn = GeoAreaSvcFindInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcFindIn != null) {
      Integer index =  GeoAreaSvcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcFindIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }


/**
 *
 * Sets the GeoAreaServiceability
 * @param GeoAreaSvcFindInIn Value of the GeoAreaSvcFindIn
 *
 */

  public void setGeoAreaServiceability(GASObjFilter GeoAreaSvcFindInIn) {
    GeoAreaSvcFindIn = GeoAreaSvcFindInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcFindIn = GASObjHelper.fromMapFilter(inputMap, "GeoAreaServiceability");
  }

/**
 *
 * Gets the GeoAreaServiceability
 * @return Value of the GeoAreaServiceability
 *
 */

  public GASObjFilter getGeoAreaServiceability( ) {
    return GeoAreaSvcFindIn;
  }

}
