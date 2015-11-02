/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSecurityTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSecurityTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSecurityTypeObjectKeyData InvsSecurityTypeGetIn;
/**
 *
 * Constructor to create a  InvsSecurityTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSecurityTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectKeyData InvsSecurityTypeGetInIn) {
    super(id, context, "InvsSecurityTypeGet");
    InvsSecurityTypeGetIn = InvsSecurityTypeGetInIn;
  }

  public void translateToMap() {
    if (InvsSecurityTypeGetIn != null) {
      InvsSecurityTypeGetIn.resetFlags(true, true);
      addInput("InvsSecurityType", InvsSecurityTypeObjectKeyHelper.toMap(InvsSecurityTypeGetIn, new HashMap(), "InvsSecurityTypeObjectKeyData").get("InvsSecurityTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSecurityType
 * @param InvsSecurityTypeGetInIn Value of the InvsSecurityTypeGetIn
 *
 */

  public void setInvsSecurityType(InvsSecurityTypeObjectKeyData InvsSecurityTypeGetInIn) {
    InvsSecurityTypeGetIn = InvsSecurityTypeGetInIn;
  }

  public void translateFromMap() {
    InvsSecurityTypeGetIn = InvsSecurityTypeObjectKeyHelper.fromMap(inputMap, "InvsSecurityType");
  }

/**
 *
 * Gets the InvsSecurityType
 * @return Value of the InvsSecurityType
 *
 */

  public InvsSecurityTypeObjectKeyData getInvsSecurityType( ) {
    return InvsSecurityTypeGetIn;
  }

}
