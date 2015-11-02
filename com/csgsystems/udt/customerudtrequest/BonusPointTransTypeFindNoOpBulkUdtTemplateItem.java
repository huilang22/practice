/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointTransTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BonusPointTransTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointTransTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BonusPointTransTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BonusPointTransTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointTransTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectDataList noOpInIn) {
    super(id, context, "BonusPointTransTypeFind");
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
        mapArray[i] = BonusPointTransTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointTransType", noOpIn);
      }
      addInput("BonusPointTransType", mapList);
    }
  }
/**
 *
 * Sets the  BonusPointTransType
 * @param noOpInIn BonusPointTransTypeObjectDataList to set
 *
 */
  public void setBonusPointTransType(BonusPointTransTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointTransType passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointTransTypeObjectDataList getBonusPointTransType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BonusPointTransTypeObjectHelper.fromMapList(inputMap, "BonusPointTransTypeList");
  }
}
