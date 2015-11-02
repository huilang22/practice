/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a InvsSimResellerFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimResellerFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimResellerObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimResellerFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimResellerFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectDataList noOpInIn) {
    super(id, context, "InvsSimResellerFind");
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
        mapArray[i] = InvsSimResellerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimReseller", noOpIn);
      }
      addInput("InvsSimReseller", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimReseller
 * @param noOpInIn InvsSimResellerObjectDataList to set
 *
 */
  public void setInvsSimReseller(InvsSimResellerObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimReseller passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerObjectDataList getInvsSimReseller() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimResellerObjectHelper.fromMapList(inputMap, "InvsSimResellerList");
  }
}
