/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataParamDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPDObjectData PDDeleteIn;
/**
 *
 * Constructor to create a  ExtendedDataParamDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectData PDDeleteInIn) {
    super(id, context, "ExtendedDataParamDelete");
    PDDeleteIn = PDDeleteInIn;
  }

  public void translateToMap() {
    if (PDDeleteIn != null) {
      PDDeleteIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDDeleteIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }


/**
 *
 * Sets the ExtendedDataParam
 * @param PDDeleteInIn Value of the PDDeleteIn
 *
 */

  public void setExtendedDataParam(XPDObjectData PDDeleteInIn) {
    PDDeleteIn = PDDeleteInIn;
  }

  public void translateFromMap() {
    PDDeleteIn = XPDObjectHelper.fromMap(inputMap, "ExtendedDataParam");
  }

/**
 *
 * Gets the ExtendedDataParam
 * @return Value of the ExtendedDataParam
 *
 */

  public XPDObjectData getExtendedDataParam( ) {
    return PDDeleteIn;
  }

}
