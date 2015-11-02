/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeoAreaAddressAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeoAreaAddressAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeoAreaAddressAssocObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeoAreaAddressAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeoAreaAddressAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeoAreaAddressAssocObjectDataList noOpInIn) {
    super(id, context, "GeoAreaAddressAssocFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = GeoAreaAddressAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeoAreaAddressAssoc", noOpIn);
      }
      addInput("GeoAreaAddressAssoc", mapList);
    }
  }
/**
 *
 * Sets the  GeoAreaAddressAssoc
 * @param noOpInIn GeoAreaAddressAssocObjectDataList to set
 *
 */
  public void setGeoAreaAddressAssoc(GeoAreaAddressAssocObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeoAreaAddressAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public GeoAreaAddressAssocObjectDataList getGeoAreaAddressAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeoAreaAddressAssocObjectHelper.fromMapList(inputMap, "GeoAreaAddressAssocList");
  }
}
