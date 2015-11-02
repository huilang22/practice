/*
 * Generated code DO NOT EDIT
 * Generated file: PpvOutletFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ppv.data.*;

/**
 *
 * NoOp class used to simulate a PpvOutletFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PpvOutletFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PpvOutletObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PpvOutletFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PpvOutletFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvOutletObjectDataList noOpInIn) {
    super(id, context, "PpvOutletFind");
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
        mapArray[i] = PpvOutletObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PpvOutlet", noOpIn);
      }
      addInput("PpvOutlet", mapList);
    }
  }
/**
 *
 * Sets the  PpvOutlet
 * @param noOpInIn PpvOutletObjectDataList to set
 *
 */
  public void setPpvOutlet(PpvOutletObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PpvOutlet passed into the constructor
 * @return Simulated response
 *
 */
  public PpvOutletObjectDataList getPpvOutlet() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PpvOutletObjectHelper.fromMapList(inputMap, "PpvOutletList");
  }
}
