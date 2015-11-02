/*
 * Generated code DO NOT EDIT
 * Generated file: SvcEmfConfigFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcEmfConfigFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SvcEmfConfigFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcEmfConfigObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SvcEmfConfigFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SvcEmfConfigFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcEmfConfigObjectDataList noOpInIn) {
    super(id, context, "SvcEmfConfigFind");
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
        mapArray[i] = SvcEmfConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcEmfConfig", noOpIn);
      }
      addInput("SvcEmfConfig", mapList);
    }
  }
/**
 *
 * Sets the  SvcEmfConfig
 * @param noOpInIn SvcEmfConfigObjectDataList to set
 *
 */
  public void setSvcEmfConfig(SvcEmfConfigObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcEmfConfig passed into the constructor
 * @return Simulated response
 *
 */
  public SvcEmfConfigObjectDataList getSvcEmfConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcEmfConfigObjectHelper.fromMapList(inputMap, "SvcEmfConfigList");
  }
}
