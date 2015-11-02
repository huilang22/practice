/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentTxnFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentTxnObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentTxnFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentTxnFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnObjectDataList noOpInIn) {
    super(id, context, "InvsEquipmentTxnFind");
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
        mapArray[i] = InvsEquipmentTxnObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentTxn", noOpIn);
      }
      addInput("InvsEquipmentTxn", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipmentTxn
 * @param noOpInIn InvsEquipmentTxnObjectDataList to set
 *
 */
  public void setInvsEquipmentTxn(InvsEquipmentTxnObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentTxn passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnObjectDataList getInvsEquipmentTxn() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentTxnObjectHelper.fromMapList(inputMap, "InvsEquipmentTxnList");
  }
}
