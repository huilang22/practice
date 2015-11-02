/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusFindBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a ValidMilestoneStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ValidMilestoneStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ValidMilestoneStatusObjectFilter ValidMilestoneStatusFindIn;
/**
 *
 * Constructor to create a  ValidMilestoneStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ValidMilestoneStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ValidMilestoneStatusObjectFilter ValidMilestoneStatusFindInIn) {
    super(id, context, "ValidMilestoneStatusFind");
    ValidMilestoneStatusFindIn = ValidMilestoneStatusFindInIn;
  }

  public void translateToMap() {
    if (ValidMilestoneStatusFindIn != null) {
      Integer index =  ValidMilestoneStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusFindIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }


/**
 *
 * Sets the ValidMilestoneStatus
 * @param ValidMilestoneStatusFindInIn Value of the ValidMilestoneStatusFindIn
 *
 */

  public void setValidMilestoneStatus(ValidMilestoneStatusObjectFilter ValidMilestoneStatusFindInIn) {
    ValidMilestoneStatusFindIn = ValidMilestoneStatusFindInIn;
  }

  public void translateFromMap() {
    ValidMilestoneStatusFindIn = ValidMilestoneStatusObjectHelper.fromMapFilter(inputMap, "ValidMilestoneStatus");
  }

/**
 *
 * Gets the ValidMilestoneStatus
 * @return Value of the ValidMilestoneStatus
 *
 */

  public ValidMilestoneStatusObjectFilter getValidMilestoneStatus( ) {
    return ValidMilestoneStatusFindIn;
  }

}
