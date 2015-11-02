/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdAttributeDefaultFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeDefaultFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeDefaultObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeDefaultFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeDefaultFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeDefaultFind");
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
        mapArray[i] = BsdAttributeDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeDefault", noOpIn);
      }
      addInput("BsdAttributeDefault", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttributeDefault
 * @param noOpInIn BsdAttributeDefaultObjectDataList to set
 *
 */
  public void setBsdAttributeDefault(BsdAttributeDefaultObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectDataList getBsdAttributeDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeDefaultObjectHelper.fromMapList(inputMap, "BsdAttributeDefaultList");
  }
}
