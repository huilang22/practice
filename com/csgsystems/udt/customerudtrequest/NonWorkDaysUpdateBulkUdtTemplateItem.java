/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NonWorkDaysUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NonWorkDaysUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NonWorkDaysObjectData NonWorkDaysUpdateIn;
/**
 *
 * Constructor to create a  NonWorkDaysUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NonWorkDaysUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectData NonWorkDaysUpdateInIn) {
    super(id, context, "NonWorkDaysUpdate");
    NonWorkDaysUpdateIn = NonWorkDaysUpdateInIn;
  }

  public void translateToMap() {
    if (NonWorkDaysUpdateIn != null) {
      NonWorkDaysUpdateIn.resetFlags(true, true);
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysUpdateIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }


/**
 *
 * Sets the NonWorkDays
 * @param NonWorkDaysUpdateInIn Value of the NonWorkDaysUpdateIn
 *
 */

  public void setNonWorkDays(NonWorkDaysObjectData NonWorkDaysUpdateInIn) {
    NonWorkDaysUpdateIn = NonWorkDaysUpdateInIn;
  }

  public void translateFromMap() {
    NonWorkDaysUpdateIn = NonWorkDaysObjectHelper.fromMap(inputMap, "NonWorkDays");
  }

/**
 *
 * Gets the NonWorkDays
 * @return Value of the NonWorkDays
 *
 */

  public NonWorkDaysObjectData getNonWorkDays( ) {
    return NonWorkDaysUpdateIn;
  }

}
