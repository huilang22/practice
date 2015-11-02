/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PolicyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PolicyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectDataList noOpInIn) {
    super(id, context, "PolicyFind");
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
        mapArray[i] = PolicyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Policy", noOpIn);
      }
      addInput("Policy", mapList);
    }
  }
/**
 *
 * Sets the  Policy
 * @param noOpInIn PolicyObjectDataList to set
 *
 */
  public void setPolicy(PolicyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Policy passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyObjectDataList getPolicy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyObjectHelper.fromMapList(inputMap, "PolicyList");
  }
}
