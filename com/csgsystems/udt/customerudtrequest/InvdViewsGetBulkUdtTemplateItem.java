/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectKeyData InvdViewsGetIn;
/**
 *
 * Constructor to create a  InvdViewsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectKeyData InvdViewsGetInIn) {
    super(id, context, "InvdViewsGet");
    InvdViewsGetIn = InvdViewsGetInIn;
  }

  public void translateToMap() {
    if (InvdViewsGetIn != null) {
      InvdViewsGetIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(InvdViewsGetIn, new HashMap(), "InvdViewsObjectKeyData").get("InvdViewsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsGetInIn Value of the InvdViewsGetIn
 *
 */

  public void setInvdViews(InvdViewsObjectKeyData InvdViewsGetInIn) {
    InvdViewsGetIn = InvdViewsGetInIn;
  }

  public void translateFromMap() {
    InvdViewsGetIn = InvdViewsObjectKeyHelper.fromMap(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectKeyData getInvdViews( ) {
    return InvdViewsGetIn;
  }

}
