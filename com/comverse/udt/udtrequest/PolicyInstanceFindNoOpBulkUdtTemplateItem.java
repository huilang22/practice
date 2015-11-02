/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a PolicyInstanceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyInstanceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyInstanceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PolicyInstanceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyInstanceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectDataList noOpInIn) {
    super(id, context, "PolicyInstanceFind");
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
        mapArray[i] = PolicyInstanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PolicyInstance", noOpIn);
      }
      addInput("PolicyInstance", mapList);
    }
  }
/**
 *
 * Sets the  PolicyInstance
 * @param noOpInIn PolicyInstanceObjectDataList to set
 *
 */
  public void setPolicyInstance(PolicyInstanceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PolicyInstance passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyInstanceObjectDataList getPolicyInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyInstanceObjectHelper.fromMapList(inputMap, "PolicyInstanceList");
  }
}
