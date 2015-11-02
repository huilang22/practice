/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewAttributesGetBulkUdtTemplateItem.java
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
 * Class used to create a CcViewAttributesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewAttributesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewAttributesObjectKeyData CVAget_In;
/**
 *
 * Constructor to create a  CcViewAttributesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewAttributesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectKeyData CVAget_InIn) {
    super(id, context, "CcViewAttributesGet");
    CVAget_In = CVAget_InIn;
  }

  public void translateToMap() {
    if (CVAget_In != null) {
      CVAget_In.resetFlags(true, true);
      addInput("CcViewAttributes", CcViewAttributesObjectKeyHelper.toMap(CVAget_In, new HashMap(), "CcViewAttributesObjectKeyData").get("CcViewAttributesObjectKeyData"));
    }
  }


/**
 *
 * Sets the CcViewAttributes
 * @param CVAget_InIn Value of the CVAget_In
 *
 */

  public void setCcViewAttributes(CcViewAttributesObjectKeyData CVAget_InIn) {
    CVAget_In = CVAget_InIn;
  }

  public void translateFromMap() {
    CVAget_In = CcViewAttributesObjectKeyHelper.fromMap(inputMap, "CcViewAttributes");
  }

/**
 *
 * Gets the CcViewAttributes
 * @return Value of the CcViewAttributes
 *
 */

  public CcViewAttributesObjectKeyData getCcViewAttributes( ) {
    return CVAget_In;
  }

}
