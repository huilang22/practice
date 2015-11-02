/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BalanceXferDiffFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceXferDiffFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BXDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BalanceXferDiffFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceXferDiffFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectDataList noOpInIn) {
    super(id, context, "BalanceXferDiffFind");
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
        mapArray[i] = BXDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BalanceXferDiff", noOpIn);
      }
      addInput("BalanceXferDiff", mapList);
    }
  }
/**
 *
 * Sets the  BalanceXferDiff
 * @param noOpInIn BXDObjectDataList to set
 *
 */
  public void setBalanceXferDiff(BXDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BalanceXferDiff passed into the constructor
 * @return Simulated response
 *
 */
  public BXDObjectDataList getBalanceXferDiff() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BXDObjectHelper.fromMapList(inputMap, "BalanceXferDiffList");
  }
}
