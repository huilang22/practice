/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementReturnBulkUdtTemplateItem.java
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
 * Class used to create a InvElementReturnBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementReturnBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvRtnIn;
/**
 *
 * Constructor to create a  InvElementReturnBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementReturnBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvRtnInIn) {
    super(id, context, "InvElementReturn");
    InvRtnIn = InvRtnInIn;
  }

  public void translateToMap() {
    if (InvRtnIn != null) {
      InvRtnIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvRtnIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvRtnInIn Value of the InvRtnIn
 *
 */

  public void setInvElement(InvElementObjData InvRtnInIn) {
    InvRtnIn = InvRtnInIn;
  }

  public void translateFromMap() {
    InvRtnIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvRtnIn;
  }

}
