/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeObjectData InvsTypeCreateIn;
/**
 *
 * Constructor to create a  InvsTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData InvsTypeCreateInIn) {
    super(id, context, "InvsTypeCreate");
    InvsTypeCreateIn = InvsTypeCreateInIn;
  }

  public void translateToMap() {
    if (InvsTypeCreateIn != null) {
      InvsTypeCreateIn.resetFlags(true, true);
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeCreateIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }


/**
 *
 * Sets the InvsType
 * @param InvsTypeCreateInIn Value of the InvsTypeCreateIn
 *
 */

  public void setInvsType(InvsTypeObjectData InvsTypeCreateInIn) {
    InvsTypeCreateIn = InvsTypeCreateInIn;
  }

  public void translateFromMap() {
    InvsTypeCreateIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsType");
  }

/**
 *
 * Gets the InvsType
 * @return Value of the InvsType
 *
 */

  public InvsTypeObjectData getInvsType( ) {
    return InvsTypeCreateIn;
  }

}
