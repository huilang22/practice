/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayObjectKeyData BDdelete_In;
/**
 *
 * Constructor to create a  BusinessDayDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectKeyData BDdelete_InIn) {
    super(id, context, "BusinessDayDelete");
    BDdelete_In = BDdelete_InIn;
  }

  public void translateToMap() {
    if (BDdelete_In != null) {
      BDdelete_In.resetFlags(true, true);
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(BDdelete_In, new HashMap(), "BusinessDayObjectKeyData").get("BusinessDayObjectKeyData"));
    }
  }


/**
 *
 * Sets the BusinessDay
 * @param BDdelete_InIn Value of the BDdelete_In
 *
 */

  public void setBusinessDay(BusinessDayObjectKeyData BDdelete_InIn) {
    BDdelete_In = BDdelete_InIn;
  }

  public void translateFromMap() {
    BDdelete_In = BusinessDayObjectKeyHelper.fromMap(inputMap, "BusinessDay");
  }

/**
 *
 * Gets the BusinessDay
 * @return Value of the BusinessDay
 *
 */

  public BusinessDayObjectKeyData getBusinessDay( ) {
    return BDdelete_In;
  }

}
