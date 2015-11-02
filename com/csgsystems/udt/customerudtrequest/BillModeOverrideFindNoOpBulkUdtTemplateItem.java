/*
 * Generated code DO NOT EDIT
 * Generated file: BillModeOverrideFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillModeOverrideFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillModeOverrideFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BMOObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillModeOverrideFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillModeOverrideFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectDataList noOpInIn) {
    super(id, context, "BillModeOverrideFind");
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
        mapArray[i] = BMOObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillModeOverride", noOpIn);
      }
      addInput("BillModeOverride", mapList);
    }
  }
/**
 *
 * Sets the  BillModeOverride
 * @param noOpInIn BMOObjectDataList to set
 *
 */
  public void setBillModeOverride(BMOObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillModeOverride passed into the constructor
 * @return Simulated response
 *
 */
  public BMOObjectDataList getBillModeOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BMOObjectHelper.fromMapList(inputMap, "BillModeOverrideList");
  }
}
