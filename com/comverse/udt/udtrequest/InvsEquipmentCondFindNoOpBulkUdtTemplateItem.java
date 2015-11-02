/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentCondFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentCondFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentCondObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentCondFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentCondFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentCondObjectDataList noOpInIn) {
    super(id, context, "InvsEquipmentCondFind");
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
        mapArray[i] = InvsEquipmentCondObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentCond", noOpIn);
      }
      addInput("InvsEquipmentCond", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipmentCond
 * @param noOpInIn InvsEquipmentCondObjectDataList to set
 *
 */
  public void setInvsEquipmentCond(InvsEquipmentCondObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentCond passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentCondObjectDataList getInvsEquipmentCond() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentCondObjectHelper.fromMapList(inputMap, "InvsEquipmentCondList");
  }
}
