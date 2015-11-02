/*
 * Generated code DO NOT EDIT
 * Generated file: CtcUrlTypeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcUrlTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcUrlTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcUrlTypeObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcUrlTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcUrlTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectData UpdateInIn) {
    super(id, context, "CtcUrlTypeUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }


/**
 *
 * Sets the CtcUrlType
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcUrlType(CtcUrlTypeObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcUrlTypeObjectHelper.fromMap(inputMap, "CtcUrlType");
  }

/**
 *
 * Gets the CtcUrlType
 * @return Value of the CtcUrlType
 *
 */

  public CtcUrlTypeObjectData getCtcUrlType( ) {
    return UpdateIn;
  }

}
