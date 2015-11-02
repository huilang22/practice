/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdQueueFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdQueueFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdQueueObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdQueueFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdQueueFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectDataList noOpInIn) {
    super(id, context, "BsdQueueFind");
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
        mapArray[i] = BsdQueueObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdQueue", noOpIn);
      }
      addInput("BsdQueue", mapList);
    }
  }
/**
 *
 * Sets the  BsdQueue
 * @param noOpInIn BsdQueueObjectDataList to set
 *
 */
  public void setBsdQueue(BsdQueueObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdQueue passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueObjectDataList getBsdQueue() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdQueueObjectHelper.fromMapList(inputMap, "BsdQueueList");
  }
}
