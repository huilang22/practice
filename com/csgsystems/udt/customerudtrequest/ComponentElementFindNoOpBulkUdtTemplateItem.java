/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentElementFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentElementFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentElementObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ComponentElementFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentElementFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectDataList noOpInIn) {
    super(id, context, "ComponentElementFind");
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
        mapArray[i] = ComponentElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentElement", noOpIn);
      }
      addInput("ComponentElement", mapList);
    }
  }
/**
 *
 * Sets the  ComponentElement
 * @param noOpInIn ComponentElementObjectDataList to set
 *
 */
  public void setComponentElement(ComponentElementObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentElement passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentElementObjectDataList getComponentElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentElementObjectHelper.fromMapList(inputMap, "ComponentElementList");
  }
}
