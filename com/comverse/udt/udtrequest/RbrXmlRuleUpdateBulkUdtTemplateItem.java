/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrXmlRuleUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrXmlRuleUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrXmlRuleObjectData RbrXmlRuleUpdateIn;
/**
 *
 * Constructor to create a  RbrXmlRuleUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrXmlRuleUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectData RbrXmlRuleUpdateInIn) {
    super(id, context, "RbrXmlRuleUpdate");
    RbrXmlRuleUpdateIn = RbrXmlRuleUpdateInIn;
  }

  public void translateToMap() {
    if (RbrXmlRuleUpdateIn != null) {
      RbrXmlRuleUpdateIn.resetFlags(true, true);
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleUpdateIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }


/**
 *
 * Sets the RbrXmlRule
 * @param RbrXmlRuleUpdateInIn Value of the RbrXmlRuleUpdateIn
 *
 */

  public void setRbrXmlRule(RbrXmlRuleObjectData RbrXmlRuleUpdateInIn) {
    RbrXmlRuleUpdateIn = RbrXmlRuleUpdateInIn;
  }

  public void translateFromMap() {
    RbrXmlRuleUpdateIn = RbrXmlRuleObjectHelper.fromMap(inputMap, "RbrXmlRule");
  }

/**
 *
 * Gets the RbrXmlRule
 * @return Value of the RbrXmlRule
 *
 */

  public RbrXmlRuleObjectData getRbrXmlRule( ) {
    return RbrXmlRuleUpdateIn;
  }

}
