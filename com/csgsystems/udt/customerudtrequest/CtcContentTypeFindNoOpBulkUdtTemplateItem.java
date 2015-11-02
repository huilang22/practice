/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcContentTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcContentTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcContentTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcContentTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcContentTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectDataList noOpInIn) {
    super(id, context, "CtcContentTypeFind");
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
        mapArray[i] = CtcContentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcContentType", noOpIn);
      }
      addInput("CtcContentType", mapList);
    }
  }
/**
 *
 * Sets the  CtcContentType
 * @param noOpInIn CtcContentTypeObjectDataList to set
 *
 */
  public void setCtcContentType(CtcContentTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcContentType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcContentTypeObjectDataList getCtcContentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcContentTypeObjectHelper.fromMapList(inputMap, "CtcContentTypeList");
  }
}
