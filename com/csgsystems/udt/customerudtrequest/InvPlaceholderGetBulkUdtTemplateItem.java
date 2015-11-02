/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderGetBulkUdtTemplateItem.java
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
 * Class used to create a InvPlaceholderGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvPlaceholderGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectKeyData getIn;
/**
 *
 * Constructor to create a  InvPlaceholderGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvPlaceholderGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectKeyData getInIn) {
    super(id, context, "InvPlaceholderGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectKeyHelper.toMap(getIn, new HashMap(), "InvPlaceholderObjectKeyData").get("InvPlaceholderObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param getInIn Value of the getIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = InvPlaceholderObjectKeyHelper.fromMap(inputMap, "InvPlaceholder");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectKeyData getInvPlaceholder( ) {
    return getIn;
  }

}
