/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ComponentPolicyMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentPolicyMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentPolicyMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ComponentPolicyMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentPolicyMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectDataList noOpInIn) {
    super(id, context, "ComponentPolicyMapFind");
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
