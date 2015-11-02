/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BPIObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BonusPointIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectDataList noOpInIn) {
    super(id, context, "BonusPointIdFind");
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
        mapArray[i] = BPIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointId", noOpIn);
      }
      addInput("BonusPointId", mapList);
    }
  }
/**
 *
 * Sets the  BonusPointId
 * @param noOpInIn BPIObjectDataList to set
 *
 */
  public void setBonusPointId(BPIObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointId passed into the constructor
 * @return Simulated response
 *
 */
  public BPIObjectDataList getBonusPointId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BPIObjectHelper.fromMapList(inputMap, "BonusPointIdList");
  }
}
