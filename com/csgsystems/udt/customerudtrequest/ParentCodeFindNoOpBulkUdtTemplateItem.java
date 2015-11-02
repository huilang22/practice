/*
 * Generated code DO NOT EDIT
 * Generated file: ParentCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ParentCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ParentCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ParentCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ParentCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ParentCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectDataList noOpInIn) {
    super(id, context, "ParentCodeFind");
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
        mapArray[i] = ParentCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ParentCode", noOpIn);
      }
      addInput("ParentCode", mapList);
    }
  }
/**
 *
 * Sets the  ParentCode
 * @param noOpInIn ParentCodeObjectDataList to set
 *
 */
  public void setParentCode(ParentCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ParentCode passed into the constructor
 * @return Simulated response
 *
 */
  public ParentCodeObjectDataList getParentCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ParentCodeObjectHelper.fromMapList(inputMap, "ParentCodeList");
  }
}
