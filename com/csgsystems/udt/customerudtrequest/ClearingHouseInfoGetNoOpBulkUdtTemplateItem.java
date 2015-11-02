/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseInfoGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClearingHouseInfoGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseInfoGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseInfoObjectData noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseInfoGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseInfoGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseInfoObjectData noOpInIn) {
    super(id, context, "ClearingHouseInfoGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(noOpIn, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }
/**
 *
 * Sets the  ClearingHouseInfo
 * @param noOpInIn ClearingHouseInfoObjectData to set
 *
 */
  public void setClearingHouseInfo(ClearingHouseInfoObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouseInfo passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseInfoObjectData getClearingHouseInfo() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseInfoObjectHelper.fromMap(inputMap, "ClearingHouseInfo");
  }
}
