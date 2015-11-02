/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysGetBulkUdtTemplateItem.java
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
 * Class used to create a NonWorkDaysGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NonWorkDaysGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NonWorkDaysObjectKeyData NonWorkDaysGetIn;
/**
 *
 * Constructor to create a  NonWorkDaysGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NonWorkDaysGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectKeyData NonWorkDaysGetInIn) {
    super(id, context, "NonWorkDaysGet");
    NonWorkDaysGetIn = NonWorkDaysGetInIn;
  }

  public void translateToMap() {
    if (NonWorkDaysGetIn != null) {
      NonWorkDaysGetIn.resetFlags(true, true);
      addInput("NonWorkDays", NonWorkDaysObjectKeyHelper.toMap(NonWorkDaysGetIn, new HashMap(), "NonWorkDaysObjectKeyData").get("NonWorkDaysObjectKeyData"));
    }
  }


/**
 *
 * Sets the NonWorkDays
 * @param NonWorkDaysGetInIn Value of the NonWorkDaysGetIn
 *
 */

  public void setNonWorkDays(NonWorkDaysObjectKeyData NonWorkDaysGetInIn) {
    NonWorkDaysGetIn = NonWorkDaysGetInIn;
  }

  public void translateFromMap() {
    NonWorkDaysGetIn = NonWorkDaysObjectKeyHelper.fromMap(inputMap, "NonWorkDays");
  }

/**
 *
 * Gets the NonWorkDays
 * @return Value of the NonWorkDays
 *
 */

  public NonWorkDaysObjectKeyData getNonWorkDays( ) {
    return NonWorkDaysGetIn;
  }

}
