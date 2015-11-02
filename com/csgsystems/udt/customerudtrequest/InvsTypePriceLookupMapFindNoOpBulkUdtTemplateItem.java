/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsTypePriceLookupMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypePriceLookupMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypePriceLookupMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsTypePriceLookupMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypePriceLookupMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectDataList noOpInIn) {
    super(id, context, "InvsTypePriceLookupMapFind");
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
        mapArray[i] = InvsTypePriceLookupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypePriceLookupMap", noOpIn);
      }
      addInput("InvsTypePriceLookupMap", mapList);
    }
  }
/**
 *
 * Sets the  InvsTypePriceLookupMap
 * @param noOpInIn InvsTypePriceLookupMapObjectDataList to set
 *
 */
  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypePriceLookupMap passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypePriceLookupMapObjectDataList getInvsTypePriceLookupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypePriceLookupMapObjectHelper.fromMapList(inputMap, "InvsTypePriceLookupMapList");
  }
}
