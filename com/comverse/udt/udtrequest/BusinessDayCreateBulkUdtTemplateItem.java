/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayCreateBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayObjectData BDcreate_In;
/**
 *
 * Constructor to create a  BusinessDayCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectData BDcreate_InIn) {
    super(id, context, "BusinessDayCreate");
    BDcreate_In = BDcreate_InIn;
  }

  public void translateToMap() {
    if (BDcreate_In != null) {
      BDcreate_In.resetFlags(true, true);
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDcreate_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }


/**
 *
 * Sets the BusinessDay
 * @param BDcreate_InIn Value of the BDcreate_In
 *
 */

  public void setBusinessDay(BusinessDayObjectData BDcreate_InIn) {
    BDcreate_In = BDcreate_InIn;
  }

  public void translateFromMap() {
    BDcreate_In = BusinessDayObjectHelper.fromMap(inputMap, "BusinessDay");
  }

/**
 *
 * Gets the BusinessDay
 * @return Value of the BusinessDay
 *
 */

  public BusinessDayObjectData getBusinessDay( ) {
    return BDcreate_In;
  }

}
