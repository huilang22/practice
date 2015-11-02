/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationInvAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationInvAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationInvAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationInvAssocObjectKeyData InvsLocationInvAssocGetIn;
/**
 *
 * Constructor to create a  InvsLocationInvAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationInvAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectKeyData InvsLocationInvAssocGetInIn) {
    super(id, context, "InvsLocationInvAssocGet");
    InvsLocationInvAssocGetIn = InvsLocationInvAssocGetInIn;
  }

  public void translateToMap() {
    if (InvsLocationInvAssocGetIn != null) {
      InvsLocationInvAssocGetIn.resetFlags(true, true);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectKeyHelper.toMap(InvsLocationInvAssocGetIn, new HashMap(), "InvsLocationInvAssocObjectKeyData").get("InvsLocationInvAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationInvAssoc
 * @param InvsLocationInvAssocGetInIn Value of the InvsLocationInvAssocGetIn
 *
 */

  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectKeyData InvsLocationInvAssocGetInIn) {
    InvsLocationInvAssocGetIn = InvsLocationInvAssocGetInIn;
  }

  public void translateFromMap() {
    InvsLocationInvAssocGetIn = InvsLocationInvAssocObjectKeyHelper.fromMap(inputMap, "InvsLocationInvAssoc");
  }

/**
 *
 * Gets the InvsLocationInvAssoc
 * @return Value of the InvsLocationInvAssoc
 *
 */

  public InvsLocationInvAssocObjectKeyData getInvsLocationInvAssoc( ) {
    return InvsLocationInvAssocGetIn;
  }

}
