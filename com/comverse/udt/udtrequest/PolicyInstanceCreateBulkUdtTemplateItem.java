/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceCreateBulkUdtTemplateItem.java
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
 * Class used to create a PolicyInstanceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyInstanceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyInstanceObjectData piCreateIn;
/**
 *
 * Constructor to create a  PolicyInstanceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyInstanceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectData piCreateInIn) {
    super(id, context, "PolicyInstanceCreate");
    piCreateIn = piCreateInIn;
  }

  public void translateToMap() {
    if (piCreateIn != null) {
      piCreateIn.resetFlags(true, true);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piCreateIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param piCreateInIn Value of the piCreateIn
 *
 */

  public void setPolicyInstance(PolicyInstanceObjectData piCreateInIn) {
    piCreateIn = piCreateInIn;
  }

  public void translateFromMap() {
    piCreateIn = PolicyInstanceObjectHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public PolicyInstanceObjectData getPolicyInstance( ) {
    return piCreateIn;
  }

}
