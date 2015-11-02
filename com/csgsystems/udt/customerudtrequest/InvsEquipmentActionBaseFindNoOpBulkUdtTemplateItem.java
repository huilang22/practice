/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionBaseFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a InvsEquipmentActionBaseFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentActionBaseFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentActionBaseObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentActionBaseFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentActionBaseFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentActionBaseObjectDataList noOpInIn) {
    super(id, context, "InvsEquipmentActionBaseFind");
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
        mapArray[i] = InvsEquipmentActionBaseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentAction", noOpIn);
      }
      addInput("InvsEquipmentAction", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipmentAction
 * @param noOpInIn InvsEquipmentActionBaseObjectDataList to set
 *
 */
  public void setInvsEquipmentAction(InvsEquipmentActionBaseObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentAction passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentActionBaseObjectDataList getInvsEquipmentAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentActionBaseObjectHelper.fromMapList(inputMap, "InvsEquipmentActionList");
  }
}
