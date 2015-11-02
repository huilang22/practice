/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeComponentsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GeocodeComponentsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GeocodeComponentsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GeocodeComponentsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GeocodeComponentsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GeocodeComponentsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GeocodeComponentsObjectDataList noOpInIn) {
    super(id, context, "GeocodeComponentsFind");
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
        mapArray[i] = GeocodeComponentsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GeocodeComponents", noOpIn);
      }
      addInput("GeocodeComponents", mapList);
    }
  }
/**
 *
 * Sets the  GeocodeComponents
 * @param noOpInIn GeocodeComponentsObjectDataList to set
 *
 */
  public void setGeocodeComponents(GeocodeComponentsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GeocodeComponents passed into the constructor
 * @return Simulated response
 *
 */
  public GeocodeComponentsObjectDataList getGeocodeComponents() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GeocodeComponentsObjectHelper.fromMapList(inputMap, "GeocodeComponentsList");
  }
}
