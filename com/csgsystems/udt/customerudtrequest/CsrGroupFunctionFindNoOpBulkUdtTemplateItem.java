/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupFunctionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrGroupFunctionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrGroupFunctionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrGroupFunctionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CsrGroupFunctionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrGroupFunctionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectDataList noOpInIn) {
    super(id, context, "CsrGroupFunctionFind");
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
        mapArray[i] = CsrGroupFunctionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrGroupFunction", noOpIn);
      }
      addInput("CsrGroupFunction", mapList);
    }
  }
/**
 *
 * Sets the  CsrGroupFunction
 * @param noOpInIn CsrGroupFunctionObjectDataList to set
 *
 */
  public void setCsrGroupFunction(CsrGroupFunctionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrGroupFunction passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupFunctionObjectDataList getCsrGroupFunction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrGroupFunctionObjectHelper.fromMapList(inputMap, "CsrGroupFunctionList");
  }
}
