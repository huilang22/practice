/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BusinessDayDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BusinessDayDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BusinessDayObjectData noOpIn;

/**
 *
 * Constructor to create a   BusinessDayDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BusinessDayDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectData noOpInIn) {
    super(id, context, "BusinessDayDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(noOpIn, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
/**
 *
 * Sets the  BusinessDay
 * @param noOpInIn BusinessDayObjectData to set
 *
 */
  public void setBusinessDay(BusinessDayObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BusinessDay passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayObjectData getBusinessDay() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BusinessDayObjectHelper.fromMap(inputMap, "BusinessDay");
  }
}
