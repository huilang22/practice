/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobErrorMaxErrorCountBulkUdtTemplateItem.java
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
 * Class used to create a InvJobErrorMaxErrorCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobErrorMaxErrorCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobErrorObjectKeyData InvJobErrorMaxIn;
/**
 *
 * Constructor to create a  InvJobErrorMaxErrorCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobErrorMaxErrorCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectKeyData InvJobErrorMaxInIn) {
    super(id, context, "InvJobErrorMaxErrorCount");
    InvJobErrorMaxIn = InvJobErrorMaxInIn;
  }

  public void translateToMap() {
    if (InvJobErrorMaxIn != null) {
      InvJobErrorMaxIn.resetFlags(true, true);
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(InvJobErrorMaxIn, new HashMap(), "InvJobErrorObjectKeyData").get("InvJobErrorObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvJobError
 * @param InvJobErrorMaxInIn Value of the InvJobErrorMaxIn
 *
 */

  public void setInvJobError(InvJobErrorObjectKeyData InvJobErrorMaxInIn) {
    InvJobErrorMaxIn = InvJobErrorMaxInIn;
  }

  public void translateFromMap() {
    InvJobErrorMaxIn = InvJobErrorObjectKeyHelper.fromMap(inputMap, "InvJobError");
  }

/**
 *
 * Gets the InvJobError
 * @return Value of the InvJobError
 *
 */

  public InvJobErrorObjectKeyData getInvJobError( ) {
    return InvJobErrorMaxIn;
  }

}
