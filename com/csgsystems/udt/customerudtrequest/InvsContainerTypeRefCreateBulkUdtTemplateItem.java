/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsContainerTypeRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsContainerTypeRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsContainerTypeRefObjectData InvsContainerTypeRefCreateIn;
/**
 *
 * Constructor to create a  InvsContainerTypeRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsContainerTypeRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectData InvsContainerTypeRefCreateInIn) {
    super(id, context, "InvsContainerTypeRefCreate");
    InvsContainerTypeRefCreateIn = InvsContainerTypeRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsContainerTypeRefCreateIn != null) {
      InvsContainerTypeRefCreateIn.resetFlags(true, true);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefCreateIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }


/**
 *
 * Sets the InvsContainerTypeRef
 * @param InvsContainerTypeRefCreateInIn Value of the InvsContainerTypeRefCreateIn
 *
 */

  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectData InvsContainerTypeRefCreateInIn) {
    InvsContainerTypeRefCreateIn = InvsContainerTypeRefCreateInIn;
  }

  public void translateFromMap() {
    InvsContainerTypeRefCreateIn = InvsContainerTypeRefObjectHelper.fromMap(inputMap, "InvsContainerTypeRef");
  }

/**
 *
 * Gets the InvsContainerTypeRef
 * @return Value of the InvsContainerTypeRef
 *
 */

  public InvsContainerTypeRefObjectData getInvsContainerTypeRef( ) {
    return InvsContainerTypeRefCreateIn;
  }

}
