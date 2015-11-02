/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a TransSourceTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class TransSourceTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransSourceTypeObjectKeyData TSGetIn;
/**
 *
 * Constructor to create a  TransSourceTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransSourceTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectKeyData TSGetInIn) {
    super(id, context, "TransSourceTypeGet");
    TSGetIn = TSGetInIn;
  }

  public void translateToMap() {
    if (TSGetIn != null) {
      TSGetIn.resetFlags(true, true);
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(TSGetIn, new HashMap(), "TransSourceTypeObjectKeyData").get("TransSourceTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the TransSourceType
 * @param TSGetInIn Value of the TSGetIn
 *
 */

  public void setTransSourceType(TransSourceTypeObjectKeyData TSGetInIn) {
    TSGetIn = TSGetInIn;
  }

  public void translateFromMap() {
    TSGetIn = TransSourceTypeObjectKeyHelper.fromMap(inputMap, "TransSourceType");
  }

/**
 *
 * Gets the TransSourceType
 * @return Value of the TransSourceType
 *
 */

  public TransSourceTypeObjectKeyData getTransSourceType( ) {
    return TSGetIn;
  }

}
