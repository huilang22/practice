/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdQueueAutoRetryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdQueueAutoRetryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdQueueAutoRetryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdQueueAutoRetryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdQueueAutoRetryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectDataList noOpInIn) {
    super(id, context, "BsdQueueAutoRetryFind");
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
        mapArray[i] = BsdQueueAutoRetryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdQueueAutoRetry", noOpIn);
      }
      addInput("BsdQueueAutoRetry", mapList);
    }
  }
/**
 *
 * Sets the  BsdQueueAutoRetry
 * @param noOpInIn BsdQueueAutoRetryObjectDataList to set
 *
 */
  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdQueueAutoRetry passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueAutoRetryObjectDataList getBsdQueueAutoRetry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdQueueAutoRetryObjectHelper.fromMapList(inputMap, "BsdQueueAutoRetryList");
  }
}
