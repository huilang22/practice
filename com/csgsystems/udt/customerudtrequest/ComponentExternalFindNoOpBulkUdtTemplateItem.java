/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentExternalFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ComponentExternalFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentExternalFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ComponentExternalFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentExternalFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectDataList noOpInIn) {
    super(id, context, "ComponentExternalFind");
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
        mapArray[i] = ComponentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Component", noOpIn);
      }
      addInput("Component", mapList);
    }
  }
/**
 *
 * Sets the  Component
 * @param noOpInIn ComponentObjectDataList to set
 *
 */
  public void setComponent(ComponentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Component passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentObjectDataList getComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentObjectHelper.fromMapList(inputMap, "ComponentList");
  }
}
