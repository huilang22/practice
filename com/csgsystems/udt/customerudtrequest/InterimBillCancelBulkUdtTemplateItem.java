/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillCancelBulkUdtTemplateItem.java
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
 * Class used to create a InterimBillCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class InterimBillCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InterimBillObjectKeyData intBillDelIn;
/**
 *
 * Constructor to create a  InterimBillCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InterimBillCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, InterimBillObjectKeyData intBillDelInIn) {
    super(id, context, "InterimBillCancel");
    intBillDelIn = intBillDelInIn;
  }

  public void translateToMap() {
    if (intBillDelIn != null) {
      intBillDelIn.resetFlags(true, true);
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(intBillDelIn, new HashMap(), "InterimBillObjectKeyData").get("InterimBillObjectKeyData"));
    }
  }


/**
 *
 * Sets the InterimBill
 * @param intBillDelInIn Value of the intBillDelIn
 *
 */

  public void setInterimBill(InterimBillObjectKeyData intBillDelInIn) {
    intBillDelIn = intBillDelInIn;
  }

  public void translateFromMap() {
    intBillDelIn = InterimBillObjectKeyHelper.fromMap(inputMap, "InterimBill");
  }

/**
 *
 * Gets the InterimBill
 * @return Value of the InterimBill
 *
 */

  public InterimBillObjectKeyData getInterimBill( ) {
    return intBillDelIn;
  }

}
