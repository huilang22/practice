/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcAttributesDefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcAttributesDefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcAttributesDefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CcAttributesDefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcAttributesDefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectDataList noOpInIn) {
    super(id, context, "CcAttributesDefFind");
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
        mapArray[i] = CcAttributesDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcAttributesDef", noOpIn);
      }
      addInput("CcAttributesDef", mapList);
    }
  }
/**
 *
 * Sets the  CcAttributesDef
 * @param noOpInIn CcAttributesDefObjectDataList to set
 *
 */
  public void setCcAttributesDef(CcAttributesDefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcAttributesDef passed into the constructor
 * @return Simulated response
 *
 */
  public CcAttributesDefObjectDataList getCcAttributesDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcAttributesDefObjectHelper.fromMapList(inputMap, "CcAttributesDefList");
  }
}
