/*
 * Generated code DO NOT EDIT
 * Generated file: RbrXmlRuleFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrXmlRuleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrXmlRuleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrXmlRuleObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrXmlRuleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrXmlRuleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectDataList noOpInIn) {
    super(id, context, "RbrXmlRuleFind");
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
        mapArray[i] = RbrXmlRuleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrXmlRule", noOpIn);
      }
      addInput("RbrXmlRule", mapList);
    }
  }
/**
 *
 * Sets the  RbrXmlRule
 * @param noOpInIn RbrXmlRuleObjectDataList to set
 *
 */
  public void setRbrXmlRule(RbrXmlRuleObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrXmlRule passed into the constructor
 * @return Simulated response
 *
 */
  public RbrXmlRuleObjectDataList getRbrXmlRule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrXmlRuleObjectHelper.fromMapList(inputMap, "RbrXmlRuleList");
  }
}
