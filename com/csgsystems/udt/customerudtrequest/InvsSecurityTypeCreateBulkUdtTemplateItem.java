/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSecurityTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSecurityTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSecurityTypeObjectData InvsSecurityTypeCreateIn;
/**
 *
 * Constructor to create a  InvsSecurityTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSecurityTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectData InvsSecurityTypeCreateInIn) {
    super(id, context, "InvsSecurityTypeCreate");
    InvsSecurityTypeCreateIn = InvsSecurityTypeCreateInIn;
  }

  public void translateToMap() {
    if (InvsSecurityTypeCreateIn != null) {
      InvsSecurityTypeCreateIn.resetFlags(true, true);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeCreateIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }


/**
 *
 * Sets the InvsSecurityType
 * @param InvsSecurityTypeCreateInIn Value of the InvsSecurityTypeCreateIn
 *
 */

  public void setInvsSecurityType(InvsSecurityTypeObjectData InvsSecurityTypeCreateInIn) {
    InvsSecurityTypeCreateIn = InvsSecurityTypeCreateInIn;
  }

  public void translateFromMap() {
    InvsSecurityTypeCreateIn = InvsSecurityTypeObjectHelper.fromMap(inputMap, "InvsSecurityType");
  }

/**
 *
 * Gets the InvsSecurityType
 * @return Value of the InvsSecurityType
 *
 */

  public InvsSecurityTypeObjectData getInvsSecurityType( ) {
    return InvsSecurityTypeCreateIn;
  }

}
