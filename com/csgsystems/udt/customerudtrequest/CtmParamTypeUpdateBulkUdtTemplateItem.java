/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtmParamTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamTypeObjectData CtmParamTypeUpdateIn;
/**
 *
 * Constructor to create a  CtmParamTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectData CtmParamTypeUpdateInIn) {
    super(id, context, "CtmParamTypeUpdate");
    CtmParamTypeUpdateIn = CtmParamTypeUpdateInIn;
  }

  public void translateToMap() {
    if (CtmParamTypeUpdateIn != null) {
      CtmParamTypeUpdateIn.resetFlags(true, true);
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(CtmParamTypeUpdateIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }


/**
 *
 * Sets the CtmParamType
 * @param CtmParamTypeUpdateInIn Value of the CtmParamTypeUpdateIn
 *
 */

  public void setCtmParamType(CtmParamTypeObjectData CtmParamTypeUpdateInIn) {
    CtmParamTypeUpdateIn = CtmParamTypeUpdateInIn;
  }

  public void translateFromMap() {
    CtmParamTypeUpdateIn = CtmParamTypeObjectHelper.fromMap(inputMap, "CtmParamType");
  }

/**
 *
 * Gets the CtmParamType
 * @return Value of the CtmParamType
 *
 */

  public CtmParamTypeObjectData getCtmParamType( ) {
    return CtmParamTypeUpdateIn;
  }

}
