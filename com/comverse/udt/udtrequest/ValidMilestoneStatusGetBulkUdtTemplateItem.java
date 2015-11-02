/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusGetBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a ValidMilestoneStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ValidMilestoneStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ValidMilestoneStatusObjectKeyData ValidMilestoneStatusGetIn;
/**
 *
 * Constructor to create a  ValidMilestoneStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ValidMilestoneStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectKeyData ValidMilestoneStatusGetInIn) {
    super(id, context, "ValidMilestoneStatusGet");
    ValidMilestoneStatusGetIn = ValidMilestoneStatusGetInIn;
  }

  public void translateToMap() {
    if (ValidMilestoneStatusGetIn != null) {
      ValidMilestoneStatusGetIn.resetFlags(true, true);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectKeyHelper.toMap(ValidMilestoneStatusGetIn, new HashMap(), "ValidMilestoneStatusObjectKeyData").get("ValidMilestoneStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the ValidMilestoneStatus
 * @param ValidMilestoneStatusGetInIn Value of the ValidMilestoneStatusGetIn
 *
 */

  public void setValidMilestoneStatus(ValidMilestoneStatusObjectKeyData ValidMilestoneStatusGetInIn) {
    ValidMilestoneStatusGetIn = ValidMilestoneStatusGetInIn;
  }

  public void translateFromMap() {
    ValidMilestoneStatusGetIn = ValidMilestoneStatusObjectKeyHelper.fromMap(inputMap, "ValidMilestoneStatus");
  }

/**
 *
 * Gets the ValidMilestoneStatus
 * @return Value of the ValidMilestoneStatus
 *
 */

  public ValidMilestoneStatusObjectKeyData getValidMilestoneStatus( ) {
    return ValidMilestoneStatusGetIn;
  }

}
