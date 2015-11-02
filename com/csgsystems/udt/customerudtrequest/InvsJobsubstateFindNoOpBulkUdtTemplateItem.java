/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobsubstateFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsJobsubstateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobsubstateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobsubstateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsJobsubstateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobsubstateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobsubstateObjectDataList noOpInIn) {
    super(id, context, "InvsJobsubstateFind");
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
        mapArray[i] = InvsJobsubstateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobsubstate", noOpIn);
      }
      addInput("InvsJobsubstate", mapList);
    }
  }
/**
 *
 * Sets the  InvsJobsubstate
 * @param noOpInIn InvsJobsubstateObjectDataList to set
 *
 */
  public void setInvsJobsubstate(InvsJobsubstateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobsubstate passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobsubstateObjectDataList getInvsJobsubstate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobsubstateObjectHelper.fromMapList(inputMap, "InvsJobsubstateList");
  }
}
