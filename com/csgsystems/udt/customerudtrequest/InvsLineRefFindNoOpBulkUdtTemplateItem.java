/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLineRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLineRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLineRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLineRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLineRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectDataList noOpInIn) {
    super(id, context, "InvsLineRefFind");
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
        mapArray[i] = InvsLineRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLineRef", noOpIn);
      }
      addInput("InvsLineRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsLineRef
 * @param noOpInIn InvsLineRefObjectDataList to set
 *
 */
  public void setInvsLineRef(InvsLineRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLineRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineRefObjectDataList getInvsLineRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLineRefObjectHelper.fromMapList(inputMap, "InvsLineRefList");
  }
}
