/*
 * Generated code DO NOT EDIT
 * Generated file: LbxPaymentTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LbxPaymentTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LbxPaymentTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LbxPaymentTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LbxPaymentTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LbxPaymentTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LbxPaymentTypeObjectDataList noOpInIn) {
    super(id, context, "LbxPaymentTypeFind");
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
        mapArray[i] = LbxPaymentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LbxPaymentType", noOpIn);
      }
      addInput("LbxPaymentType", mapList);
    }
  }
/**
 *
 * Sets the  LbxPaymentType
 * @param noOpInIn LbxPaymentTypeObjectDataList to set
 *
 */
  public void setLbxPaymentType(LbxPaymentTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LbxPaymentType passed into the constructor
 * @return Simulated response
 *
 */
  public LbxPaymentTypeObjectDataList getLbxPaymentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LbxPaymentTypeObjectHelper.fromMapList(inputMap, "LbxPaymentTypeList");
  }
}
