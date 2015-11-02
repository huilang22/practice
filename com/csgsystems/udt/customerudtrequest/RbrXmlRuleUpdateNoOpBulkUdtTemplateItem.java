/*
 * Generated code DO NOT EDIT
 * Generated file: RbrXmlRuleUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrXmlRuleUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrXmlRuleUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrXmlRuleObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrXmlRuleUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrXmlRuleUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectData noOpInIn) {
    super(id, context, "RbrXmlRuleUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(noOpIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
/**
 *
 * Sets the  RbrXmlRule
 * @param noOpInIn RbrXmlRuleObjectData to set
 *
 */
  public void setRbrXmlRule(RbrXmlRuleObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrXmlRule passed into the constructor
 * @return Simulated response
 *
 */
  public RbrXmlRuleObjectData getRbrXmlRule() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrXmlRuleObjectHelper.fromMap(inputMap, "RbrXmlRule");
  }
}
