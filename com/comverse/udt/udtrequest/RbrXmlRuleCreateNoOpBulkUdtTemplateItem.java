/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrXmlRuleCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrXmlRuleCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrXmlRuleObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrXmlRuleCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrXmlRuleCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectData noOpInIn) {
    super(id, context, "RbrXmlRuleCreate");
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
