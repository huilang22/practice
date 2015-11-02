/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcContentTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcContentTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcContentTypeObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcContentTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcContentTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcContentTypeObjectKeyData GetInIn) {
    super(id, context, "CtcContentTypeGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcContentTypeObjectKeyData").get("CtcContentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcContentType
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcContentType(CtcContentTypeObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcContentTypeObjectKeyHelper.fromMap(inputMap, "CtcContentType");
  }

/**
 *
 * Gets the CtcContentType
 * @return Value of the CtcContentType
 *
 */

  public CtcContentTypeObjectKeyData getCtcContentType( ) {
    return GetIn;
  }

}
