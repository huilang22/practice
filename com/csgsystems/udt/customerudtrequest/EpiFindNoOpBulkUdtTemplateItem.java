/*
 * Generated code DO NOT EDIT
 * Generated file: EpiFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EpiFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EpiFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EpiObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EpiFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EpiFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectDataList noOpInIn) {
    super(id, context, "EpiFind");
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
        mapArray[i] = EpiObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Epi", noOpIn);
      }
      addInput("Epi", mapList);
    }
  }
/**
 *
 * Sets the  Epi
 * @param noOpInIn EpiObjectDataList to set
 *
 */
  public void setEpi(EpiObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Epi passed into the constructor
 * @return Simulated response
 *
 */
  public EpiObjectDataList getEpi() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EpiObjectHelper.fromMapList(inputMap, "EpiList");
  }
}
