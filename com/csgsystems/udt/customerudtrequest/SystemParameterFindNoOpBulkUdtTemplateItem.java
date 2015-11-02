/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SystemParameterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SystemParameterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SPObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SystemParameterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SystemParameterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectDataList noOpInIn) {
    super(id, context, "SystemParameterFind");
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
        mapArray[i] = SPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SystemParameter", noOpIn);
      }
      addInput("SystemParameter", mapList);
    }
  }
/**
 *
 * Sets the  SystemParameter
 * @param noOpInIn SPObjectDataList to set
 *
 */
  public void setSystemParameter(SPObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SystemParameter passed into the constructor
 * @return Simulated response
 *
 */
  public SPObjectDataList getSystemParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SPObjectHelper.fromMapList(inputMap, "SystemParameterList");
  }
}
