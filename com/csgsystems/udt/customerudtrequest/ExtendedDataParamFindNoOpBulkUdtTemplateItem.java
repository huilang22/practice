/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataParamFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataParamFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected XPDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataParamFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataParamFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectDataList noOpInIn) {
    super(id, context, "ExtendedDataParamFind");
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
        mapArray[i] = XPDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataParam", noOpIn);
      }
      addInput("ExtendedDataParam", mapList);
    }
  }
/**
 *
 * Sets the  ExtendedDataParam
 * @param noOpInIn XPDObjectDataList to set
 *
 */
  public void setExtendedDataParam(XPDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataParam passed into the constructor
 * @return Simulated response
 *
 */
  public XPDObjectDataList getExtendedDataParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = XPDObjectHelper.fromMapList(inputMap, "ExtendedDataParamList");
  }
}
