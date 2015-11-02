/*
 * Generated code DO NOT EDIT
 * Generated file: PpvServiceFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvServiceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PpvServiceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PpvServiceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PpvServiceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PpvServiceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvServiceObjectDataList noOpInIn) {
    super(id, context, "PpvServiceFind");
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
        mapArray[i] = PpvServiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PpvService", noOpIn);
      }
      addInput("PpvService", mapList);
    }
  }
/**
 *
 * Sets the  PpvService
 * @param noOpInIn PpvServiceObjectDataList to set
 *
 */
  public void setPpvService(PpvServiceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PpvService passed into the constructor
 * @return Simulated response
 *
 */
  public PpvServiceObjectDataList getPpvService() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PpvServiceObjectHelper.fromMapList(inputMap, "PpvServiceList");
  }
}
