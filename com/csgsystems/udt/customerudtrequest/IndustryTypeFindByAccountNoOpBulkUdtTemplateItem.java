/*
 * Generated code DO NOT EDIT
 * Generated file: IndustryTypeFindByAccountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a IndustryTypeFindByAccountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class IndustryTypeFindByAccountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected IndustryTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   IndustryTypeFindByAccountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public IndustryTypeFindByAccountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, IndustryTypeObjectDataList noOpInIn) {
    super(id, context, "IndustryTypeFindByAccount");
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
        mapArray[i] = IndustryTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("IndustryType", noOpIn);
      }
      addInput("IndustryType", mapList);
    }
  }
/**
 *
 * Sets the  IndustryType
 * @param noOpInIn IndustryTypeObjectDataList to set
 *
 */
  public void setIndustryType(IndustryTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the IndustryType passed into the constructor
 * @return Simulated response
 *
 */
  public IndustryTypeObjectDataList getIndustryType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = IndustryTypeObjectHelper.fromMapList(inputMap, "IndustryTypeList");
  }
}
