/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrVariableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrVariableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrVarObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrVariableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrVariableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrVarObjectDataList noOpInIn) {
    super(id, context, "RbrVariableFind");
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
        mapArray[i] = RbrVarObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrVariable", noOpIn);
      }
      addInput("RbrVariable", mapList);
    }
  }
/**
 *
 * Sets the  RbrVariable
 * @param noOpInIn RbrVarObjectDataList to set
 *
 */
  public void setRbrVariable(RbrVarObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrVariable passed into the constructor
 * @return Simulated response
 *
 */
  public RbrVarObjectDataList getRbrVariable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrVarObjectHelper.fromMapList(inputMap, "RbrVariableList");
  }
}
