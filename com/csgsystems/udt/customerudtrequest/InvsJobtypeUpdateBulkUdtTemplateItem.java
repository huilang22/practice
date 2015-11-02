/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobtypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobtypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobtypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobtypeObjectData InvsJobtypeUpdateIn;
/**
 *
 * Constructor to create a  InvsJobtypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobtypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobtypeObjectData InvsJobtypeUpdateInIn) {
    super(id, context, "InvsJobtypeUpdate");
    InvsJobtypeUpdateIn = InvsJobtypeUpdateInIn;
  }

  public void translateToMap() {
    if (InvsJobtypeUpdateIn != null) {
      InvsJobtypeUpdateIn.resetFlags(true, true);
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(InvsJobtypeUpdateIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }


/**
 *
 * Sets the InvsJobtype
 * @param InvsJobtypeUpdateInIn Value of the InvsJobtypeUpdateIn
 *
 */

  public void setInvsJobtype(InvsJobtypeObjectData InvsJobtypeUpdateInIn) {
    InvsJobtypeUpdateIn = InvsJobtypeUpdateInIn;
  }

  public void translateFromMap() {
    InvsJobtypeUpdateIn = InvsJobtypeObjectHelper.fromMap(inputMap, "InvsJobtype");
  }

/**
 *
 * Gets the InvsJobtype
 * @return Value of the InvsJobtype
 *
 */

  public InvsJobtypeObjectData getInvsJobtype( ) {
    return InvsJobtypeUpdateIn;
  }

}
