/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableComponentTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceableComponentTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceableComponentTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceableComponentTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceableComponentTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectDataList noOpInIn) {
    super(id, context, "ServiceableComponentTypeFind");
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
        mapArray[i] = CDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ComponentDefinition", noOpIn);
      }
      addInput("ComponentDefinition", mapList);
    }
  }
/**
 *
 * Sets the  ComponentDefinition
 * @param noOpInIn CDObjectDataList to set
 *
 */
  public void setComponentDefinition(CDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public CDObjectDataList getComponentDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CDObjectHelper.fromMapList(inputMap, "ComponentDefinitionList");
  }
}
