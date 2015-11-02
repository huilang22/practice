/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrXmlRuleCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrXmlRuleCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrXmlRuleObjectData RbrXmlRuleCreateIn;
/**
 *
 * Constructor to create a  RbrXmlRuleCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrXmlRuleCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrXmlRuleObjectData RbrXmlRuleCreateInIn) {
    super(id, context, "RbrXmlRuleCreate");
    RbrXmlRuleCreateIn = RbrXmlRuleCreateInIn;
  }

  public void translateToMap() {
    if (RbrXmlRuleCreateIn != null) {
      RbrXmlRuleCreateIn.resetFlags(true, true);
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleCreateIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }


/**
 *
 * Sets the RbrXmlRule
 * @param RbrXmlRuleCreateInIn Value of the RbrXmlRuleCreateIn
 *
 */

  public void setRbrXmlRule(RbrXmlRuleObjectData RbrXmlRuleCreateInIn) {
    RbrXmlRuleCreateIn = RbrXmlRuleCreateInIn;
  }

  public void translateFromMap() {
    RbrXmlRuleCreateIn = RbrXmlRuleObjectHelper.fromMap(inputMap, "RbrXmlRule");
  }

/**
 *
 * Gets the RbrXmlRule
 * @return Value of the RbrXmlRule
 *
 */

  public RbrXmlRuleObjectData getRbrXmlRule( ) {
    return RbrXmlRuleCreateIn;
  }

}
