/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipTxnPreconditionsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipTxnPreconditionsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipTxnPreconditionsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipTxnPreconditionsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipTxnPreconditionsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipTxnPreconditionsObjectDataList noOpInIn) {
    super(id, context, "InvsEquipTxnPreconditionsFind");
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
        mapArray[i] = InvsEquipTxnPreconditionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipTxnPreconditions", noOpIn);
      }
      addInput("InvsEquipTxnPreconditions", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipTxnPreconditions
 * @param noOpInIn InvsEquipTxnPreconditionsObjectDataList to set
 *
 */
  public void setInvsEquipTxnPreconditions(InvsEquipTxnPreconditionsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipTxnPreconditions passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPreconditionsObjectDataList getInvsEquipTxnPreconditions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipTxnPreconditionsObjectHelper.fromMapList(inputMap, "InvsEquipTxnPreconditionsList");
  }
}
