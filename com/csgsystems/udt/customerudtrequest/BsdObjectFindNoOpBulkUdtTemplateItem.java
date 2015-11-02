/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdObjectFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdObjectFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectDataList noOpInIn) {
    super(id, context, "BsdObjectFind");
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
        mapArray[i] = BsdObjectObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdObject", noOpIn);
      }
      addInput("BsdObject", mapList);
    }
  }
/**
 *
 * Sets the  BsdObject
 * @param noOpInIn BsdObjectObjectDataList to set
 *
 */
  public void setBsdObject(BsdObjectObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObject passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectDataList getBsdObject() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectObjectHelper.fromMapList(inputMap, "BsdObjectList");
  }
}
