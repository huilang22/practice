/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeObjectKeyData InvsTypeGetIn;
/**
 *
 * Constructor to create a  InvsTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectKeyData InvsTypeGetInIn) {
    super(id, context, "InvsTypeGet");
    InvsTypeGetIn = InvsTypeGetInIn;
  }

  public void translateToMap() {
    if (InvsTypeGetIn != null) {
      InvsTypeGetIn.resetFlags(true, true);
      addInput("InvsType", InvsTypeObjectKeyHelper.toMap(InvsTypeGetIn, new HashMap(), "InvsTypeObjectKeyData").get("InvsTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsType
 * @param InvsTypeGetInIn Value of the InvsTypeGetIn
 *
 */

  public void setInvsType(InvsTypeObjectKeyData InvsTypeGetInIn) {
    InvsTypeGetIn = InvsTypeGetInIn;
  }

  public void translateFromMap() {
    InvsTypeGetIn = InvsTypeObjectKeyHelper.fromMap(inputMap, "InvsType");
  }

/**
 *
 * Gets the InvsType
 * @return Value of the InvsType
 *
 */

  public InvsTypeObjectKeyData getInvsType( ) {
    return InvsTypeGetIn;
  }

}
