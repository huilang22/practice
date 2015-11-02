/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpFindBulkUdtTemplateItem.java
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
 * Class used to create a GeoAreaSvcGrpFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaSvcGrpFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GASGObjFilter GeoAreaSvcGrpFindIn;
/**
 *
 * Constructor to create a  GeoAreaSvcGrpFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaSvcGrpFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GASGObjFilter GeoAreaSvcGrpFindInIn) {
    super(id, context, "GeoAreaSvcGrpFind");
    GeoAreaSvcGrpFindIn = GeoAreaSvcGrpFindInIn;
  }

  public void translateToMap() {
    if (GeoAreaSvcGrpFindIn != null) {
      Integer index =  GeoAreaSvcGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(GeoAreaSvcGrpFindIn, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }


/**
 *
 * Sets the GeoAreaSvcGrp
 * @param GeoAreaSvcGrpFindInIn Value of the GeoAreaSvcGrpFindIn
 *
 */

  public void setGeoAreaSvcGrp(GASGObjFilter GeoAreaSvcGrpFindInIn) {
    GeoAreaSvcGrpFindIn = GeoAreaSvcGrpFindInIn;
  }

  public void translateFromMap() {
    GeoAreaSvcGrpFindIn = GASGObjHelper.fromMapFilter(inputMap, "GeoAreaSvcGrp");
  }

/**
 *
 * Gets the GeoAreaSvcGrp
 * @return Value of the GeoAreaSvcGrp
 *
 */

  public GASGObjFilter getGeoAreaSvcGrp( ) {
    return GeoAreaSvcGrpFindIn;
  }

}
