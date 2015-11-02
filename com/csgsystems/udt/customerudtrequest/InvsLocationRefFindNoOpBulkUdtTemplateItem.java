/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectDataList noOpInIn) {
    super(id, context, "InvsLocationRefFind");
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
        mapArray[i] = InvsLocationRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationRef", noOpIn);
      }
      addInput("InvsLocationRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocationRef
 * @param noOpInIn InvsLocationRefObjectDataList to set
 *
 */
  public void setInvsLocationRef(InvsLocationRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationRefObjectDataList getInvsLocationRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationRefObjectHelper.fromMapList(inputMap, "InvsLocationRefList");
  }
}
