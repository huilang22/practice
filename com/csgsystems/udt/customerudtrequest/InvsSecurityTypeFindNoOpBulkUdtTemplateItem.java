/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSecurityTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSecurityTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSecurityTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSecurityTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSecurityTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectDataList noOpInIn) {
    super(id, context, "InvsSecurityTypeFind");
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
        mapArray[i] = InvsSecurityTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSecurityType", noOpIn);
      }
      addInput("InvsSecurityType", mapList);
    }
  }
/**
 *
 * Sets the  InvsSecurityType
 * @param noOpInIn InvsSecurityTypeObjectDataList to set
 *
 */
  public void setInvsSecurityType(InvsSecurityTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSecurityType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSecurityTypeObjectDataList getInvsSecurityType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSecurityTypeObjectHelper.fromMapList(inputMap, "InvsSecurityTypeList");
  }
}
