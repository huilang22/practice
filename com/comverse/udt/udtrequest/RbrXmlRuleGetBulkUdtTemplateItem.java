/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrXmlRuleGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrXmlRuleGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrXmlRuleObjectKeyData RbrXmlRuleGetIn;
/**
 *
 * Constructor to create a  RbrXmlRuleGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrXmlRuleGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectKeyData RbrXmlRuleGetInIn) {
    super(id, context, "RbrXmlRuleGet");
    RbrXmlRuleGetIn = RbrXmlRuleGetInIn;
  }

  public void translateToMap() {
    if (RbrXmlRuleGetIn != null) {
      RbrXmlRuleGetIn.resetFlags(true, true);
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(RbrXmlRuleGetIn, new HashMap(), "RbrXmlRuleObjectKeyData").get("RbrXmlRuleObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrXmlRule
 * @param RbrXmlRuleGetInIn Value of the RbrXmlRuleGetIn
 *
 */

  public void setRbrXmlRule(RbrXmlRuleObjectKeyData RbrXmlRuleGetInIn) {
    RbrXmlRuleGetIn = RbrXmlRuleGetInIn;
  }

  public void translateFromMap() {
    RbrXmlRuleGetIn = RbrXmlRuleObjectKeyHelper.fromMap(inputMap, "RbrXmlRule");
  }

/**
 *
 * Gets the RbrXmlRule
 * @return Value of the RbrXmlRule
 *
 */

  public RbrXmlRuleObjectKeyData getRbrXmlRule( ) {
    return RbrXmlRuleGetIn;
  }

}
