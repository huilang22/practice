/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a TransSourceTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class TransSourceTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransSourceTypeObjectData TSUpdateIn;
/**
 *
 * Constructor to create a  TransSourceTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransSourceTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectData TSUpdateInIn) {
    super(id, context, "TransSourceTypeUpdate");
    TSUpdateIn = TSUpdateInIn;
  }

  public void translateToMap() {
    if (TSUpdateIn != null) {
      TSUpdateIn.resetFlags(true, true);
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSUpdateIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }


/**
 *
 * Sets the TransSourceType
 * @param TSUpdateInIn Value of the TSUpdateIn
 *
 */

  public void setTransSourceType(TransSourceTypeObjectData TSUpdateInIn) {
    TSUpdateIn = TSUpdateInIn;
  }

  public void translateFromMap() {
    TSUpdateIn = TransSourceTypeObjectHelper.fromMap(inputMap, "TransSourceType");
  }

/**
 *
 * Gets the TransSourceType
 * @return Value of the TransSourceType
 *
 */

  public TransSourceTypeObjectData getTransSourceType( ) {
    return TSUpdateIn;
  }

}
