/*
 * Generated code DO NOT EDIT
 * Generated file: EquipTypeCodeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EquipTypeCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EquipTypeCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ETGObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EquipTypeCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EquipTypeCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectDataList noOpInIn) {
    super(id, context, "EquipTypeCodeFind");
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
        mapArray[i] = ETGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EquipTypeCode", noOpIn);
      }
      addInput("EquipTypeCode", mapList);
    }
  }
/**
 *
 * Sets the  EquipTypeCode
 * @param noOpInIn ETGObjectDataList to set
 *
 */
  public void setEquipTypeCode(ETGObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EquipTypeCode passed into the constructor
 * @return Simulated response
 *
 */
  public ETGObjectDataList getEquipTypeCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ETGObjectHelper.fromMapList(inputMap, "EquipTypeCodeList");
  }
}
