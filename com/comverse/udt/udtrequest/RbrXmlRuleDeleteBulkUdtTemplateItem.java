/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrXmlRuleDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrXmlRuleDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrXmlRuleObjectKeyData RbrXmlRuleDeleteIn;
/**
 *
 * Constructor to create a  RbrXmlRuleDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrXmlRuleDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectKeyData RbrXmlRuleDeleteInIn) {
    super(id, context, "RbrXmlRuleDelete");
    RbrXmlRuleDeleteIn = RbrXmlRuleDeleteInIn;
  }

  public void translateToMap() {
    if (RbrXmlRuleDeleteIn != null) {
      RbrXmlRuleDeleteIn.resetFlags(true, true);
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(RbrXmlRuleDeleteIn, new HashMap(), "RbrXmlRuleObjectKeyData").get("RbrXmlRuleObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrXmlRule
 * @param RbrXmlRuleDeleteInIn Value of the RbrXmlRuleDeleteIn
 *
 */

  public void setRbrXmlRule(RbrXmlRuleObjectKeyData RbrXmlRuleDeleteInIn) {
    RbrXmlRuleDeleteIn = RbrXmlRuleDeleteInIn;
  }

  public void translateFromMap() {
    RbrXmlRuleDeleteIn = RbrXmlRuleObjectKeyHelper.fromMap(inputMap, "RbrXmlRule");
  }

/**
 *
 * Gets the RbrXmlRule
 * @return Value of the RbrXmlRule
 *
 */

  public RbrXmlRuleObjectKeyData getRbrXmlRule( ) {
    return RbrXmlRuleDeleteIn;
  }

}
