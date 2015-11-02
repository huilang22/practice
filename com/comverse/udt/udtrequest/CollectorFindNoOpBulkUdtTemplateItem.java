/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CollectorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CollectorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CollectorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CollectorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectorObjectDataList noOpInIn) {
    super(id, context, "CollectorFind");
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
        mapArray[i] = CollectorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Collector", noOpIn);
      }
      addInput("Collector", mapList);
    }
  }
/**
 *
 * Sets the  Collector
 * @param noOpInIn CollectorObjectDataList to set
 *
 */
  public void setCollector(CollectorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Collector passed into the constructor
 * @return Simulated response
 *
 */
  public CollectorObjectDataList getCollector() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CollectorObjectHelper.fromMapList(inputMap, "CollectorList");
  }
}
