/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimResellerRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimResellerRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimResellerRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsSimResellerRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimResellerRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectDataList noOpInIn) {
    super(id, context, "InvsSimResellerRefFind");
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
        mapArray[i] = InvsSimResellerRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsSimResellerRef", noOpIn);
      }
      addInput("InvsSimResellerRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsSimResellerRef
 * @param noOpInIn InvsSimResellerRefObjectDataList to set
 *
 */
  public void setInvsSimResellerRef(InvsSimResellerRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimResellerRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimResellerRefObjectDataList getInvsSimResellerRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimResellerRefObjectHelper.fromMapList(inputMap, "InvsSimResellerRefList");
  }
}
