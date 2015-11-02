/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsProfileFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsProfileFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsProfileObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsProfileFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsProfileFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectDataList noOpInIn) {
    super(id, context, "InvsProfileFind");
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
        mapArray[i] = InvsProfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsProfile", noOpIn);
      }
      addInput("InvsProfile", mapList);
    }
  }
/**
 *
 * Sets the  InvsProfile
 * @param noOpInIn InvsProfileObjectDataList to set
 *
 */
  public void setInvsProfile(InvsProfileObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsProfile passed into the constructor
 * @return Simulated response
 *
 */
  public InvsProfileObjectDataList getInvsProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsProfileObjectHelper.fromMapList(inputMap, "InvsProfileList");
  }
}
