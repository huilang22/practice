/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemUrlGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemUrlGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemUrlObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcItemUrlGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemUrlGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectKeyData GetInIn) {
    super(id, context, "CtcItemUrlGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemUrlObjectKeyData").get("CtcItemUrlObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcItemUrl
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcItemUrl(CtcItemUrlObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcItemUrlObjectKeyHelper.fromMap(inputMap, "CtcItemUrl");
  }

/**
 *
 * Gets the CtcItemUrl
 * @return Value of the CtcItemUrl
 *
 */

  public CtcItemUrlObjectKeyData getCtcItemUrl( ) {
    return GetIn;
  }

}
