/*
 * Generated code DO NOT EDIT
 * Generated file: BoundaryListActiveNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a BoundaryListActiveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BoundaryListActiveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BoundaryObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BoundaryListActiveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BoundaryListActiveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BoundaryObjectDataList noOpInIn) {
    super(id, context, "BoundaryListActive");
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
        mapArray[i] = BoundaryObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Boundary", noOpIn);
      }
      addInput("Boundary", mapList);
    }
  }
/**
 *
 * Sets the  Boundary
 * @param noOpInIn BoundaryObjectDataList to set
 *
 */
  public void setBoundary(BoundaryObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Boundary passed into the constructor
 * @return Simulated response
 *
 */
  public BoundaryObjectDataList getBoundary() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BoundaryObjectHelper.fromMapList(inputMap, "BoundaryList");
  }
}
