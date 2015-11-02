/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimCardConfigRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimCardConfigRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimCardConfigRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimCardConfigRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimCardConfigRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectDataList noOpInIn) {
    super(id, context, "InvsSimCardConfigRefFind");
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
        mapArray[i] = InvsSimCardConfigRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimCardConfigRef", noOpIn);
      }
      addInput("InvsSimCardConfigRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimCardConfigRef
 * @param noOpInIn InvsSimCardConfigRefObjectDataList to set
 *
 */
  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimCardConfigRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigRefObjectDataList getInvsSimCardConfigRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimCardConfigRefObjectHelper.fromMapList(inputMap, "InvsSimCardConfigRefList");
  }
}
