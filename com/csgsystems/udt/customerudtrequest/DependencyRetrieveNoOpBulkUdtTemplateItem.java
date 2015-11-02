/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyRetrieveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DependencyRetrieveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyRetrieveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DependencyRetrieveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyRetrieveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyObjectDataList noOpInIn) {
    super(id, context, "DependencyRetrieve");
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
        mapArray[i] = DependencyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Dependency", noOpIn);
      }
      addInput("Dependency", mapList);
    }
  }
/**
 *
 * Sets the  Dependency
 * @param noOpInIn DependencyObjectDataList to set
 *
 */
  public void setDependency(DependencyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Dependency passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyObjectDataList getDependency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyObjectHelper.fromMapList(inputMap, "DependencyList");
  }
}
