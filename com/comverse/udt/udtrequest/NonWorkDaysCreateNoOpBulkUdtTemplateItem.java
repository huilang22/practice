/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NonWorkDaysCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NonWorkDaysCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NonWorkDaysObjectData noOpIn;

/**
 *
 * Constructor to create a   NonWorkDaysCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NonWorkDaysCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NonWorkDaysObjectData noOpInIn) {
    super(id, context, "NonWorkDaysCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(noOpIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
/**
 *
 * Sets the  NonWorkDays
 * @param noOpInIn NonWorkDaysObjectData to set
 *
 */
  public void setNonWorkDays(NonWorkDaysObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NonWorkDays passed into the constructor
 * @return Simulated response
 *
 */
  public NonWorkDaysObjectData getNonWorkDays() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NonWorkDaysObjectHelper.fromMap(inputMap, "NonWorkDays");
  }
}
