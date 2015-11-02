/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectFilter InvdViewsFindIn;
/**
 *
 * Constructor to create a  InvdViewsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectFilter InvdViewsFindInIn) {
    super(id, context, "InvdViewsFind");
    InvdViewsFindIn = InvdViewsFindInIn;
  }

  public void translateToMap() {
    if (InvdViewsFindIn != null) {
      Integer index =  InvdViewsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsFindIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsFindInIn Value of the InvdViewsFindIn
 *
 */

  public void setInvdViews(InvdViewsObjectFilter InvdViewsFindInIn) {
    InvdViewsFindIn = InvdViewsFindInIn;
  }

  public void translateFromMap() {
    InvdViewsFindIn = InvdViewsObjectHelper.fromMapFilter(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectFilter getInvdViews( ) {
    return InvdViewsFindIn;
  }

}
