/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlGetBulkUdtTemplateItem.java
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
