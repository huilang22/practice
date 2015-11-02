/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeGetBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcUrlTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcUrlTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcUrlTypeObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcUrlTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcUrlTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectKeyData GetInIn) {
    super(id, context, "CtcUrlTypeGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcUrlTypeObjectKeyData").get("CtcUrlTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcUrlType
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcUrlType(CtcUrlTypeObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcUrlTypeObjectKeyHelper.fromMap(inputMap, "CtcUrlType");
  }

/**
 *
 * Gets the CtcUrlType
 * @return Value of the CtcUrlType
 *
 */

  public CtcUrlTypeObjectKeyData getCtcUrlType( ) {
    return GetIn;
  }

}
