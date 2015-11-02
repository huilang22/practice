/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeObjectData InvsContainerTypeUpdateIn;
/**
 *
 * Constructor to create a  InvsContainerTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectData InvsContainerTypeUpdateInIn) {
    super(id, context, "InvsContainerTypeUpdate");
    InvsContainerTypeUpdateIn = InvsContainerTypeUpdateInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeUpdateIn != null) {
      InvsContainerTypeUpdateIn.resetFlags(true, true);
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeUpdateIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }


/**
 *
 * Sets the InvsContainerType
 * @param InvsContainerTypeUpdateInIn Value of the InvsContainerTypeUpdateIn
 *
 */

  public void setInvsContainerType(InvsContainerTypeObjectData InvsContainerTypeUpdateInIn) {
    InvsContainerTypeUpdateIn = InvsContainerTypeUpdateInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeUpdateIn = InvsContainerTypeObjectHelper.fromMap(inputMap, "InvsContainerType");
  }

/**
 *
 * Gets the InvsContainerType
 * @return Value of the InvsContainerType
 *
 */

  public InvsContainerTypeObjectData getInvsContainerType( ) {
    return InvsContainerTypeUpdateIn;
  }

}
