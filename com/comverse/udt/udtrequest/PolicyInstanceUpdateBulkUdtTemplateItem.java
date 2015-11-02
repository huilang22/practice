/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PolicyInstanceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyInstanceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyInstanceObjectData piUpdateIn;
/**
 *
 * Constructor to create a  PolicyInstanceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyInstanceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectData piUpdateInIn) {
    super(id, context, "PolicyInstanceUpdate");
    piUpdateIn = piUpdateInIn;
  }

  public void translateToMap() {
    if (piUpdateIn != null) {
      piUpdateIn.resetFlags(true, true);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piUpdateIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param piUpdateInIn Value of the piUpdateIn
 *
 */

  public void setPolicyInstance(PolicyInstanceObjectData piUpdateInIn) {
    piUpdateIn = piUpdateInIn;
  }

  public void translateFromMap() {
    piUpdateIn = PolicyInstanceObjectHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public PolicyInstanceObjectData getPolicyInstance( ) {
    return piUpdateIn;
  }

}
