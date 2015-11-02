/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PolicyTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentPolicyMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PolicyTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectDataList noOpInIn) {
    super(id, context, "PolicyTypeFind");
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
        mapArray[i] = ComponentPolicyMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentPolicyMap", noOpIn);
      }
      addInput("ComponentPolicyMap", mapList);
    }
  }
/**
 *
 * Sets the  ComponentPolicyMap
 * @param noOpInIn ComponentPolicyMapObjectDataList to set
 *
 */
  public void setComponentPolicyMap(ComponentPolicyMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentPolicyMap passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentPolicyMapObjectDataList getComponentPolicyMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentPolicyMapObjectHelper.fromMapList(inputMap, "ComponentPolicyMapList");
  }
}
