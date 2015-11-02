/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CtmParamGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamBaseObjectKeyData CtmParamGetIn;
/**
 *
 * Constructor to create a  CtmParamGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamBaseObjectKeyData CtmParamGetInIn) {
    super(id, context, "CtmParamGet");
    CtmParamGetIn = CtmParamGetInIn;
  }

  public void translateToMap() {
    if (CtmParamGetIn != null) {
      CtmParamGetIn.resetFlags(true, true);
      addInput("CtmParam", CtmParamBaseObjectKeyHelper.toMap(CtmParamGetIn, new HashMap(), "CtmParamBaseObjectKeyData").get("CtmParamBaseObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtmParam
 * @param CtmParamGetInIn Value of the CtmParamGetIn
 *
 */

  public void setCtmParam(CtmParamBaseObjectKeyData CtmParamGetInIn) {
    CtmParamGetIn = CtmParamGetInIn;
  }

  public void translateFromMap() {
    CtmParamGetIn = CtmParamBaseObjectKeyHelper.fromMap(inputMap, "CtmParam");
  }

/**
 *
 * Gets the CtmParam
 * @return Value of the CtmParam
 *
 */

  public CtmParamBaseObjectKeyData getCtmParam( ) {
    return CtmParamGetIn;
  }

}
