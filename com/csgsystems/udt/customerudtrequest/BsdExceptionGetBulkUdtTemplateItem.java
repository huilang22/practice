/*
 * Generated code DO NOT EDIT
 * Generated file: BsdExceptionGetBulkUdtTemplateItem.java
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
import com.csgsystems.sfq.data.*;

/**
 *
 * Class used to create a BsdExceptionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdExceptionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdExceptionObjectKeyData BsdExceptionGetExtIn;
/**
 *
 * Constructor to create a  BsdExceptionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdExceptionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdExceptionObjectKeyData BsdExceptionGetExtInIn) {
    super(id, context, "BsdExceptionGet");
    BsdExceptionGetExtIn = BsdExceptionGetExtInIn;
  }

  public void translateToMap() {
    if (BsdExceptionGetExtIn != null) {
      BsdExceptionGetExtIn.resetFlags(true, true);
      addInput("BsdException", BsdExceptionObjectKeyHelper.toMap(BsdExceptionGetExtIn, new HashMap(), "BsdExceptionObjectKeyData").get("BsdExceptionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdException
 * @param BsdExceptionGetExtInIn Value of the BsdExceptionGetExtIn
 *
 */

  public void setBsdException(BsdExceptionObjectKeyData BsdExceptionGetExtInIn) {
    BsdExceptionGetExtIn = BsdExceptionGetExtInIn;
  }

  public void translateFromMap() {
    BsdExceptionGetExtIn = BsdExceptionObjectKeyHelper.fromMap(inputMap, "BsdException");
  }

/**
 *
 * Gets the BsdException
 * @return Value of the BsdException
 *
 */

  public BsdExceptionObjectKeyData getBsdException( ) {
    return BsdExceptionGetExtIn;
  }

}
