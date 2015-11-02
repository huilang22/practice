/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a InterimBillGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectKeyData getIn;
/**
 *
 * Constructor to create a  InterimBillGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectKeyData getInIn) {
    super(id, context, "InterimBillGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(getIn, new HashMap(), "InterimBillObjectKeyData").get("InterimBillObjectKeyData"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param getInIn Value of the getIn
 *
 */

  public void setInterimBill(InterimBillObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = InterimBillObjectKeyHelper.fromMap(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectKeyData getInterimBill( ) {
    return getIn;
  }

}
