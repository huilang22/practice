/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcContentTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcContentTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcContentTypeObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcContentTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcContentTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectData UpdateInIn) {
    super(id, context, "CtcContentTypeUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }


/**
 *
 * Sets the CtcContentType
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcContentType(CtcContentTypeObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcContentTypeObjectHelper.fromMap(inputMap, "CtcContentType");
  }

/**
 *
 * Gets the CtcContentType
 * @return Value of the CtcContentType
 *
 */

  public CtcContentTypeObjectData getCtcContentType( ) {
    return UpdateIn;
  }

}
