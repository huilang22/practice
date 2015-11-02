/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayGetBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayObjectKeyData BDget_In;
/**
 *
 * Constructor to create a  BusinessDayGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectKeyData BDget_InIn) {
    super(id, context, "BusinessDayGet");
    BDget_In = BDget_InIn;
  }

  public void translateToMap() {
    if (BDget_In != null) {
      BDget_In.resetFlags(true, true);
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(BDget_In, new HashMap(), "BusinessDayObjectKeyData").get("BusinessDayObjectKeyData"));
    }
  }


/**
 *
 * Sets the BusinessDay
 * @param BDget_InIn Value of the BDget_In
 *
 */

  public void setBusinessDay(BusinessDayObjectKeyData BDget_InIn) {
    BDget_In = BDget_InIn;
  }

  public void translateFromMap() {
    BDget_In = BusinessDayObjectKeyHelper.fromMap(inputMap, "BusinessDay");
  }

/**
 *
 * Gets the BusinessDay
 * @return Value of the BusinessDay
 *
 */

  public BusinessDayObjectKeyData getBusinessDay( ) {
    return BDget_In;
  }

}
