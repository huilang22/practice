/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamGetBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataParamGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPDObjectKeyData PDGetIn;
/**
 *
 * Constructor to create a  ExtendedDataParamGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamGetBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectKeyData PDGetInIn) {
    super(id, context, "ExtendedDataParamGet");
    PDGetIn = PDGetInIn;
  }

  public void translateToMap() {
    if (PDGetIn != null) {
      PDGetIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectKeyHelper.toMap(PDGetIn, new HashMap(), "XPDObjectKeyData").get("XPDObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExtendedDataParam
 * @param PDGetInIn Value of the PDGetIn
 *
 */

  public void setExtendedDataParam(XPDObjectKeyData PDGetInIn) {
    PDGetIn = PDGetInIn;
  }

  public void translateFromMap() {
    PDGetIn = XPDObjectKeyHelper.fromMap(inputMap, "ExtendedDataParam");
  }

/**
 *
 * Gets the ExtendedDataParam
 * @return Value of the ExtendedDataParam
 *
 */

  public XPDObjectKeyData getExtendedDataParam( ) {
    return PDGetIn;
  }

}
