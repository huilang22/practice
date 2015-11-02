/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvHistoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvHistoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvHistoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvHistoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvHistoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvHistoryObjectDataList noOpInIn) {
    super(id, context, "InvHistoryFind");
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
        mapArray[i] = InvHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvHistory", noOpIn);
      }
      addInput("InvHistory", mapList);
    }
  }
/**
 *
 * Sets the  InvHistory
 * @param noOpInIn InvHistoryObjectDataList to set
 *
 */
  public void setInvHistory(InvHistoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvHistoryObjectDataList getInvHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvHistoryObjectHelper.fromMapList(inputMap, "InvHistoryList");
  }
}
