/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysFindBulkUdtTemplateItem.java
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
 * Class used to create a NonWorkDaysFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NonWorkDaysFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NonWorkDaysObjectFilter NonWorkDaysFindIn;
/**
 *
 * Constructor to create a  NonWorkDaysFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NonWorkDaysFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectFilter NonWorkDaysFindInIn) {
    super(id, context, "NonWorkDaysFind");
    NonWorkDaysFindIn = NonWorkDaysFindInIn;
  }

  public void translateToMap() {
    if (NonWorkDaysFindIn != null) {
      Integer index =  NonWorkDaysFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysFindIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }


/**
 *
 * Sets the NonWorkDays
 * @param NonWorkDaysFindInIn Value of the NonWorkDaysFindIn
 *
 */

  public void setNonWorkDays(NonWorkDaysObjectFilter NonWorkDaysFindInIn) {
    NonWorkDaysFindIn = NonWorkDaysFindInIn;
  }

  public void translateFromMap() {
    NonWorkDaysFindIn = NonWorkDaysObjectHelper.fromMapFilter(inputMap, "NonWorkDays");
  }

/**
 *
 * Gets the NonWorkDays
 * @return Value of the NonWorkDays
 *
 */

  public NonWorkDaysObjectFilter getNonWorkDays( ) {
    return NonWorkDaysFindIn;
  }

}
