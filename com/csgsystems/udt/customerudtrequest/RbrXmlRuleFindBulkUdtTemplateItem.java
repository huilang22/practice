/*
 * Generated code DO NOT EDIT
 * Generated file: RbrXmlRuleFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrXmlRuleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrXmlRuleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrXmlRuleObjectFilter RbrXmlRuleFindIn;
/**
 *
 * Constructor to create a  RbrXmlRuleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrXmlRuleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectFilter RbrXmlRuleFindInIn) {
    super(id, context, "RbrXmlRuleFind");
    RbrXmlRuleFindIn = RbrXmlRuleFindInIn;
  }

  public void translateToMap() {
    if (RbrXmlRuleFindIn != null) {
      Integer index =  RbrXmlRuleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleFindIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }


/**
 *
 * Sets the RbrXmlRule
 * @param RbrXmlRuleFindInIn Value of the RbrXmlRuleFindIn
 *
 */

  public void setRbrXmlRule(RbrXmlRuleObjectFilter RbrXmlRuleFindInIn) {
    RbrXmlRuleFindIn = RbrXmlRuleFindInIn;
  }

  public void translateFromMap() {
    RbrXmlRuleFindIn = RbrXmlRuleObjectHelper.fromMapFilter(inputMap, "RbrXmlRule");
  }

/**
 *
 * Gets the RbrXmlRule
 * @return Value of the RbrXmlRule
 *
 */

  public RbrXmlRuleObjectFilter getRbrXmlRule( ) {
    return RbrXmlRuleFindIn;
  }

}
