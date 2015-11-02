/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentGetBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentObjectKeyData getIn;
/**
 *
 * Constructor to create a  PrepaymentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentObjectKeyData getInIn) {
    super(id, context, "PrepaymentGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(getIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }


/**
 *
 * Sets the Prepayment
 * @param getInIn Value of the getIn
 *
 */

  public void setPrepayment(PrepaymentObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = PrepaymentObjectKeyHelper.fromMap(inputMap, "Prepayment");
  }

/**
 *
 * Gets the Prepayment
 * @return Value of the Prepayment
 *
 */

  public PrepaymentObjectKeyData getPrepayment( ) {
    return getIn;
  }

}
