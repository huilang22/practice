/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmParamTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmParamTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmParamTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtmParamTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmParamTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectDataList noOpInIn) {
    super(id, context, "CtmParamTypeFind");
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
        mapArray[i] = CtmParamTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmParamType", noOpIn);
      }
      addInput("CtmParamType", mapList);
    }
  }
/**
 *
 * Sets the  CtmParamType
 * @param noOpInIn CtmParamTypeObjectDataList to set
 *
 */
  public void setCtmParamType(CtmParamTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmParamType passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamTypeObjectDataList getCtmParamType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmParamTypeObjectHelper.fromMapList(inputMap, "CtmParamTypeList");
  }
}
