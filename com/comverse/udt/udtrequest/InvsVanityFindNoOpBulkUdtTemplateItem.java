/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVanityFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVanityFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVanityObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsVanityFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVanityFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectDataList noOpInIn) {
    super(id, context, "InvsVanityFind");
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
        mapArray[i] = InvsVanityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVanity", noOpIn);
      }
      addInput("InvsVanity", mapList);
    }
  }
/**
 *
 * Sets the  InvsVanity
 * @param noOpInIn InvsVanityObjectDataList to set
 *
 */
  public void setInvsVanity(InvsVanityObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVanity passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVanityObjectDataList getInvsVanity() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVanityObjectHelper.fromMapList(inputMap, "InvsVanityList");
  }
}
