/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DistanceBandFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DistanceBandFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DistanceBandFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DistanceBandObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DistanceBandFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DistanceBandFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DistanceBandObjectDataList noOpInIn) {
    super(id, context, "DistanceBandFind");
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
        mapArray[i] = DistanceBandObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DistanceBand", noOpIn);
      }
      addInput("DistanceBand", mapList);
    }
  }
/**
 *
 * Sets the  DistanceBand
 * @param noOpInIn DistanceBandObjectDataList to set
 *
 */
  public void setDistanceBand(DistanceBandObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DistanceBand passed into the constructor
 * @return Simulated response
 *
 */
  public DistanceBandObjectDataList getDistanceBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DistanceBandObjectHelper.fromMapList(inputMap, "DistanceBandList");
  }
}
