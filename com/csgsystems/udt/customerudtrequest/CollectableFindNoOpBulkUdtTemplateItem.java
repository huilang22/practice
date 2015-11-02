/*
 * Generated code DO NOT EDIT
 * Generated file: CollectableFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a CollectableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CollectableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CollectableObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CollectableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CollectableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectableObjectDataList noOpInIn) {
    super(id, context, "CollectableFind");
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
        mapArray[i] = CollectableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Collectable", noOpIn);
      }
      addInput("Collectable", mapList);
    }
  }
/**
 *
 * Sets the  Collectable
 * @param noOpInIn CollectableObjectDataList to set
 *
 */
  public void setCollectable(CollectableObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Collectable passed into the constructor
 * @return Simulated response
 *
 */
  public CollectableObjectDataList getCollectable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CollectableObjectHelper.fromMapList(inputMap, "CollectableList");
  }
}
