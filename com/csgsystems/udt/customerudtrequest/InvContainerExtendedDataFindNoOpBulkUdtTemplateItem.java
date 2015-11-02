/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvContainerExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvContainerExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerEDObjectDataList noOpInIn) {
    super(id, context, "InvContainerExtendedDataFind");
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
        mapArray[i] = InvContainerEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerExtendedData", noOpIn);
      }
      addInput("InvContainerExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  InvContainerExtendedData
 * @param noOpInIn InvContainerEDObjectDataList to set
 *
 */
  public void setInvContainerExtendedData(InvContainerEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainerExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerEDObjectDataList getInvContainerExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerEDObjectHelper.fromMapList(inputMap, "InvContainerExtendedDataList");
  }
}
