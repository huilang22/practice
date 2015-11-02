/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobHistoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobHistoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobHistoryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvJobHistoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobHistoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobHistoryObjectDataList noOpInIn) {
    super(id, context, "InvJobHistoryFind");
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
        mapArray[i] = InvJobHistoryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobHistory", noOpIn);
      }
      addInput("InvJobHistory", mapList);
    }
  }
/**
 *
 * Sets the  InvJobHistory
 * @param noOpInIn InvJobHistoryObjectDataList to set
 *
 */
  public void setInvJobHistory(InvJobHistoryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobHistoryObjectDataList getInvJobHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobHistoryObjectHelper.fromMapList(inputMap, "InvJobHistoryList");
  }
}
