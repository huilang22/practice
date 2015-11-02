/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewAttributesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewAttributesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewAttributesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewAttributesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CcViewAttributesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewAttributesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectDataList noOpInIn) {
    super(id, context, "CcViewAttributesFind");
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
        mapArray[i] = CcViewAttributesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcViewAttributes", noOpIn);
      }
      addInput("CcViewAttributes", mapList);
    }
  }
/**
 *
 * Sets the  CcViewAttributes
 * @param noOpInIn CcViewAttributesObjectDataList to set
 *
 */
  public void setCcViewAttributes(CcViewAttributesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewAttributes passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewAttributesObjectDataList getCcViewAttributes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewAttributesObjectHelper.fromMapList(inputMap, "CcViewAttributesList");
  }
}
