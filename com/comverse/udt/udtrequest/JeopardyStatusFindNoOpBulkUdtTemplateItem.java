/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a JeopardyStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JeopardyStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JeopardyStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   JeopardyStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JeopardyStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectDataList noOpInIn) {
    super(id, context, "JeopardyStatusFind");
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
        mapArray[i] = JeopardyStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("JeopardyStatus", noOpIn);
      }
      addInput("JeopardyStatus", mapList);
    }
  }
/**
 *
 * Sets the  JeopardyStatus
 * @param noOpInIn JeopardyStatusObjectDataList to set
 *
 */
  public void setJeopardyStatus(JeopardyStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the JeopardyStatus passed into the constructor
 * @return Simulated response
 *
 */
  public JeopardyStatusObjectDataList getJeopardyStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JeopardyStatusObjectHelper.fromMapList(inputMap, "JeopardyStatusList");
  }
}
