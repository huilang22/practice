/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EquipClassCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EquipClassCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ECCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EquipClassCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EquipClassCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectDataList noOpInIn) {
    super(id, context, "EquipClassCodeFind");
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
        mapArray[i] = ECCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EquipClassCode", noOpIn);
      }
      addInput("EquipClassCode", mapList);
    }
  }
/**
 *
 * Sets the  EquipClassCode
 * @param noOpInIn ECCObjectDataList to set
 *
 */
  public void setEquipClassCode(ECCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EquipClassCode passed into the constructor
 * @return Simulated response
 *
 */
  public ECCObjectDataList getEquipClassCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ECCObjectHelper.fromMapList(inputMap, "EquipClassCodeList");
  }
}
