/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GeocodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeocodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeocodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeocodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeocodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeocodeObjectDataList noOpInIn) {
    super(id, context, "GeocodeFind");
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
        mapArray[i] = GeocodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Geocode", noOpIn);
      }
      addInput("Geocode", mapList);
    }
  }
/**
 *
 * Sets the  Geocode
 * @param noOpInIn GeocodeObjectDataList to set
 *
 */
  public void setGeocode(GeocodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Geocode passed into the constructor
 * @return Simulated response
 *
 */
  public GeocodeObjectDataList getGeocode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeocodeObjectHelper.fromMapList(inputMap, "GeocodeList");
  }
}
