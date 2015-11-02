/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateExpiryDateBulkUdtTemplateItem.java
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
 * Class used to create a PolicyInstanceUpdateExpiryDateBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyInstanceUpdateExpiryDateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UpdateSubscriberObjectData UpdateExpDtIn;
/**
 *
 * Constructor to create a  PolicyInstanceUpdateExpiryDateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyInstanceUpdateExpiryDateBulkUdtTemplateItem(String id, BSDMSessionContext context, UpdateSubscriberObjectData UpdateExpDtInIn) {
    super(id, context, "PolicyInstanceUpdateExpiryDate");
    UpdateExpDtIn = UpdateExpDtInIn;
  }

  public void translateToMap() {
    if (UpdateExpDtIn != null) {
      UpdateExpDtIn.resetFlags(true, true);
      addInput("PolicyInstance", UpdateSubscriberObjectHelper.toMap(UpdateExpDtIn, new HashMap(), "Result").get("Result"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param UpdateExpDtInIn Value of the UpdateExpDtIn
 *
 */

  public void setPolicyInstance(UpdateSubscriberObjectData UpdateExpDtInIn) {
    UpdateExpDtIn = UpdateExpDtInIn;
  }

  public void translateFromMap() {
    UpdateExpDtIn = UpdateSubscriberObjectHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public UpdateSubscriberObjectData getPolicyInstance( ) {
    return UpdateExpDtIn;
  }

}
