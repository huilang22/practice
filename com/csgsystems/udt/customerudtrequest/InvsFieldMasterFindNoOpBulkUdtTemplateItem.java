/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsFieldMasterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsFieldMasterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsFieldMasterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsFieldMasterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsFieldMasterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsFieldMasterObjectDataList noOpInIn) {
    super(id, context, "InvsFieldMasterFind");
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
        mapArray[i] = InvsFieldMasterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsFieldMaster", noOpIn);
      }
      addInput("InvsFieldMaster", mapList);
    }
  }
/**
 *
 * Sets the  InvsFieldMaster
 * @param noOpInIn InvsFieldMasterObjectDataList to set
 *
 */
  public void setInvsFieldMaster(InvsFieldMasterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsFieldMaster passed into the constructor
 * @return Simulated response
 *
 */
  public InvsFieldMasterObjectDataList getInvsFieldMaster() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsFieldMasterObjectHelper.fromMapList(inputMap, "InvsFieldMasterList");
  }
}
