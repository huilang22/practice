/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalDefaultActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationRelationalDefaultActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationRelationalDefaultActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationRelationalDefaultObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationRelationalDefaultActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationRelationalDefaultActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalDefaultObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationRelationalDefaultActionFind");
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
        mapArray[i] = BsdApplicationRelationalDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationRelationalDefault", noOpIn);
      }
      addInput("BsdApplicationRelationalDefault", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationRelationalDefault
 * @param noOpInIn BsdApplicationRelationalDefaultObjectDataList to set
 *
 */
  public void setBsdApplicationRelationalDefault(BsdApplicationRelationalDefaultObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationRelationalDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalDefaultObjectDataList getBsdApplicationRelationalDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationRelationalDefaultObjectHelper.fromMapList(inputMap, "BsdApplicationRelationalDefaultList");
  }
}
