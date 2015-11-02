/*
 * Generated code DO NOT EDIT
 * Generated file: BsdExceptionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdExceptionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdExceptionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdExceptionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdExceptionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdExceptionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectDataList noOpInIn) {
    super(id, context, "BsdExceptionFind");
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
        mapArray[i] = BsdExceptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdException", noOpIn);
      }
      addInput("BsdException", mapList);
    }
  }
/**
 *
 * Sets the  BsdException
 * @param noOpInIn BsdExceptionObjectDataList to set
 *
 */
  public void setBsdException(BsdExceptionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdException passed into the constructor
 * @return Simulated response
 *
 */
  public BsdExceptionObjectDataList getBsdException() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdExceptionObjectHelper.fromMapList(inputMap, "BsdExceptionList");
  }
}
