/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a InvPlaceholderCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvPlaceholderCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectData createIn;
/**
 *
 * Constructor to create a  InvPlaceholderCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvPlaceholderCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectData createInIn) {
    super(id, context, "InvPlaceholderCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(createIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param createInIn Value of the createIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectData getInvPlaceholder( ) {
    return createIn;
  }

}
