/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CtmParamTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmParamTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmParamTypeObjectKeyData CtmParamTypeGetIn;
/**
 *
 * Constructor to create a  CtmParamTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmParamTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamTypeObjectKeyData CtmParamTypeGetInIn) {
    super(id, context, "CtmParamTypeGet");
    CtmParamTypeGetIn = CtmParamTypeGetInIn;
  }

  public void translateToMap() {
    if (CtmParamTypeGetIn != null) {
      CtmParamTypeGetIn.resetFlags(true, true);
      addInput("CtmParamType", CtmParamTypeObjectKeyHelper.toMap(CtmParamTypeGetIn, new HashMap(), "CtmParamTypeObjectKeyData").get("CtmParamTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtmParamType
 * @param CtmParamTypeGetInIn Value of the CtmParamTypeGetIn
 *
 */

  public void setCtmParamType(CtmParamTypeObjectKeyData CtmParamTypeGetInIn) {
    CtmParamTypeGetIn = CtmParamTypeGetInIn;
  }

  public void translateFromMap() {
    CtmParamTypeGetIn = CtmParamTypeObjectKeyHelper.fromMap(inputMap, "CtmParamType");
  }

/**
 *
 * Gets the CtmParamType
 * @return Value of the CtmParamType
 *
 */

  public CtmParamTypeObjectKeyData getCtmParamType( ) {
    return CtmParamTypeGetIn;
  }

}
