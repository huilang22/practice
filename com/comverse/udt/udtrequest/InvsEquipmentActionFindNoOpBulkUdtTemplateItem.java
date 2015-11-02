/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentActionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionObjectDataList noOpInIn) {
    super(id, context, "InvsEquipmentActionFind");
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
        mapArray[i] = InvsEquipmentActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentAction", noOpIn);
      }
      addInput("InvsEquipmentAction", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipmentAction
 * @param noOpInIn InvsEquipmentActionObjectDataList to set
 *
 */
  public void setInvsEquipmentAction(InvsEquipmentActionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentAction passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionObjectDataList getInvsEquipmentAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentActionObjectHelper.fromMapList(inputMap, "InvsEquipmentActionList");
  }
}
