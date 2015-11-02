/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerRelationsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvContainerRelationsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvContainerRelationsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvContainerRelationsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvContainerRelationsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectDataList noOpInIn) {
    super(id, context, "InvContainerRelationsFind");
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
        mapArray[i] = InvContainerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainer", noOpIn);
      }
      addInput("InvContainer", mapList);
    }
  }
/**
 *
 * Sets the  InvContainer
 * @param noOpInIn InvContainerObjectDataList to set
 *
 */
  public void setInvContainer(InvContainerObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainer passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerObjectDataList getInvContainer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerObjectHelper.fromMapList(inputMap, "InvContainerList");
  }
}
